package fixtures.rooms;



	
		/**	
		 * /
		 * @author Darnell;
		 */


		public class BedroomChamber extends fixtures.rooms.Room {
			
			public BedroomChamber()  {
				super("A Bedroom Chamber",
					"a large bedroom chamber",
					"This bedroom chamber is a large bedroom in a colonial house. A mancave is open to the north, where a television can be seen." + "\n"
					+ "The hardwood floor leads west into doorway, and you can go back to the living room" + "\n"
					+ "If you go south, you will see the dining room for feast.");
				//this.exits[1] = RoomFactory.getRoom(?Man Cave?);
			}

       @Override
       public void interactwith(){
    	  	             
   }

}

//BedroomChamber bedroomchamber = new BedroomChamber();
//this.rooms[6] = bedroomchamber;
//bedroomchamber.setExit(library, ManCave, LivingRoom, DiningRoom, null;
//PlayStation bedroomchamberPlayStation = new PlayStation();
//bedroomchamber.setMethod(bedroomchamberPlayStation, bedroomchamberController);




