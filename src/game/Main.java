
package game;

public class Main {
	
	public static void main(String[] args) {
		
		//instantiate our new game with Room Manager
		RoomManager newGame = new RoomManager();
		//invoke and set the rooms information to our object newGame
		newGame.init();
		
		//Make new player and set our current room as starting room
		Player newPlayer = new Player();
		newPlayer.currentRoom = newGame.startingRoom;

		
		System.out.println("Welcome to the Hall Tour. Type to follow the directions");
		Controls.enterName(newPlayer);
		System.out.println("Hello, " + newPlayer.name + ". Welcome to our castle");
		
		while (newPlayer.gameStatus) {
			System.out.println("Game Tip: You can type 'go north, west, east, south'. Type 'exit' to quit game.");
			System.out.println("Game Tip: To interact with room objects, type the number of your option ( 1 or 2). Type 'exit' to quit game.");
			System.out.println("--------");
			Controls.printRoom(newPlayer);
			System.out.println("--------");
			System.out.println("Short Description: " + newPlayer.currentRoom.getShortDescription());
			System.out.println("Long Description: " + newPlayer.currentRoom.getLongDescription());
			System.out.println("------------------------");
			Controls.printObjects(newPlayer);
			System.out.println("Game: Please specify where you want to do next");
			
			Controls.processInput(Controls.collectInput(), newPlayer);
		}

		
	}
}

