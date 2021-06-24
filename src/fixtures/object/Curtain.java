package fixtures.object;

import fixtures.Fixture;

public class Curtain extends Fixture implements Interactive{
	public Curtain() {
		super();
		this.name = "Curtain";
		this.shortDescription = "Single panel rod pocket curtains";
		this.longDescription = "A purple curtain, it is now closed.";
	}
	@Override
	public void interactwith() {
		System.out.println("You opened up the curtains and enjoy the nice view through the window.");
		this.longDescription = "A purple curtain, it is now opened.";
	}	
}
