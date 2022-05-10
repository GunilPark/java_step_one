package f_Package_2;

class Package_sub {
//	default 클래스는 같은 패키지 내에서만 사용 가능.
//	public 클래스는 다른 클래스에서 import 해올 수 있다.
//	클래스는 이 두가지의 종류가 있다.
	
	private String name = "홍길동";
	
	String getName() {
		return name;
	}
}
