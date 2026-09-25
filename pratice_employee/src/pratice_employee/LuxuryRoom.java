package pratice_employee;

public class LuxuryRoom extends Room {
	
	String roomAmentities;

	public LuxuryRoom(int roomId, RoomType roomType, double roomprice, boolean roomisAvailable, String roomAmentities) {
		super(roomId, roomType, roomprice, roomisAvailable);
		this.roomAmentities = roomAmentities;
	}
	
	@Override
	public void bookRoom() {
		System.out.println("Luxury Room" + roomId + "booked with" + roomAmentities );
		roomisAvailable = false;
	}
	
}
