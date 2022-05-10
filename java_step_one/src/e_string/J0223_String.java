package e_string;

public class J0223_String {

	public static void main(String[] args) {
		
		//String 에서 자주 사용되는 메소드들.
		String name = "김수한무거북이와두루미";
		
		//String의 길이를 구하는 메소드
		int len = name.length();
		System.out.println("length :" + len);
		
		
		//String을 재단하는 메소드.
		String cut1 = name.substring(10);
		String cut2 = name.substring(4,7);
		
		System.out.println("cut1:" + cut1);
		System.out.println("cut2:" + cut2);
		
		//String에 있는 글자를 검색하는 메소드.
		int ind = name.indexOf("한무");
		System.out.println("ind:" + ind);
		
		//글자 불러오기
		String result = name.substring(ind);
		System.out.println("result:" + result);
		
		
	}
}
