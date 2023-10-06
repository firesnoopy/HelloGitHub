package xxx;

import java.io.File;

public class TestDir {
	public static void main(String[] args) {
		File dir = new File("C:\\javawork\\hello.txt");
		
		if(dir.delete()) {
			System.out.println("刪除成功");
		}else {
			System.out.println("False");
		}
		
		

	}
}
