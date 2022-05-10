package 박건일;

public class J0303_dto {
	String name;
	int area,who,이재명,윤석열,심상정,안철수;
	public J0303_dto(String name, int area, int who) {
		this.name = name;
		this.area = area;
		this.who = who;
	}
	public J0303_dto(int 이재명, int 윤석열, int 심상정, int 안철수) {
		this.이재명 = 이재명;
		this.윤석열 = 윤석열;
		this.심상정 = 심상정;
		this.안철수 = 안철수;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getWho() {
		return who;
	}
	public void setWho(int who) {
		this.who = who;
	}
	public int get이재명() {
		return 이재명;
	}
	public void set이재명(int 이재명) {
		this.이재명 = 이재명;
	}
	public int get윤석열() {
		return 윤석열;
	}
	public void set윤석열(int 윤석열) {
		this.윤석열 = 윤석열;
	}
	public int get심성정() {
		return 심상정;
	}
	public void set심성정(int 심상정) {
		this.심상정 = 심상정;
	}
	public int get안철수() {
		return 안철수;
	}
	public void set안철수(int 안철수) {
		this.안철수 = 안철수;
	}
	
	
	
	
}

