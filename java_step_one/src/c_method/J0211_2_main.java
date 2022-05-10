package c_method;

import java.util.Scanner;

public class J0211_2_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0211_2_sub calcu = new J0211_2_sub();
		System.out.println("이름은?");
		String name = sc.next();
		System.out.println("국어점수는?");
		int kor = sc.nextInt();
		System.out.println("영어점수는?");
		int eng = sc.nextInt();
		System.out.println("수학점수는?");
		String math = sc.next();
		System.out.println("과학점수는?");
		String sci = sc.next();
		String total = "";
		int ava = 0;
		String result = "";
		
		total = calcu.getTotal(kor, eng, math, sci);
		ava = calcu.getAverage(total,4);
		result = calcu.getResult(ava);
		
		System.out.println(name + "님");
		System.out.println("총점:"+total);
		System.out.println("평균:"+ava);
		System.out.println(result + "입니다.");
		
		sc.close();
	}

}
