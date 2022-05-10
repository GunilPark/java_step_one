package l_database;

import java.util.ArrayList;
import java.util.Scanner;

public class J0323_student_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0323_student_dao dao = new J0323_student_dao();

		int gubun = 0;
		do {
			System.out.print("조회 :1, 등록:2, 수정:3, 삭제:4, 종료:0 ? ");
			gubun = sc.nextInt();
			if (gubun == 1) {
				ArrayList<J0323_student_dto> dtos = dao.getStudentList();
				if (dtos.size() == 0) {
					System.out.println("출력 내용 없음");
				} else {
					System.out.println("학년\t반\t번호\t이름\t국어\t영어\t수학");
					for (int i = 0; i < dtos.size(); i++) {
						System.out.print(dtos.get(i).getSyear() + "\t");
						System.out.print(dtos.get(i).getSclass() + "\t");
						System.out.print(dtos.get(i).getNo() + "\t");
						System.out.print(dtos.get(i).getName() + "\t");
						System.out.print(dtos.get(i).getKor() + "\t");
						System.out.print(dtos.get(i).getEng() + "\t");
						System.out.print(dtos.get(i).getMat() + "\n");
					}
				}
			} else if (gubun == 2) {
				System.out.print("학년?:");
				String syear = sc.next();
				System.out.print("반?:");
				String sclass = sc.next();
				System.out.print("번호?:");
				String no = sc.next();
				int check = dao.getCheckStu(syear, sclass, no);
				if (check == 1) {
					System.out.println("중복된 학년.반.번호~");
				} else if (check == 0) {
					System.out.print("이름?:");
					String name = sc.next();
					System.out.print("국어?:");
					int kor = sc.nextInt();
					System.out.print("영어?:");
					int eng = sc.nextInt();
					System.out.print("수학?:");
					int mat = sc.nextInt();

					J0323_student_dto dto = new J0323_student_dto(syear, sclass, no, name, kor, eng, mat);
					dao.insertStudent(dto);
				}

			} else if (gubun == 3) {
				System.out.print("학년?:");
				String syear = sc.next();
				System.out.print("반?:");
				String sclass = sc.next();
				System.out.print("번호?:");
				String no = sc.next();
				int check = dao.getCheckStu(syear, sclass, no);
				if (check == 0) {
					System.out.println("없는 학년.반.번호~");
				} else if (check == 1) {
					System.out.print("바꿀 성명? ");
					String name = sc.next();
					System.out.print("바꿀 국어? ");
					int kor = sc.nextInt();
					System.out.print("바꿀 영어? ");
					int eng = sc.nextInt();
					System.out.print("바꿀 수학? ");
					int mat = sc.nextInt();
					J0323_student_dto dto = new J0323_student_dto(syear, sclass, no, name, kor, eng, mat);
					int result = dao.updateStudent(dto);
					if (result == 1) {
						System.out.println("수정 성공");
					} else {
						System.out.println("실패");
					}

				}

			} else if (gubun == 4) {
				System.out.print("학년?:");
				String syear = sc.next();
				System.out.print("반?:");
				String sclass = sc.next();
				System.out.print("번호?:");
				String no = sc.next();
				int check = dao.getCheckStu(syear, sclass, no);
				if (check == 0) {
					System.out.println("없는 학년.반.번호~");
				} else if (check == 1) {
					int result = dao.deleteStudent(syear, sclass, no);
					if (result == 1) {
						System.out.println("삭제 성공");
					} else {
						System.out.println("실패");
					}

				}

			} else if (gubun < 0 || gubun > 4) {
				System.out.println("잘못된 입력입니다.");
			}
		} while (gubun != 0);
		System.out.println("시스템 종료");

		sc.close();
	}
}
