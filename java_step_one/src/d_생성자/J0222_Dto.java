package d_생성자;

public class J0222_Dto {
	String name, area;
	int age, weight = 0;

//23일 만든거
	public J0222_Dto(String name, String area, int age, int weight) {
		this.name = name;
		this.area = area;
		this.age = age;
		this.weight = weight;
	}

//22일 만든거
	public J0222_Dto(String name, String area, int age) {

		this.name = name;
		this.area = area;
		this.age = age;
	}

	public int getWeight() {
		return weight;
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

}
