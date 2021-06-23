package fixtures.rooms;

import fixtures.Fixture;
import fixtures.object.Interactive;

public class ComputerRoom extends Fixture implements Interactive{

	public ComputerRoom() {
		super();
		this.name = "Computer";
		this.shortDescription = "Turn on the computer and it to print documents or  house blueprints.";
		this.longDescription = "A computer for publc use. User can print house blueprints. \n"
				+  "The computer is currently turned off. \n"; 
		
		//this.exits[0] = RoomFactory.getRoom(“Living Room”);
		//this.exits[0] = RoomFactory.getRoom(“Man Cave Room”);
		
	}

	@Override
	public void interactwith() {
		System.out.println("You have switched on the computer");
		this.longDescription = "A computer for publc use. User can print house blueprints.  \n"
				+  "The computer is currently turned on. \n";
		
	}
}
