package home.grade;

public class ScienStudent extends Student {

	int sci;

	public ScienStudent() {
	}

	public ScienStudent(String name, int kor, int eng, int mat, int sum, int aver, int sci) {
		super(name, kor, eng, mat, sum, aver);
		this.sci = sci;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int sciallSum() {

		return sci + getKor() + getMat() + getEng();
	}

	public int sciAver() {

		return sciallSum() / 4;
	}

	@Override
	public void stuPrint() {

		super.stuPrint();
		System.out.println("과학은 " + sci + "총점은 " + sciallSum() + "평균은 " + sciAver() + "입니다");
	}

	public void sciPrint() {
		System.out.println("이과인 " + getName() + "국어는 " + getKor() + " 점 영어는" + getEng() + " 수학은 " + getMat()
				+ "점 이고,과학은 " + getSci() + "총점은 " + sciallSum() + "평균은 " + sciAver() + "입니다");
	}
}
