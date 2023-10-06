package hw;

public interface WeightTest {
	
	void getWeightMethod();
	
	public static void main(String[] args) {
		WeightTest[] w = new WeightTest[3];
		w[0] = new Dog();
		w[1] = new Powder();
		w[2] = new Plane();
		for (int n = 0; n < w.length; n++) {
			w[n].getWeightMethod();
			
		}
		
		
	
	}

}

