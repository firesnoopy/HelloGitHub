package xxx;

import java.util.Scanner;

public class Hw3_2 {
// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
// 對則顯示正確訊息，如圖示結果：

	public static void main(String[] args) {
		int random;
		random = (int) (Math.random() * 10); // 產生0~9的亂數  Math.random()是一種類別方法(模組19)
//		System.out.println(random);

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");

		while (true) {                       // 無窮迴圈
			int number = sc.nextInt();
			if (number == random) {
				System.out.println("答對了!答案就是" + random);
				break; 						// 猜對即停止迴圈
			} else {
				System.out.println("猜錯了請繼續猜");
			}

		}
	}

}
