package hw;

public class Student {
	private int study;
	private int play;
	private int score = 80;
	
	public Student(int study,int play) {
		this.study = study ;
		this.play = play;
		score = score + study - play ;
		
	}

	
		
	
	
	public static void main(String[] args) {
		Student s1 = new Student(2,60);
		Student s2 = new Student(3,7);
		System.out.println("分數是"+s1.score);
		System.out.println("分數是"+s2.score);


		
		
	}

}
