package c_method;

public class J0214_4_Main {

	public static void main(String[] args) {
		J0214_4_Sub sub = new J0214_4_Sub();

		String total_1 = sub.getTotal_1(50, "50", 60);
		int total_2 = sub.getTotal_2("60", 60, 60);

		System.out.println(" total_1 :" + total_1);
		System.out.println(" total_2 :" + total_2);
		
		String result = sub.getResult(total_2,"3");
		System.out.println(result);
		
		result = sub.getResult(result);
		System.out.println(result);
		
	}

}
