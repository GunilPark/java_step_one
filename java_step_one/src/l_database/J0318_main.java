package l_database;

import java.util.ArrayList;
import java.util.Scanner;

public class J0318_main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		J0318_dao dao = new J0318_dao();
		/*
		System.out.print("조회할 사번을 입력하시오 : ");
		String id = scn.next();
		J0318_dto dto = dao.getMemberInfo(id);
		if(dto == null) {
			System.out.println("조회정보 없음");
		} else {
			System.out.print(dto.getId() + "\t");
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getArea() + "\t");
			System.out.print(dto.getAge() + "\t");
			System.out.print(dto.getDept_code() + "\t");
			System.out.print(dto.getDept_name() + "\n");
		}
		
		System.out.print(" ID 성명 검색 ? ");
		String searchId = scn.next();
		System.out.print(dao.getName(searchId));
		
		System.out.print("성명 전체검색");
		String searchName = scn.next();
		ArrayList<J0318_dto> dtos = dao.getMemberList(searchName);
		*/
		ArrayList<J0318_dto> dtos = null;
		int gubun = 0;
		do {
			System.out.println("검색 [이름만 검색:1, 사원조회:2, 전체조회:3, 종료 : 0");
			if(gubun == 1) {
				System.out.print(" ID 성명 검색 ? ");
				String searchId = scn.next();
				if(searchId == null) {
					System.out.println("조회정보 없음");
				}else {
				System.out.print(dao.getName(searchId));
				}
			}
			else if(gubun == 2) {
				System.out.print("조회할 사번을 입력하시오 : ");
				String id = scn.next();
				J0318_dto dto = dao.getMemberInfo(id);
				if(dto == null) {
					System.out.println("조회정보 없음");
				} else {
					System.out.print(dto.getId() + "\t");
					System.out.print(dto.getName() + "\t");
					System.out.print(dto.getArea() + "\t");
					System.out.print(dto.getAge() + "\t");
					System.out.print(dto.getDept_code() + "\t");
					System.out.print(dto.getDept_name() + "\n");
				}
			}else if(gubun == 3) {
				System.out.print("성명 전체검색");
				String searchName = scn.next();
				dtos = dao.getMemberList(searchName);
			}
			
		}while(gubun != 0);
		if(dtos.size() == 0) {
			System.out.println("검색결과 없음");
		} else {
			System.out.println("id\t이름\t지역\t나이\t부서코드\t부서명");
			for(int i = 0; i<dtos.size(); i++) {
				System.out.print(dtos.get(i).getId() + "\t");
				System.out.print(dtos.get(i).getName() + "\t");
				System.out.print(dtos.get(i).getArea() + "\t");
				System.out.print(dtos.get(i).getAge() + "\t");
				System.out.print(dtos.get(i).getDept_code() + "\t");
				System.out.print(dtos.get(i).getDept_name() + "\n");
			}
		}
		scn.close();
	}

}
