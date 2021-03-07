package home.hotel;

public class Front {

	
	private int reNum;
	private Customer ct;
	private Reservation reserv;
	
	public Front() {}


	public Front(int reNum, Customer ct, Reservation reserv) {
		super();
		this.reNum = reNum;
		this.ct = ct;
		this.reserv = reserv;
	}


	public void checkOut() {
		
		Customer ct = new Customer();
		Reservation r = new Reservation();
		First f1 = new First();
		Second s1 = new Second();
		Third t1 = new Third();
		//객실 확인 
		if (ct.getReNum() == reserv.getReNum()){
			System.out.println("예약고객과 정보가 일치합니다 방가격 계산할게요.");
			
		}else {
			System.out.println("고객님은 예약하지않았습니다.");
			
		}
		
		//////결제금액출력
	for (int n : r.getFir().getRoom()) {
		if (n == ct.getReNum()) {
			System.out.println("결제금액은"+ f1.getPrice());
		}else break;
	}
	for (int n : r.getSec().getRoom()) {
		if (n == ct.getReNum()) {
			System.out.println("결제금액은"+ f1.getPrice());
		}else break;
	}
	for (int n : r.getThr().getRoom()) {
		if (n == ct.getReNum()) {
			System.out.println("결제금액은"+ f1.getPrice());
		}else break;
	}
		
	
	}
	
	/////////////////////////////
	public void payRoom() {
		
		Customer ct = new Customer("df","df",2,2);
		Reservation r = new Reservation();
		First f1 = new First();
		Second s1 = new Second();
		Third t1 = new Third();
		
		
		for (int n : r.getFir().getRoom()) {
			if (n == ct.getReNum()) {
		 ct.getBalance();reNum  -= f1.getPrice();
	}else break;
}
		for (int n : r.getSec().getRoom()) {
			if (n == ct.getReNum()) {
				f1.getPrice();
	}else break;
}
		for (int n : r.getThr().getRoom()) {
			if (n == ct.getReNum()) {
//				ct.getBalance()-=f1.getPrice();
				int i = ct.getBalance();
				i -= f1.getPrice();
				ct.setBalance(i);
	}else break;
}
		
	System.out.println(" 잔액은 : "+ ct.getBalance());
}
