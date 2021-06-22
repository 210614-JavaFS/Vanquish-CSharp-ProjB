
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
		
		System.out.println("Game: You can type 'go north, west, east, south'. Type 'exit' to quit game.");
		Controls.printRoom(newPlayer);
		System.out.println("Short Description: " + newPlayer.currentRoom.getShortDescription());
		System.out.println("Long Description: " + newPlayer.currentRoom.getLongDescription());
		System.out.println("Game: Please specify where you want to go next");

		newPlayer.currentRoom.objectList.get(0).name;
		
		newPlayer.currentRoom.interact(0);
		newPlayer.currentRoom.interact(1);
		
	}
}

