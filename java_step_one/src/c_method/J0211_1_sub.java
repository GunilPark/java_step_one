package c_method;

public class J0211_1_sub {
	int getTotal(String kor, String eng, String math) {
		int korInt = Integer.parseInt(kor);
		int engInt = Integer.parseInt(eng);
		int mathInt = Integer.parseInt(math);

		int total = korInt + engInt + mathInt;

		return total;
	}

	double getAverage(int total, int a) {
		double average;
		
		average = total/a;
		return average;
		
		
	}

}