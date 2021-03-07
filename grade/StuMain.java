package home.grade;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student stu[] = { new MoonStudent("자바맨", 100, 100, 100, 0, 0, 99),
				new ScienStudent("강택수", 22, 33, 44, 0, 0, 66), new MoonStudent("논리왕", 100, 100, 100, 0, 0, 99),
				new ScienStudent("이과맨", 22, 33, 44, 0, 0, 66), new MoonStudent("문과맨", 100, 100, 100, 0, 0, 99) };

		int menu = 0;
		System.out.print("1번은 문과만 2번은 이과만 3번은 전체입니다. 고르세요 :");
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
