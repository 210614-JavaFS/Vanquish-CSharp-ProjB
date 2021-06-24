package fixtures.rooms;

import fixtures.Fixture;

public class YogaRoom extends fixtures.rooms.Room{

	public YogaRoom() {
		// TODO Auto-generated constructor stub
		super("Yoga Room", 
			"For meditation.", 
			"The southernmost room with a mat that's specifically made for meditation. To it's north is the living room. " + "\n" + "Also, to its right exit is the bathroom, " + "\n" + "and to its left is the Dinning room.");
	}
    public void interactwith() {
    	
    }
}

////1. Instantiate you room
//YogaRoom yogaroom = new YogaRoom();
////2. assign your room to the array rooms[]
//this.rooms[8] = yogaroom;
////3. assign the exits to your room
//yogaroom.setExit(livingroom, diningroom, null , bathroom);
////4. instantiate your objects inside room
//YogaMat yogaMat = new YogaMat();
//Lamp yogaLamp = new Lamp();
////5. assign your objects to your room
//yogaroom.setMethod(yogaMat, yogaLamp);