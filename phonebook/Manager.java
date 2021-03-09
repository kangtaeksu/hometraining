package phonebook;

import java.util.Scanner;

public class Manager {

	Scanner sc = new Scanner(System.in);
	PhoneInfo[] pi = new PhoneInfo[10];
	int count = 0;

	public void Manager() {
	}

	public void addPhoneInfo() {
		// 이름 전번 생년월일입력받아서
		// 폰인포에 객체 생성해서 => 배열에 추가 == 전화번호 추가저장된것

		System.out.print("추가할 이름 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 입력하세요 : ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일 입력하세요 : ");
		String birth = sc.nextLine();

//	      PhoneInfo info = new PhoneInfo(name, phoneNo, birth);
//	      pi[count++] = info; //여기가 문제
		pi[count++] = new PhoneInfo(name, phoneNo, birth);
		System.out.println("저장완료 ");
	}

	public void listPhoneInfo() {
		// 배열에 있는 폰인포객체모두를 출력
		for (int i = 0; i < count; i++) {
			pi[i].show();
		}

	}

	public void searchPhonInfo() {

		System.out.print("검색할 이름 입력하세요 : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];// 중요!! 폰인포객체배열 생성
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("no here");

			// 키보드로 부터 이름을 입력받아 해당 폰인포 객체만 출력하도록
		}
	}

	public void rePhonInfo() {
		System.out.print("수정할 이름 입력하세요 : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];
			if (name.equals(info.getName())) {
				System.out.print("바뀐 전화번호를 입력하세요 : ");
				String phoneNo = sc.nextLine();
				pi[i].setPhoneNo(phoneNo);
				System.out.println("바꼈습니다.");
				break;
			}

		}
		if (idx == 1) {
			System.out.println("no here");
		}

	}

	public void deletePhonInfo() {

		System.out.print("지우고 싶은 이름 입력하세요 : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];
			if (name.equals(info.getName())) {
					pi[i] = pi[i + 1];   //지운후에 추가 입력후 출력시 복제됨
				
			}
		}
		if (idx == 1) {
			System.out.println("no here");
		}
	}
}
