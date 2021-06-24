package fixtures.object;

public class Recliner extends fixtures.Fixture{
	

	public Recliner() {
		super();
		this.name = "Recliner";
		this.shortDescription = "Navy blue recliner on a square rug";
		this.longDescription = "The Recliner chair is a massage chair and is next to the standing lamp. It is currently not reclined.";
		
	}

	@Override
	public void interactwith() {
		System.out.println("You have engage the chair fully massage system");
		this.longDescription = "The Recliner chair is a massage chair and is next to the standing lamp. It is currently reclined.";
		
	}


}
