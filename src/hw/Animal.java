package hw;

public class Animal {
	private int age;
	private float weight;
	
	public Animal(int age, float weight) {
		this.age = age ;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println(age);
		System.out.println(weight);
	}
	
	public static void main(String[] args) {
		Animal a = new Animal(2,5.0f);
		
		a.speak();
	}

}
