package home.grade;

public class MoonStudent extends Student {

	int soc;

	public MoonStudent() {
	}

	public MoonStudent(String name, int kor, int eng, int mat, int sum, int aver, int soc) {
		super(name, kor, eng, mat, sum, aver);
		this.soc = soc;
	}

	public int getSoc() {
		return soc;
	}

	public void setSoc(int soc) {
		this.soc = soc;
	}

	public int socallSum() {

		return soc + getKor() + getMat() + getEng();
	}

	public int socAver() {

		return socallSum() / 4;
	}

	@Override
	public void stuPrint() {

		super.stuPrint();
		System.out
				.println("고등학생인 " + getName() + " 사회는 " + getSoc() + "총점은 " + socallSum() + "평균은 " + socAver() + "입니다");

	}

	public void socPrint() {

		System.out.println("문과인 " + getName() + "국어는 " + getKor() + " 점 영어는" + getEng() + " 수학은 " + getMat()
				+ "점 이고,사회는 " + getSoc() + "총점은 " + socallSum() + "평균은 " + socAver() + "입니다");
	}

}
