package home.baseball;

import java.util.Random;

public class CreateBall implements ballMaker {

	
	private Random bal = new Random();
	private int bal1;
	private int bal2;
	private int bal3;
	

	public CreateBall() {
	}

	

	public CreateBall(int bal1, int bal2, int bal3) {
		super();
		this.bal = bal;
		this.bal1 = bal1;
		this.bal2 = bal2;
		this.bal3 = bal3;
	}



	public Random getBal() {
		return bal;
	}



	public void setBal(Random bal) {
		this.bal = bal;
	}



	public int getBal1() {
		return bal1;
	}



	public void setBal1(int bal1) {
		this.bal1 = bal1;
	}



	public int getBal2() {
		return bal2;
	}



	public void setBal2(int bal2) {
		this.bal2 = bal2;
	}



	public int getBal3() {
		return bal3;
	}



	public void setBal3(int bal3) {
		this.bal3 = bal3;
	}



	@Override
	public void ballmake() {

		CreateBall cball = 
				new CreateBall((bal.nextInt(8)+1),
						(bal.nextInt(8)+1),(bal.nextInt(8)+1));


	}

}
