package d_생성자;

public class J0217_Main {

	public static void main(String[] args) {
		J0217_Sub sub_1 = new J0217_Sub();
		sub_1.setAge(28);
		sub_1.setName("박건일");
		sub_1.setArea("울산");
		
		System.out.println(" 성명 : " + sub_1.getName());
		System.out.println(" 지역 : " + sub_1.getArea());
		System.out.println(" 나이 : " + sub_1.getAge());
		
		J0217_Sub sub_2 = new J0217_Sub("김정은",38,"북한");
		
		System.out.println(" 성명 : " + sub_2.getName());
		System.out.println(" 지역 : " + sub_2.getArea());
		System.out.println(" 나이 : " + sub_2.getAge());

	}

}
