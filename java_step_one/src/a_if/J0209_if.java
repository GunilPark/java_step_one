package a_if;

import java.util.Scanner;

public class J0209_if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = 500000;
		int gunpil = 0;
		System.out.println("단신의 이름은?");
		String name = sc.next();
		System.out.println("성별이 무엇입니까? (1: 남자 | 2: 여자)");
		int sex = sc.nextInt();
		if (sex == 1) {
			System.out.println("군필입니까? (1: Yes | 2: No)");
			gunpil = sc.nextInt();
		} else {
			gunpil = 2;
		}
		System.out.println("결혼했나요? (1: Yes | 2: No)");
		int marry = sc.nextInt();
		System.out.println("당신의 나이는?");
		int age = sc.nextInt();

		if (gunpil == 1) {
			money = money + 200000;

		} else if (gunpil == 2) {

		} else {
			System.out.println("입력오류");

		}

		if (marry == 1) {
			money = money + 100000;

		} else if (marry == 2) {

		}

		if (age >= 30) {
			money = money + 50000;
		} else {

		}
		
		double realmoney = money*0.97;

		System.out.println(name + "님" + "급여 : ");
		System.out.printf("%3.2f",realmoney);

		sc.close();
	}

}
