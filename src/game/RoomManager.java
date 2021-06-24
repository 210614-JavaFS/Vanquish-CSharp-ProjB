package game;

import fixtures.object.Book;
import fixtures.object.Computer;
import fixtures.object.Controller;
import fixtures.object.Curtain;
import fixtures.object.Door;
import fixtures.object.Drawer;
import fixtures.object.Lamp;
import fixtures.object.Mead;
import fixtures.object.Note;
import fixtures.object.PlayStation;
import fixtures.object.Table;
import fixtures.object.YogaMat;
import fixtures.rooms.Bathroom;
import fixtures.rooms.BedroomChamber;
import fixtures.rooms.ComputerRoom;
import fixtures.rooms.DinningRoom;
import fixtures.rooms.Library;
import fixtures.rooms.LivingRoom;
import fixtures.object.Printer;
import fixtures.rooms.Room;
import fixtures.rooms.YogaRoom;

public class RoomManager {
	Room startingRoom;
	
	Room[] rooms = new Room[8];
	
	public void init() {
		
		//0. LivingRoom
	    LivingRoom livingRoom = new LivingRoom();
	    this.rooms[0] = livingRoom;
	    this.startingRoom = livingRoom;
	    //Objects
	    Lamp LivingRoomLamp = new Lamp();
	    Drawer LivingRoomLampDrawer = new Drawer();
	    
	    //set Exit 
	    //north, east, south, west
	    livingRoom.setExit(null, null, null, null);

	    //set objects to room
	    livingRoom.setMethod(LivingRoomLamp, LivingRoomLampDrawer);

//	    //1. Instantiate you room
//	    Bathroom bathroom = new Bathroom();
//	    //2. assign your room to the array rooms[]
//	    this.rooms[1] = bathroom;
//	    //3. assign the exits to your room
//	    bathroom.setExit(library, null, null , null);
//	    //4. instantiate your objects inside room
//	    Table bathroomTable = new Table();
//	    Lamp bathroomLamp = new Lamp();
//	    //5. assign your objects to your room
//	    bathroom.setMethod(bathroomTable, bathroomLamp);
	    
	    //1. Yoga Room
	    YogaRoom yogaroom = new YogaRoom();
	    this.rooms[1] = yogaroom;
	    //2. Yoga Room's exits
	    //yogaroom.setExit(livingroom, diningroom, null , bathroom);
	    YogaMat yogaMat = new YogaMat();
	    Lamp yogaLamp = new Lamp();
	    yogaroom.setMethod(yogaMat, yogaLamp);
	    
	    //2. Library
	    Library library = new Library();
	    this.rooms[2] = library;
//		library.setExit(pcRoom,livingRoom,bathroom,null); 
	    Book book = new Book();
	    Mead mead = new Mead();
	    library.setMethod(book,mead);
	    
	    //7. Dining Room
		DinningRoom dinningroom = new DinningRoom();
		this.rooms[7] = dinningroom;
//		dinningroom.setExit("kitchen",null,null,yogaroom);
		Curtain dinningCurtain = new Curtain();
		Note dinningNote = new Note();
		dinningroom.setMethod(dinningCurtain,dinningNote);
		
		
		//4. PC Room
		ComputerRoom computerRoom = new ComputerRoom();
		this.rooms[4] = computerRoom;
//		computerroom.setExit(null, mancave, livingroom, library);
		Computer computer = new  Computer();
		Printer printer = new Printer();
		computerRoom.setMethod(computer,printer);
		
		//5. Bathroom
		Bathroom bathroom = new Bathroom(); 
		this.rooms[5] = bathroom; 
//		bathroom.setExit(library, yoga, null , null); 
		Table bathroomTable = new Table(); 
		Door bathroomDoor = new Door();
		bathroom.setMethod(bathroomTable, bathroomDoor);
		 
		//6. BedroomChamber
		BedroomChamber bedroomchamber = new BedroomChamber();
		this.rooms[6] = bedroomchamber;
//		bedroomchamber.setExit(library, ManCave, LivingRoom, DiningRoom, null;
		PlayStation bedroomchamberPlayStation = new PlayStation();
		Controller bedroomchamberController = new Controller();
		bedroomchamber.setMethod(bedroomchamberPlayStation, bedroomchamberController);
		
		
	}
}
