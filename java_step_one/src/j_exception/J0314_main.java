package j_exception;

public class J0314_main {

	public static void main(String[] args) {
		J0314_dao dao = new J0314_dao();
//		String score = "100";
		String kor = "백";
		String eng = "80";
		kor = dao.getTotal2(kor);
		int total = 0;
		try {
			total = dao.getTotal(kor, eng);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("total: " + total);
	}
}
