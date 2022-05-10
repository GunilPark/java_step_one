package 박건일;

public class J0303_dao {

	public String getWho(int who) {
		String result = "기권";
		if(who == 1) {
			result = "이재명";
		}else if(who == 2) {
			result = "윤석열";
		}else if(who == 3) {
			result = "심상정";
		}else if(who == 4) {
			result = "안철수";
		}
		return result;
	}

	public String getArea(int area) {
		String result = "외국인";
		if(area == 1) {
			result = "서울";
		}else if(area == 2) {
			result = "부산";
		}else if(area == 3) {
			result = "대전";
		}
		return result;
	}

	public String getWinner(J0303_dto dto2) {
		String result ="";
		if(dto2.이재명>dto2.심상정 && dto2.이재명 > dto2.윤석열+dto2.안철수) {
			result = "이재명" + "("+dto2.이재명+"표)";
		}else if(dto2.심상정>dto2.이재명 && dto2.심상정 > dto2.윤석열+dto2.안철수) {
			result = "심상정" + "("+dto2.심상정+"표)";
		}else if(dto2.윤석열+dto2.안철수>dto2.심상정 && dto2.윤석열+dto2.안철수 > dto2.이재명) {
			result = "윤석열" + "("+(dto2.윤석열+dto2.안철수)+"표)";
		}
		return result;
	}



}
