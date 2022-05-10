package d_생성자;

public class J0216_생성자_Main {

	public static void main(String[] args) {
		J0216_생성자_Sub sub1 = new J0216_생성자_Sub("홍길동");
		J0216_생성자_Sub sub2 = new J0216_생성자_Sub();
		J0216_생성자_Sub sub3 = new J0216_생성자_Sub("홍길동",25);
		
		int t = sub1.getTotal(10, 20);

		System.out.println("t" + t);
		
		System.out.println("sub1:" + sub1);
		System.out.println("sub2:" + sub2);
		System.out.println("sub3:" + sub3);
	}

}
