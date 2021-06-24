package fixtures.object;

import fixtures.Fixture;

public class Note extends Fixture implements Interactive{
	public Note() {
		super();
		this.name = "Note";
		this.shortDescription = "A note on the rectangular table.";
		this.longDescription = "There is a note left on the dining table, seems someone left a message to you.";
	}
	@Override
	public void interactwith() {
		System.out.println("You pick up the note and read it.");
		this.longDescription = "The message on the note, 'The training is gonna be tough and stress, stay sharp.'";
	}	
}
