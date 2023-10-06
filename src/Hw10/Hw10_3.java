package Hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Hw10_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入日期(年月日,例如:20110131)：");
		String inputDate = scanner.nextLine();

		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
		inputFormat.setLenient(false);

		try {
			inputFormat.parse(inputDate);
		} catch (ParseException e) {
			System.out.println("您輸入的日期格式不正確！");
			return;
		}

		System.out.println("請選擇要顯示的格式：");
		System.out.println("(1) 年/月/日");
		System.out.println("(2) 月/日/年");
		System.out.println("(3) 日/月/年");
		String choice = scanner.nextLine();

		if (!choice.matches("^[123]$")) {
			System.out.println("請輸入 1 ~ 3 的數字！");
		} else {
			SimpleDateFormat outputFormat = null;
			switch (choice) {
			case "1":
				outputFormat = new SimpleDateFormat("yyyy/MM/dd");
				break;
			case "2":
				outputFormat = new SimpleDateFormat("MM/dd/yyyy");
				break;
			case "3":
				outputFormat = new SimpleDateFormat("dd/MM/yyyy");
				break;
			}

			try {
				System.out.println("轉換結果：" + outputFormat.format(inputFormat.parse(inputDate)));
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}

	}

}
