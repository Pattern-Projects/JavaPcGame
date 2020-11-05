package pkg;

import java.util.Scanner;

public final class GameLogic {
	
	public void gameMenu() {
		System.out.print("Start : 1\nExit : 2\n=> ");
		int opt = 1;
		Scanner input = new Scanner(System.in);
		opt = input.nextInt();
		
		switch(opt) {
		case 1:
			return;
			
		case 2:
			input.close();
			System.exit(0);
		}
		
	}
	
	public void characterCreation() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name\n=> ");
		String name = input.nextLine();
		
		System.out.println("Enter your story\n=> ");
		String story = input.nextLine();
		
		Player.initialize("name", "story"); //Initializes Player
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GameLogic game = new GameLogic();
		game.gameMenu();
		game.characterCreation();
		
		
		
		while(true) {
			//Game Happens
			break;
		}
		input.close();
	}
}
