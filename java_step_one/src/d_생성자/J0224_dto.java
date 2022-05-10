package d_생성자;

public class J0224_dto {
	String name;
	int kor, eng, mat = 0;
	int total;
	double ave;
	String result;
	int rank;

	public J0224_dto(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}

	public void setAve(double ave) {
		this.ave = ave;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getTotal() {
		return total;
	}

	public double getAve() {
		return ave;
	}

	public String getResult() {
		return result;
	}

	public int getRank() {
		return rank;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}



}
