package d_생성자;

public class J0216_생성자_Sub {
	J0216_생성자_Sub(String name){
		System.out.println(" name : " + name);
	}
	
	J0216_생성자_Sub(String name, int age){
		System.out.println(" name : " + name + " \n age : " + age);
	}
	
	J0216_생성자_Sub(){
		
	}
	
	int getTotal(int a, int b) {
		return a + b;
	}

}
