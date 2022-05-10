package c_method;

import java.text.DecimalFormat;

public class J0401_main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("p0000");
		String num = "0002";
		
		int newNum = Integer.parseInt(num.substring(1)) + 1;
		
		System.out.println(df.format(newNum));
		
		
		
		
		
		//  1234.567
//		double d = 49263972;
//		
//		DecimalFormat df = new DecimalFormat("#,###");
//		
//		String result = df.format(d);
//		System.out.println(result);
		
//		J0401_sub sub = new J0401_sub();
//
//		int[] arr = {10,20,30};
//		String total = sub.getSum(arr);
//		System.out.println("total: " + total);
//		
//		String[] result = sub.getResult(10,"20",30);
//		System.out.println("총점: " + result[0]);
//		System.out.println("평균: " + result[1]);
	}

}
