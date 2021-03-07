package home.hotel;

public class Reservation {

	private Customer customer;
	private int reNum;
	private First fir;
	private Second sec;
	private Third thr;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	public Reservation(Customer customer, int reNum, First fir, Second sec, Third thr) {
		super();
		this.customer = customer;
		this.reNum = reNum;
		this.fir = fir;
		this.sec = sec;
		this.thr = thr;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getReNum() {
		return reNum;
	}
	public void setReNum(int reNum) {
		this.reNum = reNum;
	}
	public First getFir() {
		return fir;
	}
	public void setFir(First fir) {
		this.fir = fir;
	}
	public Second getSec() {
		return sec;
	}
	public void setSec(Second sec) {
		this.sec = sec;
	}
	public Third getThr() {
		return thr;
	}
	public void setThr(Third thr) {
		this.thr = thr;
	}
	
	
}
