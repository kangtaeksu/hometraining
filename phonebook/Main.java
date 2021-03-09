package phonebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		// 객체를 생성해야 메서드를 불러옴
		// 여기서 선언되니까 의존
		while (true) {

			System.out.print("기능 번호를 입력하세요 : ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhonInfo();
				break;
			case "4":
				m.rePhonInfo();
				break;
			case "5":
				m.deletePhonInfo();
				break;
			case "6":
				System.out.println("종료");
				return;

			}

			// 키보드입력으로 스위치
		}
	}

}
