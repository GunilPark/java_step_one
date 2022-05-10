package c_method;

public class J0211_2_sub {
	String getTotal(int kor, int eng, String math, String sci) {
		String total = "";

		int totalInt = kor + eng + Integer.parseInt(math) +Integer.parseInt(sci);

		total = Integer.toString(totalInt);
		return total;
	}

	int getAverage(String total, int a) {
		int average = 0;

		average = Integer.parseInt(total) / a;

		return average;
	}

	String getResult(int average) {
		String result = "";
		result = "수";
		if (average >= 90) {
			result ="우";
		} else if (average >= 80) {
			result ="미";
		} else if (average >= 80) {
			result = "양";
		} else {
			result = "가";
		} 
		return result;
	}

}
