package com.revature.hometours.fixtures.objects;

import com.revature.hometours.fixtures.Fixture;

public class Printer extends Fixture implements Interactive {

	public boolean powerOn;
	public int numPages = 100;
	
	public Printer() {
		super();	
	}
	
	
	public Printer(boolean powerOn, int numPages) {
		super();
		this.powerOn = powerOn;
		this.numPages = numPages;
		this.name = "Printer";
		this.shortDescription = "Print house blueprints.";
		this.longDescription = "A Printer for publc use. User can print house blueprints. \n"
				+  "The printer is currently turned on?. \n" + powerOn
			+ "The printer has " + numPages + " pages left in the tray.";
	}


	public void interactWith() {
		powerOn = true;
		if (powerOn) {
			numPages = numPages - 5;
			System.out.println("Printing house blue prints \n"
			+ "The printer has " + numPages + " pages left in the tray.");
		}
	
		
	}

	public String getShort() {				
		return shortDescription;
	}
	@Override
	public String showName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showShortDesc() {
		
		return null;
	}

	@Override
	public String showLongDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exitRoom(String room) {
		// TODO Auto-generated method stub
		
	}

}
