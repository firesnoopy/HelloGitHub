package xxx;

public class PolyAnimal extends Animal {

	public static void main(String[] args) {

		Animal[] e = new Animal[3];

		e[0] = new Animal(3, 8.0f);
		e[1] = new Elephant(2, 1200.0f, "大象");
		e[2] = new Elephant(10, 2200.0f, "大象");

		for (int i = 0; i < e.length; i++) {
			e[i].speak();
		System.out.println("======================================");
		}
	}

}
