package fixtures.object;

import fixtures.Fixture;

/**
 * Object's Description
 * 
 * @author Raquel
 * @param Class       Door
 * @param constructor Door
 */

public class Door extends Fixture implements Interactive {

	public Door() {
		super();
		this.name = "Door";
		this.shortDescription = "A closed door is on the bathroom";
		this.longDescription = "The closed door seems to be locked. The bathroom is currently occupied.";

	}

	@Override
	public void interactwith() {
		System.out.print("You still have to wait until you see the unoccupied sign in the door.");
		this.longDescription = "The door of the bathroom is open. Now you can use the bathroom.";
	}

}
