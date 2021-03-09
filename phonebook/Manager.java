package phonebook;

import java.util.Scanner;

public class Manager {

	Scanner sc = new Scanner(System.in);
	PhoneInfo[] pi = new PhoneInfo[10];
	int count = 0;

	public void Manager() {
	}

	public void addPhoneInfo() {
		// �̸� ���� ��������Է¹޾Ƽ�
		// �������� ��ü �����ؼ� => �迭�� �߰� == ��ȭ��ȣ �߰�����Ȱ�

		System.out.print("�߰��� �̸� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ �Է��ϼ��� : ");
		String phoneNo = sc.nextLine();
		System.out.print("������� �Է��ϼ��� : ");
		String birth = sc.nextLine();

//	      PhoneInfo info = new PhoneInfo(name, phoneNo, birth);
//	      pi[count++] = info; //���Ⱑ ����
		pi[count++] = new PhoneInfo(name, phoneNo, birth);
		System.out.println("����Ϸ� ");
	}

	public void listPhoneInfo() {
		// �迭�� �ִ� ��������ü��θ� ���
		for (int i = 0; i < count; i++) {
			pi[i].show();
		}

	}

	public void searchPhonInfo() {

		System.out.print("�˻��� �̸� �Է��ϼ��� : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];// �߿�!! ��������ü�迭 ����
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("no here");

			// Ű����� ���� �̸��� �Է¹޾� �ش� ������ ��ü�� ����ϵ���
		}
	}

	public void rePhonInfo() {
		System.out.print("������ �̸� �Է��ϼ��� : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];
			if (name.equals(info.getName())) {
				System.out.print("�ٲ� ��ȭ��ȣ�� �Է��ϼ��� : ");
				String phoneNo = sc.nextLine();
				pi[i].setPhoneNo(phoneNo);
				System.out.println("�ٲ����ϴ�.");
				break;
			}

		}
		if (idx == 1) {
			System.out.println("no here");
		}

	}

	public void deletePhonInfo() {

		System.out.print("����� ���� �̸� �Է��ϼ��� : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];
			if (name.equals(info.getName())) {
					pi[i] = pi[i + 1];   //�����Ŀ� �߰� �Է��� ��½� ������
				
			}
		}
		if (idx == 1) {
			System.out.println("no here");
		}
	}
}
