package a_if;

import java.util.Scanner;

public class J0208_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = 0;

		System.out.println("남여구분 남:1, 여:2 ?");
		String gubun = sc.next();
		System.out.println("학력 고딩:3, 중딩:2 초딩:1 ?");
		int level = sc.nextInt();

		if (level == 1) {
			money = money + 5000;
		} else if (level == 2) {
			money = money + 7000;
		} else if (level == 3) {
			money = money + 10000;
		}

		if (gubun.equals("1")) {
			money = money + 2000;
		} else if (gubun.equals("2")) {
			money = money + 5000;
		}
		
		System.out.println("너의 용돈은" + money + "원");
		
		sc.close();
		}
	}


