package fixtures.object;
import fixtures.Fixture;
public class Television extends Fixture implements Interactive {
	
	public Television(){
		super();
		this.name = "Television";
		this.shortDescription = "The Television is 100 inches long";
        this.longDescription = "The Television is mounted on the left side of the wall and above the coffee table . It is currently turned off.";
    }

	public void interactwith(){
	System.out.println("You have turned on the Television.");
    this.longDescription ="The Television is mounted on the left side of the wall and above the coffee table . It is currently turned on.";
    }

	

}

