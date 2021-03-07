package home.baseball;

import java.util.Scanner;

public class Myball implements ballMaker {

	private Scanner bal = new Scanner(System.in);
	private int bal1;
	private int bal2;
	private int bal3;

	public Myball() {
	}

	
	public Myball(int bal1, int bal2, int bal3) {
		super();
		this.bal = bal;
		this.bal1 = bal1;
		this.bal2 = bal2;
		this.bal3 = bal3;
	}


	@Override
	public void ballmake() {

		Myball mball = new Myball(bal.nextInt(), bal.nextInt(), bal.nextInt());

	}

}
