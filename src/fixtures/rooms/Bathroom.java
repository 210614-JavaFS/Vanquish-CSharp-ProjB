package fixtures.rooms;

public class Bathroom extends fixtures.Fixture {
	
	Bathroom[] exits;
	  
	//public RoomObjects[] objects = new RoomObjects[2];
	
	public Bathroom(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Bathroom[4]; // size is your choice
		
	}
		
}
