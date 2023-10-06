package hw04;

import java.util.Scanner;

//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner，陣列)
//	(提示2:需將閏年條件加入) 
//	(提示3:擋下錯誤輸入:例如月份輸入為2，則日期不該超過29)

public class Hw04_Calendar {

	public static void main(String[] args) {

		int[] monthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("請輸入某年某月某一天");
		Scanner sc1 = new Scanner(System.in);
		int year = sc1.nextInt();
		int month = sc1.nextInt();
		int day = sc1.nextInt();
		int sumMon = 0;

		if (year % 4 == 0 && year % 100 == 0) {
			if (year % 400 == 0) {
				monthDay[1] = 29;
			}
		}

		if (month > 1 && month <= 12) {
			for (int i = 0; i < month - 1; i++) {
				sumMon += monthDay[i];
			}
		}

		int sumDay = sumMon + day;
		System.out.printf("輸入的日期為該年第 %d 天", sumDay);
		sc1.close();
	}
}
