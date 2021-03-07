package home.hotel;

public class Third {
	private int price;
	private int room[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	public Third() {
		this.price = 50000;
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

