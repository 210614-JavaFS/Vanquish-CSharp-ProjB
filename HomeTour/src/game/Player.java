package game;

import com.revature.hometours.fixtures.rooms.Room;

public class Player {
	
	public String name;
	
	public Room currentRoom;

	public String getName() {
	return name;
}
	

	public Player() {
		super();
		
	}
	public Player(String name, Room currentRoom) {
		super();
		this.name = name;
		this.currentRoom = currentRoom;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	public boolean playerStatus = true;
}
