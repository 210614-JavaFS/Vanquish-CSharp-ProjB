package fixtures.object;

import fixtures.Fixture;

public class Printer extends Fixture implements Interactive {	

	public boolean powerOn;
	public int numPages = 100;
	
	public Printer() {
		super();
		this.name = "Printer";
		this.shortDescription = "Print house blueprints.";
		this.longDescription = "Print house blueprints.";
	}
	
	
	public Printer(boolean powerOn, int numPages) {
		super();
		this.powerOn = powerOn;
		this.numPages = numPages;
		this.name = "Printer";
		this.shortDescription = "Print house blueprints.";
		this.longDescription = "A Printer for publc use. User can print house blueprints. \n"
				+  "The printer is currently turned on? " + powerOn + "\n"
			+ "The printer has " + numPages + " pages left in the tray.";
	}

	@Override
	public void interactwith() {
		powerOn = true;
		if (powerOn) {
			numPages = numPages - 5;
			System.out.println("Printing house blue prints \n"
			+ "The printer has " + numPages + " pages left in the tray.");
		}
	
		
	}
	
}