package xxx;

public class Elephant extends Animal {
	
	private String name;
	
	public Elephant() {
		
	}
	
    
	public Elephant(int age, float weight, String name) {
		super(age, weight);            //呼叫父類別建構子
		this.name =name;
	}
	
//	加上標註,編譯器就會以override規則檢視此方法
//	只要違反規則,就會有編譯失敗的提示 (安心)
	
	@Override   //Annotation(標註) JDK5 :給Java編譯器或相關工具(如框架)的資訊
	public void speak() {
		super.speak();                   //呼叫父類別方法
		System.out.println("名字是"+ name);
	}
	
//	此方法改寫失敗但不會抱錯,因為語法被當作overloading
//	一個是子類別speak(int data),一個是父類別speak()
//	public void speak(int data) {
//		super.speak();
//		System.out.println("名字是"+ name);
//	}


}
