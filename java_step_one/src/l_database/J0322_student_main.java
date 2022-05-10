package l_database;

import java.util.Scanner;

public class J0322_student_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0322_student_dao dao = new J0322_student_dao();
		System.out.print("학년은?:");
		String syear = sc.next();
		System.out.print("반은?:");
		String sclass = sc.next();
		System.out.print("번호?:");
		String no = sc.next();
		System.out.print("이름은?:");
		String name = sc.next();
		System.out.print("국어?:");
		int kor = sc.nextInt();
		System.out.print("영어?:");
		int eng = sc.nextInt();
		System.out.print("수학?:");
		int mat = sc.nextInt();

		J0322_student_dto dto = new J0322_student_dto(syear, sclass, no, name, kor, eng, mat);
		int checkStudnt = dao.getCheckStudunt(syear, sclass, no);

		if (checkStudnt == 0) {
			System.out.println("등록 완료");
			dao.insertStudent(dto);
		} else if (checkStudnt == 1) {
			System.out.println("학생이 이미 존재합니다.");
		}
		
		sc.close();
	}

}
