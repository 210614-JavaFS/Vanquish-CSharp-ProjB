package fixtures.object;

import fixtures.Fixture;

public class Table  extends Fixture implements Interactive {
  
	
	public Table(){
		super();
		this.name = "Table";
		this.shortDescription = "A white table is the end of the bathroom";
        this.longDescription = "The table is white with some flowrs on top of it. It“ + “ is currently painted.";
        //this.exits[1] = RoomFactory.getRoom("Dining Room");
    }

	@Override
	public void interactwith() {
		System.out.println("A small white table is in the bathroom.");
		
	}
	



}


