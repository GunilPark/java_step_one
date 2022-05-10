package c_method;

public class J0215_Main_overloading {

	public static void main(String[] args) {
		J0215_Sub_overloading cl = new J0215_Sub_overloading();
		int kor = 90, eng = 80, mat = 70, art = 60, music = 50;
		int mainTotal = cl.getTotal(kor, eng, mat);
		int subTotal = cl.getTotal(art, music);
		int allTotal = cl.getTotal(kor, eng, mat, art, music);

		System.out.println("국영수 총합:" + mainTotal);
		System.out.println("예체능 총합:" + subTotal);
		System.out.println("전과목총합:" + allTotal);

		int sum_1 = cl.getTotal("100", kor, eng);
		System.out.println("sum_1 : " + sum_1);
		int sum_2 = cl.getTotal(music, art, "50");
		System.out.println("sum_2 : " + sum_2);
	}

}
