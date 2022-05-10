package d_생성자;

import java.util.Scanner;

public class J0222_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String aa = "가나다라마";
//		System.out.println("검색");
//		String find = sc.next();
//		System.out.println(aa.indexOf(find));

		System.out.println("몇명?");

		int count = sc.nextInt();

		J0222_Dto[] dtos = new J0222_Dto[count];

		for (int k = 0; k < count; k++) {
			System.out.print("성명?");
			String name = sc.next();
			System.out.print("지역?");
			String area = sc.next();
			System.out.print("나이?");
			int age = sc.nextInt();

			J0222_Dto dto = new J0222_Dto(name, area, age);
			dtos[k] = dto;
		}
		for (int k = 0; k < count; k++) {
			System.out.print(dtos[k].name + "\t");
			System.out.print(dtos[k].area + "\t");
			System.out.print(dtos[k].age + "\n");
		}
		System.out.println("===============================");
		System.out.println("성명검색?");
		String search = sc.next();

		int cnt = 0;
		for (int k = 0; k < count; k++) {
			if (dtos[k].getName().indexOf(search) != -1) {
				System.out.print(dtos[k].name + "\t");
				System.out.print(dtos[k].area + "\t");
				System.out.print(dtos[k].age + "\n");
				cnt++;
				
			}
		}
		if(cnt ==0) {
			System.out.println("검색내용없음");
		}
		sc.close();
	}

}
