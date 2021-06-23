package fixtures;

import fixtures.object.Interactive;

public abstract class Fixture implements Interactive {
	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixture()
	{
		super();
	}
	
	/**
	 * Room's Description
	 * @author Billy
	 * @param name
	 * @param shortDescription
	 * @param longDescription
	 */
	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	@Override
	public String showName() {
		return this.name;
	}
	
	@Override
	public String showShortDesc() {
		return this.shortDescription;
	}
	
	@Override
	public String showLongDesc() {
		return this.longDescription;
	}
}
