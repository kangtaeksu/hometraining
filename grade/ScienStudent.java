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
		System.out.println("������ " + sci + "������ " + sciallSum() + "����� " + sciAver() + "�Դϴ�");
	}

	public void sciPrint() {
		System.out.println("�̰��� " + getName() + "����� " + getKor() + " �� �����" + getEng() + " ������ " + getMat()
				+ "�� �̰�,������ " + getSci() + "������ " + sciallSum() + "����� " + sciAver() + "�Դϴ�");
	}
}
