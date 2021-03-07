package home.hotel;

public class First {
	private int price;
	private int room[];
	
	public First() {
		this.price = 100000;
		this.room = new int[] {0, 0, 0, 0, 0};
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
	}}