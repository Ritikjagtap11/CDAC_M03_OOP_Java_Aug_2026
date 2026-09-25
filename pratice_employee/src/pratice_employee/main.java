package pratice_employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Room> listRoom = new ArrayList<>();
		 listRoom.add(new Room(1,RoomType.Double,15000.00f,true));
		 listRoom.add(new Room(2,RoomType.Double,15000.00f,true));
		 listRoom.add(new Room(3,RoomType.Single,5000.00f,false));
		 listRoom.add(new Room(4,RoomType.Suite,20000.00f,true));
		 listRoom.add(new Room(5,RoomType.Suite,20000.00f,false));
		
		List<Customer> listCustomer = new ArrayList<>();
		listCustomer.add(new Customer(101,"Ritik","ritik@gmail.com"));
		listCustomer.add(new Customer(102,"Vivek","vivek@gmail.com"));
		listCustomer.add(new Customer(103,"Sachin","sachin@gmail.com"));
		listCustomer.add(new Customer(104,"Ram","ram@gmail.com"));
		listCustomer.add(new Customer(105,"Ramesh","ramesh@gmail.com"));
		listCustomer.add(new Customer(106,"Rinku","rinku@gmail.com"));
		
		
		Map<Customer,Room> allList = new HashMap<>();
		
		//allList.put(listCustomer.get(0).getCustomerId(), listRoom.get(0).getRoomType());
		
		for(int iTmp=0; iTmp < listCustomer.size(); iTmp++) {
			
			boolean roomStatus =listRoom.get(iTmp).isRoomisAvailable();
			
			checkAvailability(roomStatus);
		
		}
		
		
	}

	private static void checkAvailability(boolean roomStatus) {
		try {
			if( roomStatus== false) {
				throw new RoomNotAvailableException("Room is Unavailable");
			}
		} catch (RoomNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
