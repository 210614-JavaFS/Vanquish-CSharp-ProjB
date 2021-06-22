package fixtures.rooms;

public class Bathroom extends fixtures.Fixture {
	
	Bathroom[] exits;
	  
	//public RoomObjects[] objects = new RoomObjects[2];
	
	public Bathroom(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Bathroom[4]; // size is your choice
		
	}
		
	
	/**
	 * set Exit directions to the room.
	 * @param north
	 * @param east
	 * @param south
	 * @param west
	 */
	
	public void setExit(Bathroom north, Bathroom east, Bathroom south, Bathroom west) {
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;
	}

}
