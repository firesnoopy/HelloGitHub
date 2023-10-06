package xxx;

import java.util.Random;
import java.util.Scanner;

public class Test103 {
	public static void main(String[] args) {

	static void lato() {
		int i, j, k, n1, r1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hate number:");
		n1 = scanner.nextInt();

		Random random = new Random();
		int number = 0;
		int mi = 0;
		int sum = n1;
		// 1~4
		for (i = 1; i < 50; i++) {
			if (i % 10 != sum && sum * 10 < 50) {
//			    if(i!=sum*10&&i!=sum*10+1&&i!=sum*10+2&&i!=sum*10+3&&i!=sum*10+4&&i!=sum*10+5&&i!=sum*10+6&&i!=sum*10+7&&i!=sum*10+8&&i!=sum*10+9) 
				if (i + 1 != sum * 10) {
					mi++;
					System.out.printf("%3d ", i);
					number++;
					if (mi % 7 == 0) {
						System.out.println("\n");
						mi = 0;
					}
				} else {
					i += 10;
				}
			}
			// 5~9
			else if (sum * 10 > 49 && i % 10 != sum) {
				mi++;
				System.out.printf("%3d ", i);
				number++;
				if (mi % 7 == 0) {
					System.out.println("\n");
					mi = 0;
				}
			}

		}
		System.out.printf("  總共有%3d數字可選", number);

	
	}

}
