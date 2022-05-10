package d_생성자;

public class J0218_Main_2 {

	public static void main(String[] args) {
		J0218_dto[] dtos = new J0218_dto[2];
		J0218_dao dao = new J0218_dao();
		J0218_dto dto1 = new J0218_dto("홍길동",50,60,70);
		J0218_dto dto2 = new J0218_dto("이순신",30,40,50);
		dtos[0]= dto1;
		dtos[1]= dto2;
		dao.setTotal(dtos[0]);
		dao.setTotal(dtos[1]);

		for(int k = 0; k< dtos.length; k++) {
		System.out.print(dtos[k].getName() + "\t");
		System.out.print(dtos[k].getKor() + "\t");
		System.out.print(dtos[k].getEng() + "\t");
		System.out.print(dtos[k].getMat() + "\t");
		System.out.println(dtos[k].getTotal());
		}
	}	

}
