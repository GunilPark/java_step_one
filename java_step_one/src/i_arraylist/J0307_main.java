package i_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class J0307_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList<J0307_member> dtos = new ArrayList<>();
		ArrayList<J0307_studunt> stus = new ArrayList<>();
		System.out.print("몇명 입력 받으시겠습니까?:");
		int count = sc.nextInt();
		
		for(int k = 0; k < count; k++) {
			System.out.print("성함은?:");
			String name = sc.next();
			System.out.print("국어는?:");
			int kor = sc.nextInt();
			System.out.print("영어는?:");
			int eng = sc.nextInt();
			System.out.print("수학은?:");
			int mat = sc.nextInt();
			J0307_studunt stu = new J0307_studunt();
			stu.setName(name);
			stu.setKor(kor);
			stu.setEng(eng);
			stu.setMat(mat);
			stus.add(stu);
		}
		System.out.println();
		for(int k = 0; k < count; k++) {
			System.out.print(stus.get(k).getName() + "\t");
			System.out.print(stus.get(k).getKor() + "\t");
			System.out.print(stus.get(k).getEng() + "\t");
			System.out.print(stus.get(k).getMat() + "\n");
		}
		
		sc.close();
		/*
		for(int k = 0; k < count; k++) {
			System.out.print("성명은?:");
			String name = sc.next();
			System.out.print("지역은?:");
			String area = sc.next();
			System.out.print("나이는?:");
			int age = sc.nextInt();
			J0307_member dto = new J0307_member(name, area, age);
			dtos.add(dto);
			
		}
		for(int k = 0; k < count; k++) {
			System.out.print(dtos.get(k).getName() + "\t");
			System.out.print(dtos.get(k).getArea() + "\t");
			System.out.print(dtos.get(k).getAge() + "\n");
		}
		*/
		

		/*
		ArrayList<String> arr = new ArrayList<>();
		J0307_member[] mems = new J0307_member[2];
		int size = arr.size();
		System.out.println("size:" + size);
		arr.add("1등 쥐");
		size = arr.size();
		System.out.println("size:" + size);
		arr.add("2등 호랑이");
		size = arr.size();
		System.out.println("size:" + size);

		System.out.println("1등:" + arr.get(0));
		System.out.println("2등:" + arr.get(1));

		arr.remove(0);
		System.out.println("1등:" + arr.get(0));
		arr.add(1, "3등 소");
		arr.add(0, "1등 쥐");
		System.out.println("1등:" + arr.get(0));
		System.out.println("2등:" + arr.get(1));
		System.out.println("3등:" + arr.get(2));

		arr.set(1, "1등 수정 용");
		System.out.println("1등:" + arr.get(0));
		System.out.println("2등:" + arr.get(1));
		System.out.println("3등:" + arr.get(2));

		for (int k = 0; k < arr.size(); k++) {
			System.out.println(arr.get(k));
		}
		System.out.println("====================================");
		
		ArrayList<J0307_member> dtos = new ArrayList<>();
		
		J0307_member member1 = new J0307_member("홍길동","한국",25);
		J0307_member member2 = new J0307_member("시미켄","일본",37);
		dtos.add(member1);
		dtos.add(member2);
		dtos.add(new J0307_member("김정은","북한", 35));
		mems[0] = member1;
		mems[1] = member2;
		
		for(int k = 0; k < mems.length; k++) {
			dtos.add(mems[k]);
		}
		
		
		for(int k = 0; k < dtos.size(); k++) {
			System.out.print("성명:" + dtos.get(k).getName() + "\t");
			System.out.print("주소:" + dtos.get(k).getArea() + "\t");
			System.out.print("나이:" + dtos.get(k).getAge() + "\n");
		}
		System.out.println("===========================================");
		
		ArrayList<J0307_studunt> stu = new ArrayList<>();
		J0307_studunt mem1 = new J0307_studunt();
		J0307_studunt mem2 = new J0307_studunt();
		mem1.setName("이재명");
		mem1.setKor(30);
		mem1.setEng(40);
		mem1.setMat(50);
		mem2.setName("윤석열");
		mem2.setKor(60);
		mem2.setEng(70);
		mem2.setMat(80);
		
		stu.add(mem1);
		stu.add(mem2);
		
		for(int k = 0; k < stu.size(); k++) {
			System.out.print("성명:" + stu.get(k).getName() + "\t");
			System.out.print("국어:" + stu.get(k).getKor() + "\t");
			System.out.print("영어:" + stu.get(k).getEng() + "\t");
			System.out.print("수학:" + stu.get(k).getMat() + "\n");
		}
		*/
	}

}
