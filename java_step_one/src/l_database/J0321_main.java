package l_database;

import java.util.ArrayList;
import java.util.Scanner;

public class J0321_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0321_dao dao = new J0321_dao();
		int gubun = 0;
		while (true) {
			System.out.print("[학년검색 :1 |이름검색:2 |학년.반.번호 검색:3 |종료:0 ]");
			gubun = sc.nextInt();
			if (gubun == 1) {
				System.out.print("검색 학년[1|2|3]?:");
				String syear = sc.next();
				ArrayList<J0321_dto> dtos = dao.getYearList(syear);

				if (dtos.size() == 0) {
					System.out.println("없는 학년입니다.!");
				} else {
					for (int k = 0; k < dtos.size(); k++) {
						System.out.print("학년: " + dtos.get(k).getSyear() + "\t");
						System.out.print("반: " + dtos.get(k).getSclass() + "\t");
						System.out.print("번호: " + dtos.get(k).getNo() + "\t");
						System.out.print("이름: " + dtos.get(k).getName() + "\t");
						System.out.print("국어: " + dtos.get(k).getKor() + "\t");
						System.out.print("영어: " + dtos.get(k).getEng() + "\t");
						System.out.print("수학: " + dtos.get(k).getMat() + "\n");
					}
				}
			} else if (gubun == 2) {
				System.out.print("이름검색?:");
				String name2 = sc.next();
				ArrayList<J0321_dto> dtos = dao.getNameList(name2);

				if (dtos.size() == 0) {
					System.out.println("그런 학생 없음!");
				} else {
					for (int k = 0; k < dtos.size(); k++) {

						System.out.print("학년: " + dtos.get(k).getSyear() + "\t");
						System.out.print("반: " + dtos.get(k).getSclass() + "\t");
						System.out.print("번호: " + dtos.get(k).getNo() + "\t");
						System.out.print("이름: " + dtos.get(k).getName() + "\t");
						System.out.print("국어: " + dtos.get(k).getKor() + "\t");
						System.out.print("영어: " + dtos.get(k).getEng() + "\t");
						System.out.print("수학: " + dtos.get(k).getMat() + "\n");
					}
				}
			} else if (gubun == 3) {
				System.out.print("학년?: ");
				String syear = sc.next();
				System.out.print("반?: ");
				String sclass = sc.next();
				System.out.print("번호?: ");
				String no = sc.next();
				J0321_dto dto = dao.getStudent(syear, sclass, no);

				if (dto == null) {
					System.out.println("그런 학생 없음!");
				} else {
					System.out.print("학년: " + dto.getSyear() + "\t");
					System.out.print("반: " + dto.getSclass() + "\t");
					System.out.print("번호: " + dto.getNo() + "\t");
					System.out.print("이름: " + dto.getName() + "\t");
					System.out.print("국어: " + dto.getKor() + "\t");
					System.out.print("영어: " + dto.getEng() + "\t");
					System.out.print("수학: " + dto.getMat() + "\n");
				}
			} else if (gubun == 0) {
				System.out.println("시스템 종료!");
				break;
			}

		}

		sc.close();
	}

}
