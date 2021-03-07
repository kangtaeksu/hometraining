package home.bank;

public class MyBank {

	private Customer customers[];
	private int customersNum;

	public MyBank() {
		customers = new Customer[10]; // 디폴트 함수에 커스토머 10갸ㅐ 설정//////////////
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
//고객보기용 2번
	public Customer getCustomer(String ID) {/////////////////////

		Customer cust = null;// 배열아니여서 초기화
		for (int i = 0; i < customersNum; i++) {
			if (ID.equals(customers[i].getID())) {// 입력아이디랑 배열의 아이디랑 비교

				cust = customers[i];
				break;
			}
		}
		return cust;
	}
	//1번 고객 추가
	public void addCustomer(String ID, String name, long balance) {

		// Customer customers = new Customer();
		customers[customersNum++] = new Customer(ID, name, balance);
	}

	//전체 출력 3번
	public Customer[] getAllCustomers() {///////////////////// 배열복사

		Customer newcustomers[] = new Customer[customersNum];

		System.arraycopy(customers, 0, newcustomers, 0, customersNum);
		return newcustomers;

	}
}
