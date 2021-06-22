package fixtures.rooms;

public class Room extends fixtures.Fixture {
	
	public Room[] exits;
//	public RoomObjects[] objects = new RoomObjects[2];

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size of the exits inside 1 room.
//		this.objects = new Object[2];
	}
	
	/**
	 * set Exit directions to the room.
	 * @param north
	 * @param east
	 * @param south
	 * @param west
	 */
	public void setExit(Room north, Room east, Room south, Room west) {
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;
	}
	
	//working in progress.
//	public void setObject(Objects) {
//		// TODO Auto-generated method stub
//
//	}
	
	
	//return our direction
	//get Exit return this.exits;
	public Room[] getExits() {
		return this.exits;
	}
	
	public Room getExit(String direction) {
		
		switch(direction) {
			case "north":
				return this.exits[0];
			case "east":
				return this.exits[1];
			case "south":
				return this.exits[2];
			case "west":
				return this.exits[3];
		}
		return null;
	}
	
	
}
