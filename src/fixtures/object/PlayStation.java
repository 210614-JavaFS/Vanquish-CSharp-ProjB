package fixtures.object;
import fixtures.Fixture;
public class PlayStation extends Fixture implements Interactive {

	
	public PlayStation() {
		super ("PlayStation","A black and white PlayStation",
				 "The Playstaion is hard and square and is sitting on a wooden table. It" + " is currently turned off.");
	}
		@Override
		public void interactwith() {
		System.out.println("You have turned on the PlayStation.");
		
	}
}
	

