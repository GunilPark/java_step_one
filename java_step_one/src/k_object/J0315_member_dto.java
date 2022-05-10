package k_object;

public class J0315_member_dto {
	private String name, area;
	private int age;

	public J0315_member_dto(String name, String area, int age) {
		this.name = name;
		this.area = area;
		this.age = age;
	}

	public J0315_member_dto() {
		
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}