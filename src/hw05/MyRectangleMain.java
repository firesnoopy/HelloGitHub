//• 請另外建立一個MyRectangleMain類別,此類別只有main方法
//(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果

package hw05;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle m1 = new MyRectangle();
		m1.setWidth(10);
		m1.setDepth(20);
		System.out.println(m1.getArea());
		
		MyRectangle m2 = new MyRectangle(10,20);
		System.out.println(m2.getArea());
	}

}
