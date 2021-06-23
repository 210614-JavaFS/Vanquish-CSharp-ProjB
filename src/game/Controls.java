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
	
	/**
	 * Process input 
	 * @param command go north, west, south, east
	 * @param player
	 */
	public static void processInput(String[] command, Player player) {
		
		switch(command[0]) {
		
			//NOTE. Go to other room
			case "go":
				switch (command[1]) {
					case "north":
						if (player.currentRoom.getExit("north") != null) {
							player.currentRoom = player.currentRoom.getExit("north");
						} else {
							System.out.println("There is nothing over here. Get back");
						}
						break;
					case "east":
						if (player.currentRoom.getExit("east") != null) {
							player.currentRoom = player.currentRoom.getExit("east");
						} else {
							System.out.println("There is nothing over here. Get back");
						}
						break;
						
					case "south":
						if (player.currentRoom.getExit("south") != null) {
							player.currentRoom = player.currentRoom.getExit("south");
						} else {
							System.out.println("There is nothing over here. Get back");
						}
						break;
						
					case "west":
						if (player.currentRoom.getExit("west") != null) {
							player.currentRoom = player.currentRoom.getExit("west");
						} else {
							System.out.println("There is nothing over here. Get back!!");
						}
						break;
				}
				break;
				
			//NOTE. Interact with object
			
			case "1":
				player.currentRoom.interact(0);
				break;
			
			case "2":
				player.currentRoom.interact(1);
				break;
				
			//NOTE. Exit the game	
			case "exit":
				System.out.println("Game: Game is now exited. Press Play to start over");
				player.gameStatus = false;
				break;
			default:
				System.out.println("Invalid input. Type in 'go + direction' ");
		}
	}	
		
}
