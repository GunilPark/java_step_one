package g_상속;

public class A_parents extends Object{ //상속받는 클래스가 없는 클래스는 자바에서 자동을 Object라는 클래스를 상속해줌
	String getVoice(String kind) {
		String voice = "";
		
		if(kind.equals("호랭이")) voice = "어흥";
		else if(kind.equals("고양이")) voice = "야옹";
		
		return voice;
	}
	
	int getAva(int total, int count) {
		return total/count;
	}
	
	String getName() {
		return "안길동";
	}
	
		int getAge() {
			return 25;
	}
		
}