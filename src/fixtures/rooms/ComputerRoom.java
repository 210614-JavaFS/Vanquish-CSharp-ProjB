package fixtures.rooms;

import fixtures.object.Interactive;

public class ComputerRoom extends fixtures.rooms.Room implements Interactive{
	ComputerRoom[] exits;
		
//	// 3. Computer Room
//	this.rooms[5] = computerroom;
//	// Computer Room's exits
//	computerroom.setExit(null, mancave, livingroom, library);
//	Computer computer = new  Computer();
//	Printer printer = new Printer();	
//	computerroom.setMethod(computer,printer);
	
	
	
	public ComputerRoom() {
			super(
				"Computer Room", 
				"personal computer room ",
				"A computer room for public use. User can print house blueprints. \n"		
			+   "The door to the east leads to the Man Cave. \n"
			+   "The door to the south leads to the living room. \n"
				); 
		
		//this.exits[0] = RoomManager(?Living Room?);
		//this.exits[3] = RoomManager(?Man Cave Room?);
		
	}

	@Override
	public void interactwith() {
		System.out.println("You have switched on the computer");
		this.longDescription = "A computer for public use. User can print house blueprints.  \n"
				+  "The computer is currently turned on. \n";
		
	}
}
