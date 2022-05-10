package b_array;

public class J0209_array_1 {

	public static void main(String[] args) {
		String[] arry1 = { "홍길동", "90", "85", "75", "90", "" };

		int total = Integer.parseInt(arry1[1]) + Integer.parseInt(arry1[2]) + Integer.parseInt(arry1[3])
				+ Integer.parseInt(arry1[4]);

		
		String totalString = Integer.toString(total);

		arry1[5] = totalString;

		for (int i = 0; i < arry1.length; i++) {
			System.out.print(arry1[i] + "\t");
		}
	}

}
