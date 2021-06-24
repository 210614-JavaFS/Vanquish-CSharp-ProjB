package fixtures.rooms;

import fixtures.object.Interactive;


/**	
 * /
 * @author Billy;
 * @apiNote This how our custom should look like
 */


public class LivingRoom extends fixtures.rooms.Room {
	
	public LivingRoom()  {
		super("The Living Room",
			"short description: a simple living room",
			"long description: Place holder description" + "\n");
		//this.exits[1] = RoomFactory.getRoom(“Dining Room”);		
	}

	@Override
	public void interactwith() {
		// TODO Auto-generated method stub
		
	}

	
}
