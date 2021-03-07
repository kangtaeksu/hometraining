package home.bank;

public class Customer {
	
	 private String ID;
	 private String name;
	 private Account account;
	 
	 public Customer() {}

	public Customer(String iD, String name, long balance) {
		super();
		ID = iD;
		this.name = name;
		this.account = new Account(iD, balance);/////////////////°í°´ »ý¼ºÀÚ
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	 
	 
}
