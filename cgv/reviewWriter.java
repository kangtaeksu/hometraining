package kosta.cgv;

import java.io.*;
import java.util.Scanner;

public class reviewWriter {

	public void addReview() {

		// 문자열입력받아 파일에 쓰기
		// Q누르면 파일쓰기 종료
	
		FileWriter writer1 = null;
		Scanner sc = new Scanner(System.in);
		String str = "";
		String pen = "";
		
		while (!(str=sc.nextLine()).equals("q")) {
				pen += str;
				pen += "\n";


		}
		System.out.println("thank you");

		try {
			
			writer1 = new FileWriter("review.txt");

			writer1.write(pen);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer1.close();

			} catch (Exception e2) {
			}
		}
	}

}
