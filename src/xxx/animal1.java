package xxx;

public class animal1 {
	
	private int age;
	private float weight;
	
	public animal1(int age ,float weight) {
		this.age = age;
		this.weight =weight;
	}
	
	public void speak() {
		
		System.out.println("年紀是"+age);
		System.out.println("體重是"+weight);
		
	}
	public static void main(String[] args) {
		animal1 aaa = new animal1(2,5.0f);
		
		aaa.speak();
	}

}
