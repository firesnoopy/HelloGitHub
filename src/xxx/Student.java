package xxx;

public class Student {

	int score = 80;
	int play;
	int study;

	public void play(int hours) {
		score = score - hours;
	}

	public void study(int hours) {
		score = score + hours;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		System.out.println(s1.score);
		System.out.println(s2.score);

		s1.play(5);
		s1.study(2);
		s2.play(9);
		s2.study(1);

		System.out.println(s1.score);
		System.out.println(s2.score);

	}

}
