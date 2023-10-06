package xxx;

public class CubeTest {
	public static void main(String[] args) {
		try {
			Cube c1 = new Cube();
			c1.setLength(5);
			System.out.println(c1.getVolum());
		} catch (CubeException e) {
			
			
			e.printStackTrace();
		}
		
	}

}
