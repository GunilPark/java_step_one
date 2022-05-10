
package c_method;

public class J0211_1_main {

	public static void main(String[] args) {

		J0211_1_sub calcu = new J0211_1_sub();

		String name = "박건일";
		String kor = "90";
		String eng = "80";
		String math = "70";
		int total = 0;
		double ava = 0.0;
		
		total = calcu.getTotal(kor, eng, math);
		ava = calcu.getAverage(total, 3);
		
		System.out.printf("이름: %s 국어: %s 영어: %s 수학: %s 총점: %d 평균: %3.2f   ", name, kor, eng, math, total, ava);

	}

}