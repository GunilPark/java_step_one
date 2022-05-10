package h_추상;

public class J0304_main {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		//String voice = tiger.getVoice("호랭이");
		String voice = tiger.getSound();
		int weight = tiger.getWeight();
		System.out.println("tigerVoice : " + voice);
		System.out.println("tigerWeight : " + weight);

		
		Dog dog = new Dog();
		voice = dog.getSound();
		weight = dog.getWeight();
		System.out.println("dogVoice : " + voice);
		System.out.println("dogWeight : " + weight);
		
		Cat cat = new Cat();
		voice = cat.getSound();
		weight = cat.getWeight();
		System.out.println("catVoice : " + voice);
		System.out.println("catWeight : " + weight);

	}
}