package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {
	/*
	 * 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
	 * (提示：Scanner，三角形成立條件，判斷式if else) (進階功能：加入直角三角形的判斷)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		
		int[] length = new int[3];

		for (int i = 0; i < length.length; i++) {
			length[i] = sc.nextInt();
		}
		Arrays.sort(length); // 將陣列中元素排序由小到大 Array.sort()是一種類別方法

		// 三角形定義:兩邊相加>第三邊
		if ((length[0] + length[1]) <= length[2]) {
			System.out.println("不是三角形");
		} else if (length[0] == length[1] && length[1] == length[2]) {
			System.out.println("正三角形");
		} else if (length[0] == length[1]) {
			System.out.println("等腰三角形");
		} else if (Math.pow(length[0], 2) + Math.pow(length[1], 2) == Math.pow(length[2], 2)) {
			System.out.println("直角三角形"); // 畢氏定理
		} else {
			System.out.println("其他三角形");
		}

	}

}
