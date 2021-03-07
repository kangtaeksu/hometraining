package home.baseball;

public class Ball implements judgement {

	CreateBall cball[];
	Myball mball[];
	

	public Ball() {
	}

	@Override
	public int balljudge() {
		// TODO Auto-generated method stub
		int ballnum=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (cball[i] == mball[j] && i != j) {
					ballnum++;
					
				}
			}
		}
		return ballnum;
	}
}
