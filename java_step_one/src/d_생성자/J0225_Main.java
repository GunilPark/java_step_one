package d_생성자;

import java.text.ParseException;
import java.util.Scanner;

public class J0225_Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		J0225_dao dao = new J0225_dao();
		System.out.print("사원수:");
		int mem = sc.nextInt();
		J0225_dto[] dtos = new J0225_dto[mem];
		for (int k = 0; k < mem; k++) {
			System.out.print("이름:");
			String name = sc.next();
			System.out.print("부서[총무:10|인사:20|재무:30|영업:40]:");
			int part = sc.nextInt();
			System.out.print("성별[남자:1|여자:2]:");
			int sex = sc.nextInt();
			System.out.print("나이:");
			int age = sc.nextInt();
			System.out.print("입사일:[입력예시:20200225]");
			String date = sc.next();
			J0225_dto dto = new J0225_dto(name, part, sex, age, date);
			dtos[k] = dto;
		}

		for (int k = 0; k < mem; k++) {
			System.out.print(dtos[k].name + "\t");
			System.out.print(dao.getPart(dtos[k].part) + "\t");
			System.out.print(dao.getSex(dtos[k].sex) + "\t");
			System.out.print(dtos[k].age + "\t");
			System.out.print(dao.getDate_2(dtos[k]) + "\n");
		}
		
		while(true){
			System.out.println("검색[이름검색:1 |부서검색:2 |성별검색:3 |나이검색:4 |종료: 0]:");
			int search = sc.nextInt();
			switch (search) {
			case 1:
				System.out.print("이름검색:");
				String searchName = sc.next();
				for (int k = 0; k < mem; k++) {
					if (dtos[k].name.indexOf(searchName) != -1) {
						System.out.print(dtos[k].name + "\t");
						System.out.print(dao.getPart(dtos[k].part) + "\t");
						System.out.print(dao.getSex(dtos[k].sex) + "\t");
						System.out.print(dtos[k].age + "\t");
						System.out.print(dao.getDate_2(dtos[k]) + "\n");
					}
				}
				continue;
			case 2:
				System.out.print("부서검색[총무:10|인사:20|재무:30|영업:40]:");
				int searchPart = sc.nextInt();
				for (int k = 0; k < mem; k++) {
					if (dtos[k].part == searchPart) {
						System.out.print(dtos[k].name + "\t");
						System.out.print(dao.getPart(dtos[k].part) + "\t");
						System.out.print(dao.getSex(dtos[k].sex) + "\t");
						System.out.print(dtos[k].age + "\t");
						System.out.print(dao.getDate_2(dtos[k]) + "\n");
					}
				}
				continue;
			case 3:
				System.out.print("성별 검색[남자:1 |여자:2]:");
				int searchSex = sc.nextInt();
				for (int k = 0; k < mem; k++) {
					if (dtos[k].sex == searchSex) {
						System.out.print(dtos[k].name + "\t");
						System.out.print(dao.getPart(dtos[k].part) + "\t");
						System.out.print(dao.getSex(dtos[k].sex) + "\t");
						System.out.print(dtos[k].age + "\t");
						System.out.print(dao.getDate_2(dtos[k]) + "\n");
					}
				}
				continue;
			case 4:
				System.out.print("나이 검색[검색나이 이상인 사람 검색]:");
				int searchAge = sc.nextInt();
				for (int k = 0; k < mem; k++) {
					if (dtos[k].age >= searchAge) {
						System.out.print(dtos[k].name + "\t");
						System.out.print(dao.getPart(dtos[k].part) + "\t");
						System.out.print(dao.getSex(dtos[k].sex) + "\t");
						System.out.print(dtos[k].age + "\t");
						System.out.print(dao.getDate_2(dtos[k]) + "\n");
					}
				}
				continue;
			case 0:
				System.out.print("시스템 종료!");
				sc.close();

			}

			break;
		}

	
	}

}
