
package game;

import fixtures.object.*;
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
	    //foyer.interactWith();
	    //Lamp foyerLamp = new Lamp();
	    //Drawer foyerDrawer = new Drawer();

	
	    //set Exit 
	    //north, east, south, east
	    foyer.setExit(null, null, null, null);
	    
	    //set objects to room
	    //foyer.setObject(foyerLamp, foyerDrawer);
	    
	}

}