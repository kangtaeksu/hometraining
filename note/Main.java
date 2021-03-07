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

	public void showMenu() { // show method 만들기

		Scanner sc = new Scanner(System.in);
		int seq = 0;
		String menu = null;
		String writer = null;
		String title = null;
		String contents = null;

		do {

			System.out.println("****메뉴를 입력하세요****");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 전체출력");
			System.out.println("3. 게시글 세부조회");
			System.out.println("4. 게시글 내용 수정");
			System.out.println("5. 게시글 검색");
			System.out.println("6. 게시글 최신부터 정렬");
			System.out.println("***끝내기***");
			System.out.println("***************");
			System.out.print(">>");

			menu = sc.nextLine();

			if (menu.equals("1")) { // 글작성

				System.out.print("글제목: ");
				title = sc.nextLine();

				System.out.print("작성자: ");
				writer = sc.nextLine();

				System.out.print("글내용: ");
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
//				System.out.print("글번호를 입력하세요: ");
//				seq = sc.nextInt();
//				Board cust = board.getBd();
//				System.out.println(cust.getID() +":" + cust.getName() + ": "
//						+ cust.getAccount().getBalance());	
//			} else if (menu.equals("4")) {
//
//				System.out.print("고객의 ID를 입력하세요.: ");
//				id = readFromKeyboard();
//
//				Customer cust = myBank.getCustomer(id);
//
//				if (cust == null) {
//					System.out.println("등록된 고객이 아닙니다.");
//
//				} else {
//					System.out.print("출금액을 입력하세요: ");
//					balance = Long.parseLong(readFromKeyboard());
//
//					if (cust.getAccount().withdraw(balance)) {
//						System.out.println("정상적으로 출금되었습니다.");
//						System.out.println("출금후 잔고는 :" + cust.getAccount().getBalance());
//					} else {
//						System.out.println("잔고가 부족합니다.");
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
