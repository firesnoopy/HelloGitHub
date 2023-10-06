package hw07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Hw07_2 {

// 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡
// (請使用append功能讓每次執行結果都能被保存起來)

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("c:\\javawork\\Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			for (int i = 0; i < 10; i++) {
				int randomNumber = getRandomNumber();
				String str = Integer.toString(randomNumber);
				pw.println(str);
				System.out.println(str);
			}

			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int getRandomNumber() {
		return ((int) (Math.random() * 1000)) + 1;
	}

}
