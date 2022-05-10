package d_생성자;

public class J0302_Main {

	public static void main(String[] args) {
		J0302_dto dto1 = new J0302_dto();
		dto1.setName("홍길동");
		dto1.setArea("서울");
		dto1.setGender("남");
		dto1.setAge(25);
		
		System.out.println("성명:"+dto1.getName());
		System.out.println("지역:"+dto1.getArea());
		System.out.println("성별:"+dto1.getGender());
		System.out.println("나이:"+dto1.getAge());
	}

}
