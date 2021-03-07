package home.bank;

public class Account {

	private String ID;
	private long balance;

	public Account() {
	}

	public Account(String iD, long balance) {
		super();
		ID = iD;
		this.balance = balance;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void deposit(long amt) {

		balance += amt;
	}

	public boolean withdraw(long amt) {

		if (balance < amt) {
			return false;
		}
		balance -= amt;

		return true;

	}
}
