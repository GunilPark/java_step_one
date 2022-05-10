package c_method;

public class J0214_4_Sub {

	String getTotal_1(int a, String b, int c) {
		String result = "";

		result = Integer.toString(a+ Integer.parseInt(b)+c);
		
		
		return result;
	}

	int getTotal_2(String a, int b, int c) {
		int result = 0;

		result = Integer.parseInt(a) + b+ c;
		return result;
	}
	String getResult(int a , String b) {
		String result = "";
		
		result = Integer.toString(a/Integer.parseInt(b));
		
		return result;
	}
	String getResult(String result) {
		int a = Integer.parseInt(result);
		if(100>=a && a>90) {
			result = "수";
		}else if(90>=a && a>80) {
			result = "우";
		}else if(80>=a && a>70) {
			result = "미";
		}else if(70>=a && a>60) {
			result = "양";
		}else if(60>=a) {
			result = "가";
		}
		
		
		
		
		return result;
	}

}
