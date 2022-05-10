package c_method;

public class J0215_5_Main {

	public static void main(String[] args) {
		J0215_5_Sub method = new J0215_5_Sub();

		String[] data = new String[3];
		method.setData(data,"이상화","90","80");
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
