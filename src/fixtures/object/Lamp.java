
package fixtures.object;

import fixtures.Fixture;

public class Lamp extends Fixture implements Interactive {

	public Lamp() {
		super();
		this.name = "Lamp";
		this.shortDescription = "A pink lamp on the end table";
		this.longDescription = "The lamp here is a soft pink sitting on an oak end table. It" + " is currently turned off.";
		
	}

	@Override
	public void interactWith() {
		System.out.println("You turn on the lamp");
		this.longDescription = "The lamp here is a soft pink sitting on an oak end table. It" + " is currently turned on.";
	}
	public void infoName() {
		System.out.println(this.longDescription );
	}

	@Override
	public void showItems() {
		System.out.println("Items:");
		System.out.println(this.name);
		
	}
}

