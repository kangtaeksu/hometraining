package home.hotel;

public class Customer {

	private String name;
	private String birth;
	private int reNum;
	private int balance;
	
	public Customer() {}
	public Customer(String name, String birth, int reNum, int balance) {
		super();
		this.name = name;
		this.birth = birth;
		this.reNum = reNum;
		this.balance = balance;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getReNum() {
		return reNum;
	}
	public void setReNum(int reNum) {
		this.reNum = reNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}}
	
	
	
	
	