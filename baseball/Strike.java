package home.baseball;

public class Strike implements judgement {
	
	CreateBall ctball;
	Myball myball;
	
	public CreateBall getCtball() {
		return ctball;
	}

	public void setCtball(CreateBall ctball) {
		this.ctball = ctball;
	}

	public Myball getMyball() {
		return myball;
	}

	public void setMyball(Myball myball) {
		this.myball = myball;
	}

	public Strike(CreateBall ctball, Myball myball) {
		super();
		this.ctball = ctball;
		this.myball = myball;
	}

	public Strike() {}

	@Override
	public int balljudge() {
		

		int strikenum=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (cball[i] == mball[j] && i == j) {
					
					strikenum++;
				}
			}
		}

	return strikenum;
		
	}
	
	

}
