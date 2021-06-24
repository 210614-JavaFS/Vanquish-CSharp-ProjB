package fixtures.object;
import fixtures.Fixture;
public class Controller extends Fixture implements Interactive {
	
	public Controller() {
		super("PS controller", "Black and white controller on a table", "The controller is a PlayStation controller, that sits next to the PlayStation. It is currently off.");
	}
	@Override
	public void interactwith() {
		this.longDescription = "This controller is on a wooden table next to the PlayStation. It is currently turned on.";
	}
}
