package fixtures.rooms;

/**
 * Object's Description
 * @author Raquel
 * @param Class Bathroom
 * @param constructor Bathroom 
 */

public class Bathroom extends fixtures.rooms.Room {

	public Bathroom() {

		super("The Bathroom", "is now a renewed and well painted", "I also have change some furniture for the bathroom"
				+ "\n" + " Take to north exit to the library room" + " Take to east exit to the Yoga room.");

	}

	@Override
	public void interactwith() {

	}

	/*
	 * 1. Instantiate you room Bathroom bathroom = new Bathroom(); 2. assign your
	 * room to the array rooms[] this.rooms[5] = bathroom; 3. assign the exits to
	 * your room bathroom.setExit(library, yoga, null , null); 4. instantiate your
	 * objects inside room Table bathroomTable = new Table(); Lamp bathroomLamp =
	 * new Lamp(); 5. assign your objects to your room
	 * bathroom.setMethod(bathroomTable, bathroomLamp);
	 */

}
