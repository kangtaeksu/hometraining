package kosta.cgv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cinema {
	ArrayList<Movie> movie1 = new ArrayList<Movie>();
	ArrayList<Movie> movie2 = new ArrayList<Movie>();
	ArrayList<Reserve> reserve = new ArrayList<Reserve>();
	ArrayList<Screen> screenG = new ArrayList<Screen>();
	ArrayList<Screen> screenR = new ArrayList<Screen>();
	
	
	public Cinema() {
//		String goldSeats[][] = {{"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}};
//		String regularSeats[][] = {{"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}};
//		Screen gold = new Screen("Gold Class", goldSeats, 30000);
//		Screen regular = new Screen("Regular Class", regularSeats, 10000);
	}

	public void reservation(Customer c) {
		BufferedReader br = null;
		String screen = null;
		String title = null;
		String time = null;
		String seatNum = null;
		int numOfPeople = 1;
		int price = 0;
		int index = 0;

		try {
			// 상영관 선택
			while (true) {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("1.Gold Class  2.Regular Class");
				System.out.print("입력: ");
				String num = br.readLine();
				if (num.equals("1")) {
					screen = "Gold Class";
					break;
				} else if (num.equals("2")) {
					screen = "Regular Class";
					break;
				} else {
					System.out.println("1번 또는 2번을 선택해 주세요.");
				}
			}
			// 영화제목, 시간대 선택
			br = new BufferedReader(new InputStreamReader(System.in));
			if (screen.equals("Gold Class")) {
				for (int i = 0; i < movie1.size(); i++) {
					System.out.println((i + 1) + "." + movie1.get(i).getTitle());
				}
				System.out.print("영화 선택: ");
				time = br.readLine();
				index = Integer.parseInt(time) - 1;
				title = movie1.get(index).getTitle();
			} else {
				for (int i = 0; i < movie2.size(); i++) {
					System.out.println((i + 1) + "." + movie2.get(i).getTitle());
				}
				System.out.print("입력: ");
				time = br.readLine();
				index = Integer.parseInt(time) - 1;
				title = movie2.get(index).getTitle();
			}
			// 좌석 선택
//			if (screen.equals("Gold Class")) {
//				for (Screen s : screenG) {
//					for (int i =0; i < s.getSeats().length; i++) {
//						s.getSeats().get(index)
//					}
//				}
//			} else {
//				
//			}
			br = new BufferedReader(new InputStreamReader(System.in));
			
			
			// 인원수 선택
//			br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("인원수 입력: ");
//			numOfPeople = br.read();
			
			// 가격
			if (screen.equals("Gold Class")) {
				if (time.equals("1")) {
					price = (int)(30000 * 0.7 * numOfPeople);
				} else {
					price = 30000 * numOfPeople;
				}
			} else if (screen.equals("Regular Class")) {
				if (time.equals("1")) {
					price = (int)(10000 * 0.7 * numOfPeople);
				} else {
					price = 10000 * numOfPeople;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		int time1 = Integer.parseInt(time);
		// 예약추가
		reserve.add(new Reserve(screen, title, time1, seatNum, numOfPeople, price));
		c.setReserve(reserve.size()-1);
	}

	public void addMoive() {
		BufferedReader br = null;
		
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("등록할 영화 제목: ");
			String title = br1.readLine();
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("영화 정보: ");
			String info = br2.readLine();
			
			Movie m = new Movie(title, info);
			
			BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1.Gold Class  2.Regular Class");
			System.out.print("입력: ");
			String screenNum = br3.readLine();
			
			
			if (screenNum.equals("1")) {
				movie1.add(m);
				String goldSeats[][] = {{"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}};
				Screen gold = new Screen("Gold Class", goldSeats, 30000);
				screenG.add(gold);
			} else if (screenNum.equals("2")) {
				movie2.add(m);
				String regularSeats[][] = {{"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0"}};
				Screen regular = new Screen("Regular Class", regularSeats, 10000);
				screenR.add(regular);
			} else {
				System.out.println("1번 혹은 2번중 선택");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printTicket(int reserveNum) {
		System.out.println("--------------------------------------------------");
		System.out.println("제목: " + reserve.get(reserveNum).getTitle());
		System.out.println("상영관: " + reserve.get(reserveNum).getScreen());
		System.out.println("시간대: " + reserve.get(reserveNum).getTime());
		System.out.println("좌석번호: " + reserve.get(reserveNum).getSeatNum());
		System.out.println("인원수: " + reserve.get(reserveNum).getNumOfPeople());
		System.out.println("결제금액: " + reserve.get(reserveNum).getPrice());
		System.out.println("--------------------------------------------------");
	}

	public int pay(Customer c, int reserveNum) {
		if (c.getBalance() > reserve.get(reserveNum).getPrice()) {
			c.withdraw(reserve.get(reserveNum).getPrice());
			System.out.println("결제완료");
			System.out.println("--------------------------------------------------");
			return 1;
		} else {
			System.out.println("잔액이 부족합니다.");
			System.out.println("--------------------------------------------------");
			reserve.remove(reserveNum);
			return 0;
		}
	}

	public void showMovieList() {
		System.out.println("\t\t현재상영작");
		System.out.println("**********     Gold Class     **********");
		for (Movie list : movie1) {
			System.out.println("### " + list.getTitle() + " ###");
			System.out.println(list.getInfo());
			System.out.println();
		}
		System.out.println("**********     Regular Class     **********");
		for (Movie list : movie2) {
			System.out.println("### " + list.getTitle() + " ###");
			System.out.println(list.getInfo());
			System.out.println();
		}
	}

	public ArrayList<Movie> getMovie1() {
		return movie1;
	}

	public void setMovie1(ArrayList<Movie> movie1) {
		this.movie1 = movie1;
	}

	public ArrayList<Movie> getMovie2() {
		return movie2;
	}

	public void setMovie2(ArrayList<Movie> movie2) {
		this.movie2 = movie2;
	}

	public ArrayList<Reserve> getReserve() {
		return reserve;
	}

	public void setReserve(ArrayList<Reserve> reserve) {
		this.reserve = reserve;
	}

	public ArrayList<Screen> getScreenG() {
		return screenG;
	}

	public void setScreenG(ArrayList<Screen> screenG) {
		this.screenG = screenG;
	}

	public ArrayList<Screen> getScreenR() {
		return screenR;
	}

	public void setScreenR(ArrayList<Screen> screenR) {
		this.screenR = screenR;
	}



}