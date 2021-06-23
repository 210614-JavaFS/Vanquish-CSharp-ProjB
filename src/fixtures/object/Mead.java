package fixtures.object;

import fixtures.Fixture;

public class Mead extends Fixture implements Interactive  {
		
	public Mead() {
		super();
		this.name = "Cup";
		this.shortDescription = "A cup of Mead";
		this.longDescription = "On a table a cup fill to the brim with Mead.";
			
	}

	@Override
	public void interactwith() {
		this.longDescription = "On a table the cup is now empty.";
			
		}
		

	}
	

