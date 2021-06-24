package fixtures.object;

import fixtures.Fixture;

public class Computer extends Fixture implements Interactive{
	
	public boolean powerOn;
	public String model;
	
	public Computer() {
		super();
		this.powerOn = false;
		this.name = "Computer";
		this.shortDescription = "Turn on the computer and it to house blueprints.";
		this.longDescription = "A computer for publc use. User can print house blueprints. \n"
				+  "The computer is currently turned on?. \n" + powerOn;
			
		this.model = "AMD Ryzen 9 5900X";
	}
		
	public void interactWith() {
		System.out.println("You have switched on the computer");
		powerOn=true;
		if(powerOn) {
			this.longDescription = "A computer for publc use. User can print house blueprints.  \n"
					+  "The computer is currently turned on. \n" + powerOn;
		}

	}

	@Override
	public void interactwith() {
		// TODO Auto-generated method stub
		
	}
}
