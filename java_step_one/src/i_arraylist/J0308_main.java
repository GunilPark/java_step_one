package i_arraylist;

import java.text.ParseException;
import java.util.Scanner;

public class J0308_main {

	public static void main(String[] args) throws ParseException {
		J0308_dao dao = new J0308_dao();
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하실 사원 수는?:");
		int mem = sc.nextInt();
		J0308_employee[] emps = new J0308_employee[mem];

		for (int k = 0; k < mem; k++) {
			System.out.print("성명은?:");
			String name = sc.next();
			System.out.print("직급은?:");
			String rank = sc.next();
			System.out.print("부서는?[총무:1|재무:2|영업:3]:");
			String depart = sc.next();
			System.out.print("입사일은?[ex:20200320]:");
			String entryDate = sc.next();
			System.out.print("원급은?:");
			int salary = sc.nextInt();
			J0308_employee emp = new J0308_employee(name, rank, depart, entryDate, salary);
			emps[k] = emp;
			
		}
		System.out.println();
		System.out.println("===================================================");
		System.out.print("성명" + "\t" + "직급" + "\t" + "부서명" + "\t" + "입사일" + "\t \t" + "급여" + "\n");
		System.out.println("===================================================");
		for (int k = 0; k < mem; k++) {
			System.out.print(emps[k].getName() + "\t");
			System.out.print(emps[k].getRank() + "\t");
			System.out.print(dao.getDepart(emps[k]) + "\t");
			System.out.print(dao.getEntryDate(emps[k]) + "\t");
			System.out.print(dao.getSalary(emps[k]) + "\n");
			
		}
		

		sc.close();
	}

}
