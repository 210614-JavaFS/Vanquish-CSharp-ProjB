package fixtures.object;

import fixtures.Fixture;

public class Drawer extends Fixture implements Interactive{
	public Drawer() {
		super();
		this.name = "Drawer";
		this.shortDescription = "A small drawer";
		this.longDescription = "A small drawer with 1 drawer slider" + ". You haven't opened it yet";
		
	}

	@Override
	public void interactWith() {
		System.out.println("You've removed the drawer slide and found nothing.");
		
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
