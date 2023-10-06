package xxx;

public class Animal {
//	private int age;
//	private float weight;
//	
//	public Animal(int age, float weight) {
//		this.age = age ;
//		this.weight = weight ;
//	}
//	
//	public void speak() {
//		System.out.println("Age is = " +age);
//		System.out.println("weight is = " +weight);
//
//	}
//	
////	public static void main(String[] args) {
////		
//    public void setAge(int age) {
//    	this.age = age ;
//    }
//    
//    public void setweight(float wieight) {
//    	this.weight = weight ;
//    }
	
	private int age;
	private float weight;
	
	public Animal() {
		
	}                //通常會再把無參數建構子保留下來(預設建構子)
	
	public Animal(int age,float weight) {
		this.age = age;
		this.weight = weight;
		
	}
	public void speak() {
		System.out.println("年紀為"+age);
		System.out.println("體重為"+weight+"公斤");
	}	
	//過三年的情境
	public void setAge(int age) {
		this.age = age ;		
	}
	public void setWeight(float weight) {
    	this.weight = weight ;
    }
	
		
	
	public static void main(String[] args) {
		Animal s1 = new Animal(2 , 5.0f);
		
		s1.speak();
		System.out.println("===過了三年===");
		s1.setAge(5);
		s1.setWeight(25.0f);
		s1.speak();
	}
	
}
