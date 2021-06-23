package fixtures.rooms;

import fixtures.object.Interactive;
import fixtures.object.Lamp;

/**	
 * /
 * @author Billy;
 * @apiNote This how our custom should look like
 */


public class LivingRoom extends fixtures.rooms.Room {
	
	public LivingRoom()  {
		super("The Living Room",
			"a simple living room",
			"Place holder description" + "\n");
		//this.exits[1] = RoomFactory.getRoom(“Dining Room”);
	}

	@Override
	public void interactwith() {
		// TODO Auto-generated method stub
		
	}

	
}
