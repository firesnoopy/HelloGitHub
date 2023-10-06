package Hw10;

import java.util.Scanner;

public class Hw10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("輸入一個任意數：");

			if (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.println("輸入錯誤");
			} else {
				double number = sc.nextDouble();
				sc.nextLine();
				System.out.println("(1)千分位(2)百分比(3)科學記號：");
				if (!sc.hasNextInt())
					continue;
				int number2 = sc.nextInt();
				switch (number2) {
				case 1 -> System.out.printf("%,d", (int) number);
				case 2 -> System.out.printf("%.0f%%", number * 100);
				case 3 -> System.out.printf("%.1e", number);
				}
				flag = false;

			}
		}
		sc.close();

	}

}
