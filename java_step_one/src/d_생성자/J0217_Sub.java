package d_생성자;

public class J0217_Sub {
	String name, area;
	int age;

	J0217_Sub() {
	}
	
	J0217_Sub(String name, int age, String area) {
		this.name = name;
		this.age = age;
		this.area = area;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
	
	void setArea(String area) {
		this.area = area;
	}

	String getArea() {
		return area;
	}
	
	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}
}
