package home.grade;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private int aver;

	public Student() {
	}

	public Student(String name, int kor, int eng, int mat, int sum, int aver) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = sum;
		this.aver = aver;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {

		sum = kor + eng + mat;

		this.sum = sum;
	}

	public int getAver() {
		return aver;
	}

	public void setAver(int aver) {
		aver = sum / 4;
		this.aver = aver;
	}

	public void stuPrint() {

		System.out.print(name + "의 국어는 : " + kor + " 점 영어" + "는" + eng + " 수학은 " + mat + "점 이고, ");

	}

}
