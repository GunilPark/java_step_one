package l_database;

public class J0322_student_dto {
	private String syear,sclass,no,name;
	private int kor,eng,mat;
	public J0322_student_dto(String syear, String sclass, String no, String name, int kor, int eng, int mat) {
		this.syear = syear;
		this.sclass = sclass;
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
}
