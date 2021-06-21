package fixtures.rooms;
/**	
 * /
 * @author Billy;
 * @apiNote This how our custom should look like
 */


public class Foyer extends fixtures.rooms.Room {
	
	public Foyer()  {
		super("The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
		//this.exits[1] = RoomFactory.getRoom(“Dining Room”);
	}

}
