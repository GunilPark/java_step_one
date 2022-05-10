package d_생성자;

import java.util.Scanner;

public class J0302_Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0302_dao dao = new J0302_dao();
		J0302_dto dto1 = new J0302_dto();
		System.out.print("성명?:");
		String name = sc.next();
		System.out.print("지역?:");
		String area = sc.next();
		System.out.print("성별? [남자:m |여자:f ]:");
		String gender = sc.next();
		System.out.print("나이?:");
		int age = sc.nextInt();
		
		dto1.setName(name);
		dto1.setArea(area);
		dto1.setGender(gender);
		dto1.setAge(age);
		
		dao.setPrint(dto1);
		
		sc.close();
	}

}
