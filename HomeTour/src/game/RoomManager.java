package game;

import com.revature.hometours.fixtures.objects.Computer;
import com.revature.hometours.fixtures.rooms.ComputerRoom;
import com.revature.hometours.fixtures.rooms.Room;

public class RoomManager {
	Room startingRoom;	
	Room[] rooms = new Room[8];

	public void init() {
	    ComputerRoom pcRoom = new ComputerRoom();	    
	    this.rooms[1] = pcRoom;	    
	    
	  //Objects
	    Computer pcRoomComputer = new Computer();	    
	    
	    //set Exit
	    pcRoom.setExit(null, null, null, null);
	    
	    //set objects to room
	    pcRoom.setMethod(pcRoomComputer);   
	}

	public static String getRoom(String room) {
		// TODO Auto-generated method stub
		return room;
	}
		
}
