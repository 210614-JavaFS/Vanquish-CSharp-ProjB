package fixtures.rooms;
import fixtures.object.Interactive;

public class ComputerRoom extends fixtures.rooms.Room implements Interactive{
	ComputerRoom[] exits;
	
	public ComputerRoom() {
			super(
				"Computer Room", 
				"personal computer room ",
				"A computer room for public use. User can print documents or house blueprints. \n"
			+   "The computer is currently turned off. \n"
				); 
		
		//this.exits[0] = RoomFactory.getRoom(“Living Room”);
		//this.exits[3] = RoomFactory.getRoom(“Man Cave Room”);
		
	}

	@Override
	public void interactwith() {
		System.out.println("You have switched on the computer");
		this.longDescription = "A computer for public use. User can print house blueprints.  \n"
				+  "The computer is currently turned on. \n";
		
	}
}
