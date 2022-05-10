package l_database;

public class J0317_main {

	public static void main(String[] args) {
		J0316_dao dao = new J0316_dao();
		int age = dao.getMemberAge("102");

		System.out.println("age: " + age);
		
		System.out.println("===========================");
		
		String area = dao.getMemberArea("102");
		
		System.out.println("area: " + area);

		
		
		
		
		
		
	}

}
