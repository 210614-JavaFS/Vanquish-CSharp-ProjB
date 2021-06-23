package game;

import fixtures.object.Drawer;
import fixtures.object.Lamp;
import fixtures.object.Table;
import fixtures.rooms.Bathroom;
import fixtures.rooms.LivingRoom;
import fixtures.rooms.Room;

public class RoomManager {
	Room startingRoom;
	
	Room[] rooms = new Room[8];
	
	public void init() {
		
		//LivingRoom
	    LivingRoom livingRoom = new LivingRoom();
	    this.rooms[0] = livingRoom;
	    this.startingRoom = livingRoom;
	    //Objects
	    Lamp LivingRoomLamp = new Lamp();
	    Drawer LivingRoomLampDrawer = new Drawer();
	  
	    
	    //set Exit 
	    //north, east, south, west
	   
	    livingRoom.setExit(null, null, null, null);

	    //set objects to room
	    livingRoom.setMethod(LivingRoomLamp, LivingRoomLampDrawer);
	   

//	    //1. Instantiate you room
	    Bathroom bathroom = new Bathroom();
//	    //2. assign your room to the array rooms[]
	    this.rooms[1] = bathroom;
//	    //3. assign the exits to your room
	    bathroom.setExit(null, null, null , null);
//	    //4. instantiate your objects inside room
	    Table bathroomTable = new Table();
	    Lamp bathroomLamp = new Lamp();
//	    //5. assign your objects to your room
         bathroom.setMethod(bathroomTable, bathroomLamp);
	    
	}
}