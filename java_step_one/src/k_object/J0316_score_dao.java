package k_object;

import java.util.ArrayList;

public class J0316_score_dao {

	public J0316_score_dto getScoreInfo() {
		J0316_score_dto dto = new J0316_score_dto("홍길동", 50, 60, 70);

		return dto;
	}

	public void readPrint(J0316_score_dto dto) {
		System.out.print(dto.getName() + "\t");
		System.out.print(dto.getKor() + "\t");
		System.out.print(dto.getEng() + "\t");
		System.out.print(dto.getMat() + "\n");
	}

	public ArrayList<J0316_score_dto> getScoreList() {
		ArrayList<J0316_score_dto> dtos = new ArrayList<>();
		J0316_score_dto dto1 = new J0316_score_dto("홍길동", 50, 60, 70);
		J0316_score_dto dto2 = new J0316_score_dto("이상화", 70, 80, 90);
		dtos.add(dto1);
		dtos.add(dto2);
		return dtos;
	}

	public void readArrayPrint(ArrayList<J0316_score_dto> dtos) {

		for(int k = 0; k < dtos.size(); k++) {
		System.out.print(dtos.get(k).getName() + "\t");
		System.out.print(dtos.get(k).getKor() + "\t");
		System.out.print(dtos.get(k).getEng() + "\t");
		System.out.print(dtos.get(k).getMat() + "\n");
		}
	}

}
