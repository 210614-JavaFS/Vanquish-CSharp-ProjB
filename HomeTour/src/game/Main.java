package game;

import java.util.Scanner;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	public static Player player;
	
	public static void main(String[] args) {		
		//	RoomManager newGame = new RoomManager();
		//newGame.init();
	
		
	Main start = new Main();
	start.startTour();

		//printRoom(Player newPlayer);
	
	};
		
	private void startTour() {			
		Scanner readLine = new Scanner(System.in);
		
		System.out.println("         Welcome to the Home Tour");
		System.out.println("         ======================= \n");	
		System.out.println("Please choose from the foolowing options \n");
		
		if(player == null) {
			System.out.println("1. Create Player");
			System.out.println("2. Exit Tour");
		}
		
		
		
		
		//int answer = readLine.nextInt();
		 
	};
		
	private static void printRoom(Player newPlayer) {
		System.out.println("You are currently in room " + newPlayer.currentRoom);
	};

//	private static String[] collectInput() {
	//	return null;
		
	
	
	//}
		
	 //private static void parse(String[] command, Player player) {
 
	 //}

	
};
