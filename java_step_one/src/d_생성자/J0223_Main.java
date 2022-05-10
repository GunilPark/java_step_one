package d_생성자;

import java.util.Scanner;

public class J0223_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0223_Dao dao = new J0223_Dao();
		System.out.println("몇명?");
		int count = sc.nextInt();
		J0222_Dto[] dtos = new J0222_Dto[count];
		for(int k = 0; k<count; k++) {
			System.out.println("성명?");
			String name = sc.next();
			System.out.println("지역?");
			String area = sc.next();
			System.out.println("나이?");
			int age = sc.nextInt();
			System.out.println("몸무게?");
			int weight = sc.nextInt();
			
			dtos[k] = new J0222_Dto(name,area,age,weight);
		}
		
		for(int k = 0; k<count; k++) {
			System.out.print(dtos[k].getName()+"\t");
			System.out.print(dtos[k].getArea()+"\t");
			System.out.print(dtos[k].getAge()+"\t");
			System.out.print(dtos[k].getWeight()+"\t");
			System.out.println(dao.getResult(dtos[k].getWeight()) + "\n");
			
		}

		
		
		sc.close();
	}

}
