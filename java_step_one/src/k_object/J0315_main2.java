package k_object;

import java.util.ArrayList;

public class J0315_main2 {

	public static void main(String[] args) {
		J0315_dao dao = new J0315_dao();
		String[] str = dao.getPerson();
		System.out.println("성명: " + str[0]);
		System.out.println("성명: " + str[1]);
		System.out.println("================================");

		ArrayList<J0315_member_dto> dtos = dao.getMemberList();

		dao.setPrint(dtos);
		
	}

}
