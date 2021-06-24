package fixtures.object;

import fixtures.Fixture;
public class YogaMat extends Fixture implements Interactive {
	
	public YogaMat() {
		super();
		this.name = "YogaMat";
		this.shortDescription = "An ash colored fur mat";
		this.longDescription = "A fabric that extends half the room for meditation and relaxation.";
	}
	
	@Override
	public void interactwith() {
		this.longDescription = "After you take a closer look at the fabric. It's actually a very nice expensive Yoga mat.";
		
	}
}
