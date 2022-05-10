package d_생성자;

public class J0225_dto {
	String name;
	int part, sex, age;
	String date;

	public J0225_dto(String name, int part, int sex, int age, String date) {
		this.name = name;
		this.part = part;
		this.sex = sex;
		this.age = age;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPart() {
		return part;
	}

	public void setPart(int part) {
		this.part = part;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



}
