package d_생성자;

import java.util.Scanner;

public class J0218_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0218_dao dao = new J0218_dao();
		
		System.out.println(" 성명? ");
		String name = sc.next();
		System.out.println(" 국어점수? ");
		int kor = sc.nextInt();
		System.out.println(" 영어점수? ");
		int eng = sc.nextInt();
		System.out.println(" 수학점수? ");
		int mat = sc.nextInt();

		J0218_dto dto = new J0218_dto(name, kor, eng, mat);
		
		dao.setTotal(dto);
		System.out.println("total :" + dto.getTotal());
		dao.setAva(dto,dto.getTotal());
		System.out.println("ava : " + dto.getAva());
		String result = dao.getResult(dto);
		System.out.println("result : " + result);
		sc.close();
		
	}

}
