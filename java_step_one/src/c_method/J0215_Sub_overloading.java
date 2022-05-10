package c_method;

public class J0215_Sub_overloading {

	int getTotal(int kor, int eng, int mat) {
		int result = 0;

		result = kor + eng + mat;
		return result;
	}

	int getTotal(int art, int music) {
		int result = 0;
		result = art + music;
		return result;
	}

	int getTotal(int kor, int eng, int mat, int art, int music) {
		int result = 0;
		result = kor + eng + mat + art + music;
		return result;
	}

	int getTotal(String mat, int kor, int eng) {
		int result = 0;

		result = Integer.parseInt(mat) + kor + eng;
		return result;
	}
	
	int getTotal(int music, int art, String a) {
		int result = 0;
		result = art + music + Integer.parseInt(a);
		return result;
	}
}
