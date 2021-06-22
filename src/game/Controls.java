package game;

import java.util.Scanner;

public class Controls {
	public static void printRoom(Player newPlayer) {
		System.out.println("You are current in room: " + newPlayer.currentRoom.getName());
		
	}
	
	public static void enterName(Player newPlayer) {
		System.out.println("Please enter your name, adventurer");
		Scanner in = new Scanner(System.in);
		String playerInput = in.nextLine();
		
		newPlayer.name = playerInput;
		System.out.println("Your Player's name is " + newPlayer.name);
	}

	public static String[] collectInput() {
		Scanner in = new Scanner(System.in);

		String playerInput = in.nextLine().toLowerCase();
		
		String[] parts = playerInput.split(" ");
		
		return parts;
	}
		
	
		
}
