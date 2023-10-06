package xxx;

import java.util.Scanner;

public class Hw3_2Advanced {
	public static void main(String[] args) {
		int random;
		random = (int) (Math.random() * 101);
//		System.out.println(random);

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!請輸入0~100間的整數");

		while (true) { // 無窮迴圈
			int number = sc.nextInt();
			if (number == random) {
				System.out.println("答對了!答案就是" + random);
				break; // 猜對即停止迴圈
			} else if (number < random) {
				System.out.println("猜的數字小於正確答案請繼續猜");
			} else
				System.out.println("猜的數字大於正確答案請繼續猜");

		}
	}

}


