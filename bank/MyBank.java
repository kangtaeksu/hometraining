package home.bank;

public class MyBank {

	private Customer customers[];
	private int customersNum;

	public MyBank() {
		customers = new Customer[10]; // ����Ʈ �Լ��� Ŀ����� 10���� ����//////////////
	}

	public MyBank(Customer[] customers, int customersNum) {
		super();
		this.customers = customers;
		this.customersNum = customersNum;
	}


	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}
	////////////////////////////////////////////////////////
//������� 2��
	public Customer getCustomer(String ID) {/////////////////////

		Customer cust = null;// �迭�ƴϿ��� �ʱ�ȭ
		for (int i = 0; i < customersNum; i++) {
			if (ID.equals(customers[i].getID())) {// �Է¾��̵�� �迭�� ���̵�� ��

				cust = customers[i];
				break;
			}
		}
		return cust;
	}
	//1�� �� �߰�
	public void addCustomer(String ID, String name, long balance) {

		// Customer customers = new Customer();
		customers[customersNum++] = new Customer(ID, name, balance);
	}

	//��ü ��� 3��
	public Customer[] getAllCustomers() {///////////////////// �迭����

		Customer newcustomers[] = new Customer[customersNum];

		System.arraycopy(customers, 0, newcustomers, 0, customersNum);
		return newcustomers;

	}
}
