package fixtures.rooms;

import java.util.ArrayList;
import java.util.Collection;

import fixtures.object.Interactive;

public class Room extends fixtures.Fixture {
	
	public Room[] exits;

	public ArrayList<Interactive> methodList = new ArrayList<Interactive>();
	public ArrayList<Object> objectList = new ArrayList<Object>();
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; 
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
	public void setMethod(Interactive object1, Interactive object2) {
		this.methodList.add(object1);
		this.methodList.add(object2);
	}
	public void setObject(Object object1, Object object2) {
		this.objectList.add(object1);
		this.objectList.add(object2);
	}	
	
	
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
	
	//interact with room objects
	public void interact(int objectIndex) {
		this.methodList.get(objectIndex).interactwith();
	}
	
	//show room objects' description
//	public void showObjectShortDesc(int objectIndex) {
//		this.objectList.get(objectIndex).name;
//	}
}
