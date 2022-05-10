package k_object;

public class J0315_main {

	public static void main(String[] args) {
		J0315_dao dao = new J0315_dao();
		int total = dao.getTotal(50, 60);
		J0315_member_dto dto = dao.getMember();
		System.out.println("성명: " + dto.getName());
		System.out.println("지역: " + dto.getArea());
		System.out.println("나이: " + dto.getAge());
		System.out.println("=================================");

		J0315_member_dto dto2 = dao.getMember("김정은", "서울", 25);
		System.out.println("dto2:" + dto2 + total);
		
	}

}
