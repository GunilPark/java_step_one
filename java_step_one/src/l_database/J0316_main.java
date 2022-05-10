package l_database;

import java.util.Scanner;

public class J0316_main {

	public static void main(String[] args) {
		J0316_dao dao = new J0316_dao();
		Scanner sc = new Scanner(System.in);
		J0316_member_dto dto = dao.getMemberInfo();

		if (dto == null) {
			System.out.println("해당 내용 없음");
		} else {
			System.out.print("아이디: " + dto.getId() + "\t");
			System.out.print("이름: " + dto.getName() + "\t");
			System.out.print("지역: " + dto.getArea() + "\t");
			System.out.print("나이: " + dto.getAge() + "\n");
		}
		System.out.println("==========================================");

		while (true) {
			System.out.print("[검색: 1 |종료: 2]:");
			String search = sc.next();
			if (search.equals("2")) {
				System.out.println("시스템 종료!");
				break;
			} else if (search.equals("1")) {
				System.out.println("조회할 아이디는?: ");
				String id = sc.next();
				J0316_member_dto dto2 = dao.getMemberInfo(id);
				if (dto2 == null) {
					System.out.println("해당 내용 없음");
				} else {
					System.out.print("아이디: " + dto2.getId() + "\t");
					System.out.print("이름: " + dto2.getName() + "\t");
					System.out.print("지역: " + dto2.getArea() + "\t");
					System.out.print("나이: " + dto2.getAge() + "\n");
				}
			}else {
				System.out.println("입력오류 재입력 바람!");
				continue;
			}
		}
		sc.close();
	}

}
