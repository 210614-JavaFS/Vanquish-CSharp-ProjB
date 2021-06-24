package fixtures.rooms;

/**
 * /
 * 
 * @author Billy;
 * @apiNote This how our custom should look like
 */

public class LivingRoom extends fixtures.rooms.Room {
	
	public LivingRoom()  {
		super("The Living Room",
			"A simple living room for our humble guests",
			"This living room is the starting point for our adventurers. There isn't much here but you can interact with the objects." + "\n"
			+ "if you go North, you will encounter our computer room. Our castle is prepared for our modern guests." + "\n"
			+ "if you go East, you will see see our bedroom chamber that is prepared for our top class." + "\n"
			+ "if you go South, you will be able to meditate in our Yoga room." + "\n"
			+ "if yo go West, you can read our books in our lirary room.");
	}

	@Override
	public void interactwith() {
		// TODO Auto-generated method stub

	}

}