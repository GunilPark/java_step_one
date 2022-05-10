package j_exception;

import java.util.Scanner;

public class J0314_dao {

	public int getTotal(String kor, String eng) throws Exception {
		Scanner sc = new Scanner(System.in);
	
		
		int korInt = 0;
		int engInt = 0;
		try {
			korInt = Integer.parseInt(kor);
		} catch (Exception n) {
			System.out.println("몇?");
			korInt = sc.nextInt();
			System.out.println("국어과목 입력오류");
//			throw new Exception();
		}

		try {
			engInt = Integer.parseInt(eng);
		} catch (Exception n) {
			System.out.println("몇?");
			engInt = sc.nextInt();
			System.out.println("영어과목 입력오류");
//			throw new Exception();
		}

		int total = korInt + engInt;
		sc.close();
		return total;
	}
	public String getTotal2(String kor) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명?:");
		String result = sc.next();
		sc.close();
		return result;
	}

}
