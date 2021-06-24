package com.revature.hometours.fixtures.rooms;

import com.revature.hometours.fixtures.objects.Interactive;
import com.revature.hometours.fixtures.objects.Printer;

import game.RoomManager;

public class ComputerRoom extends Room{

	//private Interactive printer = new Printer();

	//Whatever interactive object you have made for the room.
	
	public ComputerRoom() {
		super(	"The Computer Room", 
				"a personal computer room ",
				"A computer room for public use. User can print house blueprints. \n"			
			+   "The door to the east leads to the Man Cave. \n"
			+   "The door to the south leads to the living room. \n"
			+   "The door to the west leads to the library room. \n"
						);
//		this.exits[1] = RoomManager.getRoom("man cave");
//		this.exits[2] = RoomManager.getRoom("living room");
//		this.exits[3] = RoomManager.getRoom("library");
		
		
	}

	@Override
	public void exitRoom(String room) {
		System.out.println("You are exiting Computer Room to " + room);		
	}

	public void print(String bluePrint) {
		System.out.println("You are printing " + bluePrint);		
	}		
	
	


}
