package interface_design;

public class Computer {
	private Keyboard keyboard ;
	private Mouse mouse;
	private Printer printer;
	
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard =keyboard;
	}
	public void setMouse(Mouse mouse) {
		this.mouse =mouse;

	}
	public void setPrinter(Printer printer) {
		this.printer = printer ;
	
	}
	public void workwithKeyboard() {
		keyboard.work();
		mouse.work();
		printer.work();
	}




}
