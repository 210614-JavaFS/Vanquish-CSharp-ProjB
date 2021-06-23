package fixtures.object;

import fixtures.Fixture;

public class Table  extends Fixture implements Interactive {
  
	
	
	public Table(){
		super();
		this.name = "Table";
		this.shortDescription = "A white table is the end of the bathroom";
        this.longDescription = "The table is white with some flowers on top of it. It is currently painted.";
       
    }
	

   public void interactWith(){
	System.out.print("You have put some different flowers on top of the table.");
    this.longDescription = "The table is broken and painted therefore is not available to use.";
    }
}


