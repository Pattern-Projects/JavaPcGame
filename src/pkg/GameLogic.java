package pkg;

import java.util.Scanner;

public final class GameLogic {
	
	
	//Singleton START
		private static GameLogic single_instance  = null;
		public static GameLogic getInstance() 
	    { 
	        if (single_instance == null) 
	            single_instance = new GameLogic(); 
	  
	        return single_instance; 
	    } 
	//Singleton END
	
	private void gameMenu(Scanner input) {
		System.out.print("Start : 1\nExit : 2\n=> ");
		int opt = 1;
		opt = input.nextInt();
		
		switch(opt) {
		case 1:
			return;
		case 2:
			input.close();
			System.out.print("Thank you for playing this game!");
			System.exit(0);
		}
		return;
	}
	
	private void characterCreation(Scanner input) {
		System.out.print("Enter your name\n=> ");
		String name = input.nextLine();
		name = input.nextLine();
		
		System.out.print("Enter your story\n=> ");
		String story = input.nextLine();
		
		Player.initialize(name, story); //Initializes Player
		
	}

	private void startGame(Scanner input) {
		int opt = 1;
		Enemy A = new Enemy(20, 1000, 70, 34, 2346);
		Friendly B = new Friendly("Lotrak", 3,30,20,0);
		System.out.print("\n An ally with level 3\nAn oponent wiht level 20\n");
		
		while(true) {
			System.out.println("You have: " + 
					Player.getInstance().getHealth() + " Health " +
					Player.getInstance().getArmor() + " Armor " +
					Player.getInstance().getDamage() + " Damage ");
			System.out.print("What do you choose to do:\n"
					+ "1 - Attack Enemy with: " + Player.getInstance().getDamage() + "\n=> ");
			
			opt = input.nextInt();
			if(opt == 1)
				Player.getInstance().attackEnemy(A);
			if(B.getHealth()>=0)
				A.attackFriendly(B);
			else
				A.attackPlayer();
		}
	}
	
	public void lostGame() {
		System.out.print("You Died!");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		GameLogic.getInstance().gameMenu(input);
		GameLogic.getInstance().characterCreation(input);
		GameLogic.getInstance().startGame(input);
		
		input.close();
	}
}
