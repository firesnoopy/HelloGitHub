package hw05;

import java.util.Scanner;

//• 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
public class Square {
	public static void starSquare(int width, int height) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		width = sc.nextInt();
		height = sc.nextInt();
		for (int i = 1; i <= height; i++) {    // 外層控制y軸(高)
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
	public static void main(String[] args) {
		starSquare(0,0);
		
	}

}


