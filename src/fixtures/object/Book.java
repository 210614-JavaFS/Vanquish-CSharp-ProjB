package fixtures.object;

import fixtures.Fixture;

public class Book extends Fixture implements Interactive  {
	
	public Book() {
		super();
		this.name = "Book";
		this.shortDescription = "A dust cover book";
		this.longDescription = "A dusty book lying on the floor by a table. With an unkown title.";
		
	}

	@Override
	public void interactwith() {
		this.longDescription = "You place the book an the table and remove most of the dust revealing the title,"+ 
				"The Art of Making Good Mead.";		
	}

}
