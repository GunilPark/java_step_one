package k_object;

import java.util.ArrayList;

public class J0315_dao {

	public int getTotal(int i, int j) {
		return i + j;
	}

	public J0315_member_dto getMember(String name, String area, int age) {
		J0315_member_dto dto = new J0315_member_dto(name, area, age);

		return dto;
	}

	public J0315_member_dto getMember() {
		J0315_member_dto dto = new J0315_member_dto();
		dto.setName("이상화");
		dto.setArea("서울");
		dto.setAge(28);
		
		return dto;
	}

	public String[] getPerson() {
		String[] strs = new String[2];
		
		strs[1] = "이민석";
		strs[2] = "서울";
		return strs;
	}

	public ArrayList<J0315_member_dto> getMemberList() {
		ArrayList<J0315_member_dto> dtos = new ArrayList<>();
		J0315_member_dto dto1 = new J0315_member_dto("홍길동","대전",25);
		J0315_member_dto dto2 = new J0315_member_dto("김정은","서울",25);
		dtos.add(dto1);
		dtos.add(dto2);
		return dtos;
	}

	public void setPrint(ArrayList<J0315_member_dto> dtos) {
		for (int k = 0; k < dtos.size(); k++) {
			System.out.print("성명: " + dtos.get(k).getName() + "\t");
			System.out.print("지역: " + dtos.get(k).getArea() + "\t");
			System.out.print("나이: " + dtos.get(k).getAge() + "\n");
		}
		
	}

}