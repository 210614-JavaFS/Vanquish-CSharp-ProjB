package com.revature.hometours.fixtures;

import com.revature.hometours.fixtures.objects.Interactive;

public abstract class Fixture implements Interactive{
	
	public String name;
	public String shortDescription;
	public String longDescription;
			
	public Fixture() {
		super();		
	}
	
	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name		;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;	
		}	
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public String getLongDescription() {
		return longDescription;
	}
	
	
	//setters
	public void setName(String name) {
		 this.name = name;
	}
	public abstract void exitRoom(String room);
	
}
