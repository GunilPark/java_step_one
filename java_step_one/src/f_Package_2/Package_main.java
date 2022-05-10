package f_Package_2;

//import f_Package_1.Package_a;
import f_Package_1.Package_b;

public class Package_main {

	public static void main(String[] args) {
//		Package_a aa = new Package_a();
		Package_b bb = new Package_b();
		Package_sub sub = new Package_sub();

		String name = sub.getName();
		System.out.println("name:" + name);
		
		int total = bb.getTotal();
		System.out.println("total:" + total);
		
		
		
	}
}