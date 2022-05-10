package k_object;

import java.util.ArrayList;

public class J0316_main {

	public static void main(String[] args) {
		J0316_score_dao dao = new J0316_score_dao();
		J0316_score_dto dto = dao.getScoreInfo();

		dao.readPrint(dto);

		ArrayList<J0316_score_dto> dtos = dao.getScoreList();
		
		dao.readArrayPrint(dtos);
			
		
	}

}
