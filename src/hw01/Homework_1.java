package hw01;

public class Homework_1 {

	public static void main(String[] args) {
		// 請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.print("第一題:12，6的和為" + (12 + 6));
		System.out.println("   12，6的積為" + 12 * 6);

		// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg = 200;
		int d = egg / 12, k = egg % 12;
		System.out.println("第二題:200顆蛋有" + d + "打" + k + "顆");

		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int secs = 256559;
		int mins = secs / 60, hrs = mins / 60, days = hrs / 24;
		int rhrs = hrs % 24, rmins = mins % 60, rsecs = secs % 60;
		System.out.println("第三題:256559秒為" + days + "天" + rhrs + "小時" + rmins + "分" + rsecs + "秒");

		// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415; // PI為固定值，可加final宣告為常數
		double radius = 5;
		double area = Math.pow(radius, 2) * PI;
		System.out.printf("第四題:半徑為5的圓面積為%.2f", area);
		System.out.printf("圓周長為%.2f%n", radius * 2 * PI);

		// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本 金加利息共有多少錢 (用複利計算，公式請自行google)
		int money = 1500000;
		double rate = 0.02;
		double total = money * Math.pow(1 + rate, 10);
		System.out.printf("第五題:10年後本金加利息有%.2f%n", total);

		// 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		System.out.println(5 + 5); // 5跟5都是int整數型別 結果為5+5=10
		System.out.println(5 + '5'); // 因為'5'為char字元型別 unicode數字5十進位為53 結果為5+53=58
		System.out.println(5 + "5"); // 因為"5"為String字串型別 5+"5"串接 結果為55

	}
}
