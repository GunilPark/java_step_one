package d_생성자;

public class J0217_Sub_2 {
	String name;
	int kor, eng, mat, total;

	public J0217_Sub_2(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
	

	public J0217_Sub_2(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
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

	public void setTotal() {
		total = kor + eng + mat;
	}

	public int getTotal() {
		return total;
	}

}
