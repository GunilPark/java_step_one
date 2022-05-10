package d_생성자;

public class J0218_dto {

	String name;
	int kor, eng, mat, total, ava;
	
	public J0218_dto(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	
	void setName(String name) {
		this.name = name;
	}



	void setKor(int kor) {
		this.kor = kor;
	}



	void setEng(int eng) {
		this.eng = eng;
	}



	void setMat(int mat) {
		this.mat = mat;
	}



	void setTotal(int total) {
		this.total = total;
	}



	void setAva(int ava) {
		this.ava = ava;
	}



	String getName() {
		return name;
	}
	int getKor() {
		return kor;
	}
	int getEng() {
		return eng;
	}
	int getMat() {
		return mat;
	}
	int getTotal() {
		return total;
	}
	int getAva() {
		return ava;
	}
	
	
	
	
}
