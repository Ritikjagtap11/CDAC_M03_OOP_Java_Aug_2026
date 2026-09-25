package pratice_employee;

public class EconomyRoom extends Room {
	
	String roomAmentities;

	public EconomyRoom(int roomId, RoomType roomType, double roomprice, boolean roomisAvailable,
			String roomAmentities) {
		super(roomId, roomType, roomprice, roomisAvailable);
		this.roomAmentities = roomAmentities;
	}
	
	@Override
	public void bookRoom() {
		System.out.println("Economy Room" + roomId + "booked with" + roomAmentities );
		roomisAvailable = false;
	}
	
}
