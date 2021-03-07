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
				.println("����л��� " + getName() + " ��ȸ�� " + getSoc() + "������ " + socallSum() + "����� " + socAver() + "�Դϴ�");

	}

	public void socPrint() {

		System.out.println("������ " + getName() + "����� " + getKor() + " �� �����" + getEng() + " ������ " + getMat()
				+ "�� �̰�,��ȸ�� " + getSoc() + "������ " + socallSum() + "����� " + socAver() + "�Դϴ�");
	}

}
