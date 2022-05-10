package l_database;

import java.util.ArrayList;
import java.util.Scanner;

public class J0317_main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0316_dao dao = new J0316_dao();
		ArrayList<J0316_member_dto> dtos = dao.getMemberList();


		for (int k = 0; k < dtos.size(); k++) {
			System.out.print(dtos.get(k).getId() + "\t");
			System.out.print(dtos.get(k).getName() + "\t");
			System.out.print(dtos.get(k).getArea() + "\t");
			System.out.print(dtos.get(k).getAge() + "\n");
		}
		System.out.println("===========================");
		
		System.out.println("검색할 이름은?: ");
		String nameParts = sc.next();
		ArrayList<J0316_member_dto> arr = dao.getNameList(nameParts);
		
		for (int k = 0; k < arr.size(); k++) {
			System.out.print(arr.get(k).getId() + "\t");
			System.out.print(arr.get(k).getName() + "\t");
			System.out.print(arr.get(k).getArea() + "\t");
			System.out.print(arr.get(k).getAge() + "\n");
		}
		
		sc.close();
	}

}
