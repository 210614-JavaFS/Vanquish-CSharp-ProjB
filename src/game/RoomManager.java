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
import fixtures.object.Television;
import fixtures.object.YogaMat;
import fixtures.rooms.Bathroom;
import fixtures.rooms.BedroomChamber;
import fixtures.rooms.ComputerRoom;
import fixtures.rooms.DinningRoom;
import fixtures.rooms.Library;
import fixtures.rooms.LivingRoom;
import fixtures.rooms.ManCaveRoom;
import fixtures.object.Printer;
import fixtures.object.Recliner;
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
	    Lamp livingRoomLamp = new Lamp();
	    Drawer livingRoomLampDrawer = new Drawer();
	    
	    //set Exit 
	    //north, east, south, west
	    

	    //set objects to room
	    livingRoom.setMethod(livingRoomLamp, null);

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

	    YogaMat yogaMat = new YogaMat();
	    Lamp yogaLamp = new Lamp();
	    yogaroom.setMethod(yogaMat, yogaLamp);
	    
	    //2. Library
	    Library library = new Library();
	    this.rooms[2] = library;

	    Book book = new Book();
	    Mead mead = new Mead();
	    library.setMethod(book,mead);
	    
	    //3. Man Cave Room
	    ManCaveRoom mancaveroom= new ManCaveRoom();
		this.rooms[3] = mancaveroom;

		Television mountedTelevision = new Television();
		Recliner reclinerChair = new Recliner();
		mancaveroom.setMethod(reclinerChair, mountedTelevision);

		
		//4. PC Room
		ComputerRoom computerRoom = new ComputerRoom();
		this.rooms[4] = computerRoom;
		
		Computer computer = new  Computer();
		Printer printer = new Printer();
		computerRoom.setMethod(computer,printer);
		
		//5. Bathroom
		Bathroom bathroom = new Bathroom(); 
		this.rooms[5] = bathroom; 
		
		Table bathroomTable = new Table(); 
		Door bathroomDoor = new Door();
		bathroom.setMethod(bathroomTable, bathroomDoor);
		 
		//6. BedroomChamber
		BedroomChamber bedroomchamber = new BedroomChamber();
		this.rooms[6] = bedroomchamber;

		PlayStation bedroomchamberPlayStation = new PlayStation();
		Controller bedroomchamberController = new Controller();
		bedroomchamber.setMethod(bedroomchamberPlayStation, bedroomchamberController);
		
		//7. Dining Room
		DinningRoom dinningroom = new DinningRoom();
		this.rooms[7] = dinningroom;
		Curtain dinningCurtain = new Curtain();
		Note dinningNote = new Note();
		dinningroom.setMethod(dinningCurtain,dinningNote);
		
		
		//set Exits
		livingRoom.setExit(computerRoom, bedroomchamber, yogaroom, library);
	    yogaroom.setExit(livingRoom, dinningroom, null , bathroom);
		library.setExit(null,livingRoom,bathroom,null);
		mancaveroom.setExit(null, null, bedroomchamber , computerRoom);
		computerRoom.setExit(null, mancaveroom, livingRoom, null);
		bathroom.setExit(library, yogaroom, null , null);
		bedroomchamber.setExit(mancaveroom, null, dinningroom, livingRoom);
		dinningroom.setExit(bedroomchamber,null,null,yogaroom);
	}
}
