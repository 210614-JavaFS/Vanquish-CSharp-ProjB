package fixtures.object;

import fixtures.Fixture;

public class Table  extends Fixture implements Interactive {
  
	
	
	


	@Override
	public void interactwith() {
		// TODO Auto-generated method stub
		
	}
	
	public Table(){
		super();
		this.name = "Lamp";
		this.shortDescription = "A pink lamp on the end table";
        this.longDescription = "The lamp here is a soft pink sitting on an oak end table. It“ + “ is currently turned off.";
        //this.exits[1] = RoomFactory.getRoom("Dining Room");
    }
	

public void interactWith(){
	System.out.print("You have turned on the lamp.");
    this.longDescription = "The lamp here is a soft pink sitting on an oak end table. It” + “ is currently turned on.";
    }
}


