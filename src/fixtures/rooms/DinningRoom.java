package fixtures.rooms;

public class DinningRoom extends fixtures.rooms.Room{
	
	//The room is located on the south of kitchen.
	public DinningRoom() {
		super("Dinning Room",
				"A classic formal dinning room",
				"The room has a darken curtain and elegant furnitures, chandelier lighting, china cabinet for storage of fine "
				+ "pieces and dishes. A note on a rectangular table.");
	}

	@Override
	public void interactwith() {
		
		
	}
}