package fixtures.rooms;

public class DinningRoom extends fixtures.rooms.Room{
	
	//The room is located on the south of kitchen.
	public DinningRoom() {
		super("Dinning Room",
				"A classic formal dinning room",
				"The room has a darken curtain and elegant furnitures, chandelier lighting, china cabinet for storage of fine "
				+ "pieces and dishes. A note on a rectangular table."
				+ "Take the north exit to Kitchen or west exit to Yoga Room.");
	}
	
	
	//For the use of RoomManager.java 
	
//	DinningRoom dinningroom = new DinningRoom();
//	this.rooms[7] = dinningroom;
//	dinningroom.setExit("kitchen",null,null,yogaroom);
//	Curtain dinningCurtain = new Curtain();
//	Note dinningNote = new Note();
//	dinningroom.setMethod(dinningCurtain,dinningNote);
	
	
	
}
