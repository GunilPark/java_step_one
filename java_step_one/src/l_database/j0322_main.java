package l_database;

import java.util.Scanner;

public class j0322_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0322_dao dao = new J0322_dao();

		System.out.print("id는?: ");
		String id = sc.next();
		System.out.print("이름는?: ");
		String name = sc.next();
		System.out.print("지역은?: ");
		String area = sc.next();
		System.out.print("나이는는?: ");
		int age = sc.nextInt();

		J0322_dto dto = new J0322_dto(id, name, area, age);
		
		int checkId = dao.getCheckId(id);
		int result =0;
		if(checkId == 0) {
		result = dao.insertMember(dto);
		}else if(checkId == 1) {
			System.out.println("아이디가 이미 존재합니다.");
		}
		if(result == 1) {
			System.out.println("삽입 완료");
		}else if(result == 0) {
		System.out.println("삽입 실패");
		}
		
		sc.close();
	}

}
