package d_생성자;

public class J0302_dao {

	public void setPrint(J0302_dto dto1) {
		System.out.println(dto1.getName());
		System.out.println(dto1.getArea());
		System.out.println(getGenderName(dto1.getGender()));
		System.out.println(dto1.getAge());
	}
	
	String getGenderName(String mf){
		String gender = "모름";
		if(mf.equals("m")) {
			gender = "남성";
		}else if(mf.equals("f")) {
			gender = "여성";
		}
		return gender;
	}


	
}
