package fixtures.rooms;

public class Library extends fixtures.rooms.Room {
	
	

	public Library( ) {
		super("Library",
				"a small library",
				"An ancient library stack full with books and scrolls but fill with a dark aura \n. "
				+ "A book lays on the floor cover in dust you cannot see the title. On a table you see a cup \n." 
				+ "Three exits lead out the room: \n" 
				+ "North leads to a PC Room, East leads to Living Room, and South leads to the bathroom");
		
	}

	@Override
	public void interactwith() {}
	// Book and Mead objects
	
	// Library library = new Library();
	//
	// this.rooms[4] = library;
	//
	// library.setExit(pcRoom,livingRoom,bathroom,null); 
	// 
	// Book book = new Book();
	// Mead mead = new Mead();
	// 
	// library.setMethod(book,mead);
	//
}
