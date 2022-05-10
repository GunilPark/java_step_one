package j_exception;

public class J0311_main2 {

	public static void main(String[] args) {
		String[] names = new String[2];
		names[0]	="홍길동";
		names[1]	="이영걸";
		
		
		String score = "팔십";
		int point = 0;
		
		try {
			point = Integer.parseInt(score);
			System.out.println("names[3] : " +names[3]);
		
		}catch(Exception n){
			System.out.println("try 오류~" + n.getMessage());
		}

		System.out.println("point:" + point);
		

	}

}
