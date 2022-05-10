package 박건일;

import java.util.Scanner;

public class J0303_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0303_dao dao = new J0303_dao();
		System.out.print("투표할 인원 수?:");
		int num = sc.nextInt();
		J0303_dto[] dtos = new J0303_dto[num];
		for (int k = 0; k < num; k++) {
			System.out.print("성함은?");
			String name = sc.next();
			System.out.print("지역은?[서울:1 |부산:2 |대전:3 ]");
			int area = sc.nextInt();
			System.out.println("누구를 지지하나요?[이재명:1 |윤석열:2 |심상정:3 |안철수:4 ]");
			int who = sc.nextInt();
			J0303_dto dto = new J0303_dto(name, area, who);
			dtos[k] = dto;
		}
		int 이재명 = 0, 윤석열 = 0, 심상정 = 0, 안철수 = 0;
		for (int k = 0; k < num; k++) {
			switch (dtos[k].who) {
			case 1:
				이재명++;
				continue;
			case 2:
				윤석열++;
				continue;
			case 3:
				심상정++;
				continue;
			case 4:
				안철수++;
				continue;
			}
		}
		J0303_dto dto2 = new J0303_dto(이재명, 윤석열, 심상정, 안철수);

		System.out.println("투표자 현황");
		for (int k = 0; k < num; k++) {
			System.out.print(dtos[k].getName() + "\t");
			System.out.print(dao.getArea(dtos[k].getArea()) + "\t");
			System.out.print(dao.getWho(dtos[k].getWho()) + "\n");

		}
		System.out.println("득표현황");
		System.out.print("이재명" + dto2.이재명 + "표 \t" + "윤석열" + dto2.윤석열 + "표  \t" + "심상정" + dto2.심상정 + "표  \t" + "안철수"
				+ dto2.안철수 + "표 ");
		System.out.println("\n 투표결과!!");
		System.out.println("==============================================================");
		String win = dao.getWinner(dto2);
		System.out.println(win + "님 대통령 당선!!");
		sc.close();
	}

}
