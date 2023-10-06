package hw02;

public class Homework_2 {
	public static void main(String[] args) {

		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int n = 1; n <= 1000; n++) {
			if (n % 2 == 0) {
				sum = sum + n;
			}
		}
		System.out.println(sum);
		System.out.println("------------------------------------------------------------------------");

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int number1 = 1;
		for (int count = 1; count <= 10; count++) {
			number1 *= count;
		}
		System.out.println(number1);
		System.out.println("------------------------------------------------------------------------");

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int number2 = 1, count2 = 1;
		while (count2 <= 10) {
			number2 *= count2;
			count2++;
		}
		System.out.println(number2);
		System.out.println("----------------------------------------------------------------------");

		// 請設計一隻Java程式，輸出結果為以下1 4 9 16 25 36 49 64 81 100
		int number3, result;
		for (number3 = 1; number3 <= 10; number3++) {
			result = (int) Math.pow(number3, 2);
			System.out.print(result + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");

		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count3 = 0;
		for (int x = 1; x < 50; x++) {
			if ((x % 10) == 4 || (x / 10) == 4) {
				continue;
			}
			System.out.print(x + " ");
			count3++;
		}
		System.out.println();
		System.out.println("總共有" + count3 + "個");
		System.out.println("------------------------------------------------------------------------");
		// 請設計一隻Java程式,輸出結果為以下:
//		        1 2 3 4 5 6 7 8 9 10
//		        1 2 3 4 5 6 7 8 9
//		        1 2 3 4 5 6 7 8
//		        1 2 3 4 5 6 7
//		        1 2 3 4 5 6
//		        1 2 3 4 5
//		        1 2 3 4
//		        1 2 3
//		        1 2
//		        1                     */
		int x1, y1;
		for (y1 = 10; y1 >= 1; y1--) { // 巢狀雙層迴圈大迴圈=y軸 控制縱向
			for (x1 = 1; x1 <= y1; x1++) {
				System.out.print(x1 + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------");

		// 請設計一隻Java程式,輸出結果為以下:
//		        1
//		        22
//		        333
//		        4444
//		        55555
//		        666666

		int k, l;
		for (k = 1; k <= 6; k++) {
			for (l = 1; l <= k; l++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------");

		// 請設計一隻Java程式，輸出結果為以下：
//				A
//				BB
//				CCC
//				DDDD
//				EEEEE
//				FFFFFF

		char a1, a2;
		for (a1 = 'A'; a1 <= 'F'; a1++) {
			for (a2 = 'A'; a2 <= a1; a2++) {
				System.out.print(a1);
			}
			System.out.println();
		}

	}

}
