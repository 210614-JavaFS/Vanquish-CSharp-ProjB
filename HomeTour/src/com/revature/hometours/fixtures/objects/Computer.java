package com.revature.hometours.fixtures.objects;

import com.revature.hometours.fixtures.Fixture;

public class Computer extends Fixture implements Interactive {

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
	
	@Override
	public void interactWith() {
		System.out.println("You have switched on the computer");
		powerOn=true;
		if(powerOn) {
			this.longDescription = "A computer for publc use. User can print house blueprints.  \n"
					+  "The computer is currently turned on. " + powerOn
					+  "You are running on a " + model + " computer";
		}

	}

	@Override
	public String showName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showShortDesc() {
		// TODO Auto-generated method stub
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
