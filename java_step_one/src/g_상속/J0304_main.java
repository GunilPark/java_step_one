package g_상속;

public class J0304_main {

	public static void main(String[] args) {
		B_child child = new B_child();
		C_child c_child = new C_child();
		String area = child.getArea();
		System.out.println("자식  area : " + area);
		String name = child.getName();
		System.out.println("부모 name : " + name);
		int age = child.getAge();
		System.out.println("부모 age : " + age);
		c_child.getArea();
	}

}
