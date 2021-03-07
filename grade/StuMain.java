package home.grade;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student stu[] = { new MoonStudent("�ڹٸ�", 100, 100, 100, 0, 0, 99),
				new ScienStudent("���ü�", 22, 33, 44, 0, 0, 66), new MoonStudent("����", 100, 100, 100, 0, 0, 99),
				new ScienStudent("�̰���", 22, 33, 44, 0, 0, 66), new MoonStudent("������", 100, 100, 100, 0, 0, 99) };

		int menu = 0;
		System.out.print("1���� ������ 2���� �̰��� 3���� ��ü�Դϴ�. ������ :");
		menu = sc.nextInt();

		if (menu == 1) {
			for (int m = 0; m < stu.length; m++) {
				if (stu[m] instanceof MoonStudent) {

					MoonStudent ms = (MoonStudent) stu[m];

					ms.socPrint();
				}
			}
		}
		if (menu == 2) {
			for (int n = 0; n < stu.length; n++) {
				if (stu[n] instanceof ScienStudent) {

					ScienStudent ss = (ScienStudent) stu[n];

					ss.sciPrint();
				}
			}
		}else if (menu == 3) {

			for (int i = 0; i < stu.length; i++)
				stu[i].stuPrint();
		}

	}

}
