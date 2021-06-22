package fixtures.rooms;

public class Bethroom extends fixtures.Fixture {
	
	Bethroom[] exits;
	  
	//public RoomObjects[] objects = new RoomObjects[2];
	
	public Bethroom(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Bethroom[4]; // size is your choice
		
	}
		
	public Bethroom[] getExits() {
		return exits;
		
	}
		
	public Bethroom[] getExit(String direction) {
		return exits;
		
	}
	
	public void setExit(Bethroom north, Bethroom east, Bethroom south, Bethroom west) {
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;
	}

}
