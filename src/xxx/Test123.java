package xxx;

public class Test123 {
	int score = 80;
	int study, play;
	
	public void play(int hours) {
		score = score - hours;
	}
	
	public void study(int hours) {
		score += hours;
	}
	
	public static void main(String[] args) {
		Test123 t1 = new Test123();
		Test123 t2 = new Test123();
		System.out.println(t1.score);
		
		t1.play(2);
		t1.study(20);
		System.out.println(t1.score);
//		int x = 2;
//		int y = 1;
//		if (x == 2) 
//		    if (y == 2) {
//		        System.out.print("x = 2, ");
//		    }
//		    else
//		        System.out.print("y = 2, ");
//		
//		if ( x + y == 3)
//		    System.out.print("x+y = 3");
	}
	

}
