package xxx;

import java.util.Scanner;

public class RegexTest {
	
	public static void main(String[] args) {
		String regex = "^09\\d{8}$";
		Scanner sc = new Scanner(System.in);
		String tel = sc.next();
		
		if(tel.matches(regex)) {
			System.out.println("OK");
		} else {
			System.out.println("No good");
		}
	}
		
	

}
