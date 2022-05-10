package d_생성자;

class J0218_dao {

	int getTotal(J0218_dto dto) {
		int total = dto.getKor() + dto.getEng() +dto.getMat();
		
		return total;
	}

	void setTotal(J0218_dto dto) {
		int total = dto.getKor() + dto.getEng() +dto.getMat();
		dto.setTotal(total);
	}

	void setAva(J0218_dto dto, int total) {
		int ava = total/3;
		dto.setAva(ava);
	}

	public String getResult(J0218_dto dto) {
		String result = "";
		if(100>=dto.getAva() && dto.getAva() > 90 ) {
			result = "수";
		}else if(90>=dto.getAva() && dto.getAva() > 80) {
			result = "우";
		}else if(80>=dto.getAva() && dto.getAva() > 70) {
			result = "미";
		}else if(70>=dto.getAva() && dto.getAva() > 60) {
			result = "양";
		}else if(60>=dto.getAva() && dto.getAva() > 0) {
			result = "가";
		}
		return result;
	}


	
}
