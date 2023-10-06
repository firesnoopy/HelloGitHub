package xxx;

public class Elephant1 extends animal1 {
	private String name ;
	
	public Elephant1(int age, float weight, String name) {
		super(age,weight);
		this.name = name ;
	}
	public void speak() {
		super.speak();
		System.out.println("名字是"+name);
	
	}
	public static void main(String[] args) {
		animal1 aa1 = new animal1(3,8.0f);
		Elephant1 ee1 = new Elephant1(8,1200.0f,"大象");
		aa1.speak();
		ee1.speak();
	}

}
