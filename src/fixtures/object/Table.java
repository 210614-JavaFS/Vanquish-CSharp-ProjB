package fixtures.object;

import fixtures.Fixture;

public class Table  extends Fixture implements Interactive {
  
	@Override
    public void interactWith() {
		// TODO Auto-generated method stub
		System.out.println("A small white table is in the bathroom.");
		
	}
	
	public Table(){
		super();
		this.name = "Table";
		this.shortDescription = "A white table is the end of the bathroom";
        this.longDescription = "The table is white with some flowrs on top of it. It“ + “ is currently painted.";
        //this.exits[1] = RoomFactory.getRoom("Dining Room");
    }
	

public void interactWith1(){
	System.out.print("You have put some different flows on top of the table.");
    this.longDescription = "The table is white with some flowrs on top of it. It“ + “ is currently painted.";
    }

@Override
public void infoName() {
	// TODO Auto-generated method stub
}

@Override
public void showItems() {
	// TODO Auto-generated method stub
	
}
}


