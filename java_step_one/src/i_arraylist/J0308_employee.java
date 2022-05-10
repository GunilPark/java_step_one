package i_arraylist;

public class J0308_employee {
//					성명 	  직급	 부서명[1총무,2재무,3영업]입사일[20200308]
	private String name, rank, depart, entryDate;
	private int salary; //급여
	public J0308_employee(String name, String rank, String depart, String entryDate, int salary) {
		this.name = name;
		this.rank = rank;
		this.depart = depart;
		this.entryDate = entryDate;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getRank() {
		return rank;
	}
	public String getDepart() {
		return depart;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
