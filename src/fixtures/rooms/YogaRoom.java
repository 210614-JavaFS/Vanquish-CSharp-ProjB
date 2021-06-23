package fixtures.rooms;

import fixtures.Fixture;

public class YogaRoom extends fixtures.rooms.Room{

	public YogaRoom() {
		// TODO Auto-generated constructor stub
		super("Yoga Room", 
			"Short Description: For meditation.", 
			"Long Descripption: A place with a mat. South of the main room. " + "\n" + "take the right exit for going to the bathroom" + "\n" + "take the left exit to go to the Dinning room");
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