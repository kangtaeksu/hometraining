package phonebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		// ��ü�� �����ؾ� �޼��带 �ҷ���
		// ���⼭ ����Ǵϱ� ����
		while (true) {

			System.out.print("��� ��ȣ�� �Է��ϼ��� : ");
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
				System.out.println("����");
				return;

			}

			// Ű�����Է����� ����ġ
		}
	}

}
