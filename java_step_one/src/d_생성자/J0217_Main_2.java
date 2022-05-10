package d_생성자;

public class J0217_Main_2 {

	public static void main(String[] args) {
		J0217_Sub_2 sub = new J0217_Sub_2("박건일", 85, 25, 100);

		sub.setTotal();
		int total = sub.getTotal();
		System.out.println("total : " + total);
		
		J0217_Sub_2 sub_2 = new J0217_Sub_2("김세훈", 30, 30, 40);
		sub_2.setTotal();
		System.out.println("sub_2.total :" + sub_2.total);
		
		
		J0217_Sub_2 sub_3 = new J0217_Sub_2("오인환", 30, 30);
		sub_3.setTotal();
		System.out.println("sub_3.total :" + sub_3.total);
	
		
		
	}

}
