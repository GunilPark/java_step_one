package 박건일;

import java.util.Scanner;

public class J0310_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		boolean result = true;
		while (result) {
			try {
				System.out.print("몇명?:");
				count = sc.nextInt();
				result = false;
			} catch (Exception n) {
				System.out.println("입력 오류 재입력 바랍니다.");
				sc = new Scanner(System.in);
				count = 0;
			}
		}
		J0307_member[] mems = new J0307_member[count];

		for (int k = 0; k < count; k++) {
			System.out.print("성명?:");
			String name = sc.next();
			System.out.print("지역?:");
			String area = sc.next();
			System.out.print("나이?:");
			int age = 0;
			while (true) {
				try {
					age = sc.nextInt();
					break;
				} catch (Exception n) {
					System.out.println("입력 오류 재입력 바랍니다.");
					sc = new Scanner(System.in);
					continue;
				}
				
			}
			J0307_member mem = new J0307_member(name, area, age);
			mems[k] = mem;

		}

		for (int k = 0; k < count; k++) {
			System.out.print(mems[k].getName() + "\t");
			System.out.print(mems[k].getArea() + "\t");
			System.out.print(mems[k].getAge() + "\n");
		}
		boolean search = true;

		while (search) {
			System.out.println("\n==============================");
			System.out.println("[이름검색:1 |지역검색 :2|나이검색:3 |종료:4 ]");
			System.out.println("==============================");
			int num = 0;
			while (true) {
				try {
					num = sc.nextInt();
					break;
				} catch (Exception n) {
					System.out.println("입력 오류 재입력 바랍니다.");
					sc = new Scanner(System.in);
					continue;
				}
			}
			switch (num) {
			case 1:
				System.out.print("이름검색:");
				String searchName = "";
				while (true) {
					try {
						searchName = sc.next();
						break;
					} catch (Exception n) {
						System.out.println("입력 오류 재입력 바랍니다.");
						sc = new Scanner(System.in);
						continue;
					}
				}
				for (int k = 0; k < count; k++) {
					if (mems[k].getName().indexOf(searchName) != -1) {
						System.out.print(mems[k].getName() + "\t");
						System.out.print(mems[k].getArea() + "\t");
						System.out.print(mems[k].getAge() + "\n");
					}
				}
				break;
			case 2:
				System.out.println("지역검색");
				String searchArea = "";
				while (true) {
					try {
						searchArea = sc.next();
						break;
					} catch (Exception n) {
						System.out.println("입력 오류 재입력 바랍니다.");
						sc = new Scanner(System.in);
						continue;
					}
				}
				for (int k = 0; k < count; k++) {
					if (searchArea.equals(mems[k].getArea())) {
						System.out.print(mems[k].getName() + "\t");
						System.out.print(mems[k].getArea() + "\t");
						System.out.print(mems[k].getAge() + "\n");
					}
				}
				break;
			case 3:
				System.out.print("나이검색:");
				int searchAge = 0;
				while (true) {
					try {
						searchAge = sc.nextInt();
						break;
					} catch (Exception n) {
						System.out.println("입력 오류 재입력 바랍니다.");
						sc = new Scanner(System.in);
						continue;
					}
				}
				
				for (int k = 0; k < count; k++) {
					if (searchAge <= mems[k].getAge()) {
						System.out.print(mems[k].getName() + "\t");
						System.out.print(mems[k].getArea() + "\t");
						System.out.print(mems[k].getAge() + "\n");
					}
				}
				break;
			case 4:
				System.out.println("시스템종료!");
				search = false;
				sc.close();
				break;
			default:
				System.out.println("입력오류! 재입력 바람.");
				break;
			}
		}

	}

}
