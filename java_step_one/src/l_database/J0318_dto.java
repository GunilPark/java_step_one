package l_database;

public class J0318_dto {
	private String id, name, area, dept_code, dept_name;
	private int age;
	public J0318_dto(String id, String name, String area, String dept_code, String dept_name, int age) {
		this.id = id;
		this.name = name;
		this.area = area;
		this.dept_code = dept_code;
		this.dept_name = dept_name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDept_code() {
		return dept_code;
	}
	public void setDept_code(String dept_cod) {
		this.dept_code = dept_cod;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
}
