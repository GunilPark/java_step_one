package d_생성자;

public class J0223_Dao {

	String getResult(int weight) {
		String result = "정상";
		if(weight>60) result = "비만";
		return result;
	}
}
