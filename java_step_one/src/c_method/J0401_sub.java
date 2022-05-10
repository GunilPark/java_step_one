package c_method;

public class J0401_sub {

	public String getSum(int[] arr) {
		String result = "";
		int sum = 0;
		for (int k = 0; k < arr.length; k++) {
			sum = sum + arr[k];
		}
		result = Integer.toString(sum);
		return result;
	}

	public String[] getResult(int a, String b, int c) {
		String[] result = new String[2];

		int sum = a + Integer.parseInt(b) + c;
		result[0] = Integer.toString(sum);
		result[1] = Integer.toString(sum / 3);

		return result;
	}

}
