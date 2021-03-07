package home.note;

import java.util.Scanner;

import home.bank.BankSystem;
import home.bank.Customer;

public class Main {
	private BoardManager manager;

	public Main() {
		manager = new BoardManager();
		showMenu();

	}

	public void showMenu() { // show method �����

		Scanner sc = new Scanner(System.in);
		int seq = 0;
		String menu = null;
		String writer = null;
		String title = null;
		String contents = null;

		do {

			System.out.println("****�޴��� �Է��ϼ���****");
			System.out.println("1. �Խñ� ���");
			System.out.println("2. �Խñ� ��ü���");
			System.out.println("3. �Խñ� ������ȸ");
			System.out.println("4. �Խñ� ���� ����");
			System.out.println("5. �Խñ� �˻�");
			System.out.println("6. �Խñ� �ֽź��� ����");
			System.out.println("***������***");
			System.out.println("***************");
			System.out.print(">>");

			menu = sc.nextLine();

			if (menu.equals("1")) { // ���ۼ�

				System.out.print("������: ");
				title = sc.nextLine();

				System.out.print("�ۼ���: ");
				writer = sc.nextLine();

				System.out.print("�۳���: ");
				contents = sc.nextLine();

				manager.addBoard(title, writer, contents);

			} 
			else if (menu.equals("2")) {

				Board[] allCust = manager.allPrint();

				for (int i = 0; i < allCust.length; i++) {
					System.out.println(allCust[i].getTitle() + ": " + allCust[i].getWriter() + " :"
							+ allCust[i].getContents());

				}
			}
//			else if (menu.equals("3")) {
//
//				System.out.print("�۹�ȣ�� �Է��ϼ���: ");
//				seq = sc.nextInt();
//				Board cust = board.getBd();
//				System.out.println(cust.getID() +":" + cust.getName() + ": "
//						+ cust.getAccount().getBalance());	
//			} else if (menu.equals("4")) {
//
//				System.out.print("���� ID�� �Է��ϼ���.: ");
//				id = readFromKeyboard();
//
//				Customer cust = myBank.getCustomer(id);
//
//				if (cust == null) {
//					System.out.println("��ϵ� ���� �ƴմϴ�.");
//
//				} else {
//					System.out.print("��ݾ��� �Է��ϼ���: ");
//					balance = Long.parseLong(readFromKeyboard());
//
//					if (cust.getAccount().withdraw(balance)) {
//						System.out.println("���������� ��ݵǾ����ϴ�.");
//						System.out.println("����� �ܰ�� :" + cust.getAccount().getBalance());
//					} else {
//						System.out.println("�ܰ� �����մϴ�.");
//					}
//				}
//
//			}

		} while (!menu.equals("q"));
	}

	public static void main(String[] args) {

		Main main = new Main();
	}

}
