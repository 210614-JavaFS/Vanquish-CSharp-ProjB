package fixtures.object;

import fixtures.Fixture;

public class Drawer extends Fixture implements Interactive{
	public Drawer() {
		super();
		this.name = "Drawer";
		this.shortDescription = "A small drawer";
		this.longDescription = "A small drawer with 1 drawer slider. You haven't opened it yet";
		
	}

	@Override
	public void interactwith() {
		System.out.println("You've removed the drawer slide and found nothing.");
		this.longDescription = "A small drawer with 1 drawer slider. You have already opened it.";
		
	}
	
	
}
