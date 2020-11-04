package pkg;

import java.util.Scanner;

public final class GameLogic {
	
	public void GameMenu() {
		System.out.print("Start : 1\nExit : 2\n=> ");
		int opt = 1;
		Scanner input = new Scanner(System.in);
		opt = input.nextInt();
		switch(opt) {
		case 1:
			//game starts
			break;
		case 2:
			System.exit(0);
		}
		input.close();
	}

	public static void main(String[] args) {
		GameLogic game = new GameLogic();
		
		game.GameMenu();
		
		//int opt = 1;
		//Scanner input = new Scanner(System.in);
		//opt = input.nextInt();
		//TODO Gives ERROR
		
		//System.out.print("Enter your name\n=> ");
		////Scanner input = new Scanner(System.in);
		//String name = input.nextLine();
		//System.out.print("Enter your name\n=> ");
		//String story = input.nextLine();
		
		Player.initialize("name", "story"); //Initializes Player
		
		while(true) {
			//Game Happens
			break;
		}

	}

}
