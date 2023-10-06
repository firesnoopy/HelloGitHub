package interface_design;

public class CustomerTest {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		Keyboard k1 = new Keyboard();
		Mouse m1 = new Mouse();
		
		c1.setkKeyboard(k1);
		c1.workwithkeyboard();
		
		c1.setMouse(m1);
		c1.workWithMouse();
		
		Printer p1 =new Printer();
		
		c1.setPrinter(p1);
		c1.workwithPrinter();
	}

}
