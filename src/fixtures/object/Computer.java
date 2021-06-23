package fixtures.object;

import fixtures.Fixture;

public class Computer extends Fixture implements Interactive{

	
	public Computer() {
		super();
		this.name = "Computer";
		this.shortDescription = "Turn on the computer and it to print documents or  house blueprints.";
		this.longDescription = "A computer for publc use. User can print house blueprints. \n"
				+  "The computer is currently turned off. \n";
		
	}

	@Override
	public void interactwith() {
		System.out.println("You have turned on the computer");
		this.longDescription = "A computer for publc use. User can print house blueprints. \n"
				+  "The computer is currently turned on. \n";
		
	}
}
