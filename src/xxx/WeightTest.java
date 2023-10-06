package xxx;

public class WeightTest {
	public static void main(String[] args) {
		Weightable[] ws = new Weightable[3];   //建立一個陣列的物件 宣告的型別是元素的類型

		ws[0] = new Dog();
		ws[1] = new Powder();
		ws[2] = new Plane();
		for (int i = 0; i < ws.length; i++) {
			ws[i].printWeightTool();
		System.out.println("======================================");
		}
	}
}
