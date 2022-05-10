package d_생성자;

import java.util.Scanner;

public class J0224_Main {

	public static void main(String[] args) {
		// 이름 국,영,수 ,평균, 석차.
		Scanner sc = new Scanner(System.in);
		J0224_dao dao = new J0224_dao();
		System.out.print("몇명?:");
		int mem = sc.nextInt();
		J0224_dto[] dtos = new J0224_dto[mem];

		for (int k = 0; k < mem; k++) {
			System.out.print("성명?:");
			String name = sc.next();
			System.out.print("국어?:");
			int kor = sc.nextInt();
			System.out.print("영어?:");
			int eng = sc.nextInt();
			System.out.print("수학?:");
			int mat = sc.nextInt();
			J0224_dto dto = new J0224_dto(name, kor, eng, mat);
			int total = dao.getTotal(kor, eng, mat);
			double ave = dao.getAve(total, 3);
			String result = dao.getResult(ave);
			dto.setTotal(total);
			dto.setAve(ave);
			dto.setResult(result);
			dtos[k] = dto;
		}
		for (int k = 0; k < mem; k++) {
			int rank = 1;
			for (int n = 0; n < mem; n++) {
				if(dtos[k].getTotal() < dtos[n].getTotal()) {
					rank++;
				}
				dtos[k].setRank(rank);
			}
		}
		System.out.println();
		for (int k = 0; k < mem; k++) {
			System.out.print(dtos[k].name + "\t");
			System.out.print(dtos[k].kor + "\t");
			System.out.print(dtos[k].eng + "\t");
			System.out.print(dtos[k].mat + "\t");
			System.out.print(dtos[k].total + "\t");
			System.out.print(dtos[k].ave + "\t");
			System.out.print(dtos[k].result + "\t");
			System.out.print(dtos[k].rank + "\n");
		}
		
		do{
			System.out.println("======================================================");
			System.out.println("[ 이름 검색: 1 | 평균 검색: 2 | 시스템종료: 3 ]");
			System.out.println("======================================================");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("찾는이름:");
				String name = sc.next();
				int cnt = 0;
				for (int k = 0; k < mem; k++) {
			
					if(dtos[k].name.indexOf(name) != -1) {
						System.out.print(dtos[k].name + "\t");
						System.out.print(dtos[k].kor + "\t");
						System.out.print(dtos[k].eng + "\t");
						System.out.print(dtos[k].mat + "\t");
						System.out.print(dtos[k].total + "\t");
						System.out.print(dtos[k].ave + "\t");
						System.out.print(dtos[k].result + "\t");
						System.out.print(dtos[k].rank + "\n");
					}else {
						cnt++;
					}
					if(cnt == mem) {
						System.out.println("검색결과 없음");
					}
				}
				continue;
			case 2:
				System.out.print("입력점수 이상인 사람 검색:");
				double point = sc.nextDouble();
				cnt = 0;
				for (int k = 0; k < mem; k++) {
			
					if(point <= dtos[k].ave) {
						System.out.print(dtos[k].name + "\t");
						System.out.print(dtos[k].kor + "\t");
						System.out.print(dtos[k].eng + "\t");
						System.out.print(dtos[k].mat + "\t");
						System.out.print(dtos[k].total + "\t");
						System.out.print(dtos[k].ave + "\t");
						System.out.print(dtos[k].result + "\t");
						System.out.print(dtos[k].rank + "\n");
					}else {
						cnt++;
					}
					if(cnt == mem) {
						System.out.println("검색결과 없음");
					}
				}
				continue;
			case 3:
				System.out.println("시스템종료!");
				break;
			default:
				System.out.println("입력오류!");
			}
			break;
		
		}while(true);
	
		sc.close();
	}

}
