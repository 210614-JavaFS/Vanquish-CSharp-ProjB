package fixtures.rooms;

import fixtures.object.Interactive;

public class ManCaveRoom extends fixtures.rooms.Room{
	
		public ManCaveRoom() {
			
		super("The ManCave Room",
				"a relaxing area",
				"design to feel relax and pursue hobbies , a very comfortable space." + "\n"
				+ "The rug on the  floor leads east and points directly to the bedroom doorway." + "\n"
				+ "go west to PC room, where you can see a diamond shape mirror on the door looking at you or go south to exit to the bedroom.");
	
	   
	}

		@Override
		public void interactwith() {
			// TODO Auto-generated method stub
			
		}

}

////1. Instantiate you room
//ManCaveRoom mancaveroom= new ManCaveRoom();
////2. assign your room to the array rooms[]
//this.rooms[3] = mancaveroom;
////3. assign the exits to your room
//mancaveroom.setExit(null, null, Bedroom , PCRoom);
////4. instantiate your objects inside room
//Television mountedTelevision = new Television();
//Recliner reclinerChair = new Recliner();
////5. assign your objects to your room
//mancaveroom.setMethod(reclinerChair, mountedTelevision);




                                                                         