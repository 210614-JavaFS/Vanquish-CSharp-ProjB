package game;

import fixtures.object.Drawer;
import fixtures.object.Lamp;
import fixtures.rooms.Foyer;
import fixtures.rooms.Room;

public class RoomManager {
	Room startingRoom;
	
	Room[] rooms = new Room[8];
	
	public void init() {
		
		//Room
	    Foyer foyer = new Foyer();
	    this.rooms[0] = foyer;
	    this.startingRoom = foyer;
	    
	    //Objects
	    Lamp lamp = new Lamp();
	    Drawer drawer = new Drawer();
	
	    //set Exit 
	    //north, east, south, east
	    foyer.setExit(null, null, null, null);
	    //foyer.setObject();

	}
}