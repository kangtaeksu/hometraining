package home.hotel;

public class Second {
	private int price;
	private int room[];
	
	public Second() {
		this.price = 80000;
		this.room = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int[] getRoom() {
		return room;
	}

	public void setRoom(int[] room) {
		this.room = room;
	}
	
}
