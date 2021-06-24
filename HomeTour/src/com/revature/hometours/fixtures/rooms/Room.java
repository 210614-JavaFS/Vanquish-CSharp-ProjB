package com.revature.hometours.fixtures.rooms;

import java.util.ArrayList;

import com.revature.hometours.fixtures.Fixture;
import com.revature.hometours.fixtures.objects.Interactive;

public class Room extends Fixture {	
	 public Room[] exits;
	 public ArrayList<Interactive> methodList = new ArrayList<Interactive>();
	 
	 public Room(String name, String shortDescription, String longDescription) {
		 super(name, shortDescription, longDescription);
		 this.exits = new Room[4];		 
	 }
	 
	 
//	 public Room(String name, String shortDescription, String longDescription, Room[] exits,
//			ArrayList<Interactive> methodList) {
//		super(name, shortDescription, longDescription);
//		this.exits = exits;
//		this.methodList = methodList;
//	}

	public Room[] getExits() {
		   return this.exits;	
	 };
	 
	public Room getExit(String direction) {
		switch(direction) {
		case "north":
			return this.exits[0];
		case "east":
			return this.exits[1];
		case "south":
			return this.exits[2];
		case "west":
			return this.exits[3];
	}
		return null;
		
	};
	
	 
	 public void setExit(Room north, Room east, Room south, Room west) {
		 	this.exits[0] = north;
			this.exits[1] = east;			
			this.exits[2] = south;
			this.exits[3] = west;
	 };
	 
	 public void setMethod(Interactive object1) {
		 this.methodList.add(object1);
	 };
	
	  @Override
	public void exitRoom(String room) {
		System.out.println("You are about to leave the Computer Room");
	};

	@Override
	public String toString() {
		return "Room [name=" + name + ", shortDescription=" + shortDescription + ", longDescription=" + longDescription
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	@Override
	public void interactWith() {
		// TODO Auto-generated method stub
		
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
	};










}
