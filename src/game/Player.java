package game;

import fixtures.rooms.Room;

public class Player {
	public static String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Room currentRoom;
	boolean gameStatus = true;
}
