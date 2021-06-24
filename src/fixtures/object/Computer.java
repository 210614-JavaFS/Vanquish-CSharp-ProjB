package fixtures.object;

import java.util.Scanner;

import fixtures.Fixture;

public class Computer extends Fixture implements Interactive{
	Scanner  scan= new Scanner(System.in);
	public boolean powerOn;
	public String model;
	public String[] games = new String[4];
	public String choice;
	
	public Computer() {
		super();
		this.games[0]= "CounterStrike";
		this.games[1]= "Call of Duty";
		this.games[2]= "Zork";
		this.games[3]= "spring tool suite";
		this.model = "AMD Ryzen 9 5900X";
		this.powerOn = false;
		this.name = "Computer";
		this.shortDescription = "Turn on the computer and do programming or play games.";
		this.longDescription = "A computer for publc use. User can do programming or play games. \n"
				+  "The computer is currently turned on?. \n" + this.powerOn;			
		
	}
	
	
	@Override
	public void interactwith() {	
		this.powerOn=true;
		
		if(this.powerOn) {
			System.out.println("You have switched on the computer");
			this.longDescription = "A computer for public use. User can do programming or play games.  \n"
					+  "The computer is currently turned off. \n" + powerOn;
			
		}
		this.longDescription = "Games " 
				+  "The computer is currently turned on. \n" + powerOn + " \n" + this.model + " \n"
		+ "Launching " + this.games[3];
		
		
	}
	
	public String playGame() {
		String instructor = "Instructor reaction : :-)";
		
		System.out.println("Choose your game" + games[0]+ games[1]+ games[2] );
		String answer = scan.nextLine();
		scan.close();
		return instructor + " \n" + answer;
		
	}
	
	public String doProgramming() {
		String instructor = "Instructor reaction : :-)";
		String coding = "Starting " + this.games[3];
		return instructor + " \n" + coding;
		
	}
}
