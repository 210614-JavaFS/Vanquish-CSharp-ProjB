package fixtures.object;

import fixtures.Fixture;

public class Printer extends Fixture implements Interactive {
	
	public boolean powerOn;
	public int numPages;
		
	public Printer() {
		super();
		this.powerOn = false;
		this.numPages = 100;
		this.name = "Printer";
		this.shortDescription = "Print house blueprints.";
		this.longDescription = "A Printer for publc use. User can print house blueprints. \n"
				+  "The printer is currently turned on?. " + this.powerOn  + " \n"
			+ "The printer has " + this.numPages + " pages left in the tray.";
	}

	@Override
	public void interactwith() {
		powerOn = true;
		
		if (this.powerOn) {
			this.numPages = this.numPages - 5;
			System.out.println("Printing house blue prints \n"
			+ "The printer has " + this.numPages + " pages left in the tray.");
		}
		this.longDescription = "The printer is currently turned on?. \n" + this.powerOn + " \n" 
				+ "Printing castle blueprints. \n"
				+ "The printer has " + this.numPages + " pages left in the tray.";
		
	}
	
}