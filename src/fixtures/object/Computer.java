package fixtures.object;

public class Computer extends Fixture implements Interactive{

	public ComputerRoom() {
		super();
		this.name = "Computer";
		this.shortDescription = "Turn on the computer and it to print documents or  house blueprints.";
		this.longDescription = "A computer for publc use. User can print house blueprints. \n"
				+  "The computer is currently turned off. \n";
		
	}
}
