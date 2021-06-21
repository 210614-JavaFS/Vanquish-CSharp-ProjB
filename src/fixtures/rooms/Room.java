package fixtures.rooms;

public class Room extends fixtures.Fixture {
	
	public Room[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
	}
		
	public Room[] getExits() {
		
		return null;
		
	}
		
	public Room getExit(String direction) {
		
		return null;	
	}
	

}
