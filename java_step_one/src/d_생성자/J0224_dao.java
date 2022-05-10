package d_생성자;

public class J0224_dao {
	int total;
	double ave;
	String result;
	
	public int getTotal(int kor, int eng, int mat) {
		total = kor + eng + mat;
		return total;
	}

	public double getAve(int total, int mem) {
		ave = total/(double)mem;
		String aveS = String.format("%2.1f", ave);
		ave = Double.parseDouble(aveS);
		return ave;
	}

	public String getResult(double ave) {
		if(ave >90) {
			result = "수";
		}else if(ave >80) {
			result = "우";
		}else if(ave >70) {
			result = "미";
		}else if(ave >60) {
			result = "양";
		}else {
			result = "가";
		}
		
		return result;
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

}
