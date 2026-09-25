package pratice_employee;

public class Room {

	int roomId;
	RoomType roomType;
	double roomprice;
	boolean roomisAvailable;
	
	public void bookRoom() {
		System.out.println("Room" + roomId + "booked.");
		roomisAvailable = false;
	}
	
	public void cancelBooking() {
		System.out.println("Room" + roomId + "cancel.");
		roomisAvailable = true;
	}
	
	public Room(int roomId, RoomType roomType, double roomprice, boolean roomisAvailable) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomprice = roomprice;
		this.roomisAvailable = roomisAvailable;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public double getRoomprice() {
		return roomprice;
	}

	public void setRoomprice(double roomprice) {
		this.roomprice = roomprice;
	}

	public boolean isRoomisAvailable() {
		return roomisAvailable;
	}

	public void setRoomisAvailable(boolean roomisAvailable) {
		this.roomisAvailable = roomisAvailable;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", roomprice=" + roomprice + ", roomisAvailable="
				+ roomisAvailable + "]";
	}
	
	
	
	
}
