package hw07;

/*
 請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
 Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\CHA101_workspace\\JavaTest\\src\\hw07\\Sample.txt");
		FileReader fr = new FileReader(file);      // 使用字元資料流輸入
		BufferedReader br = new BufferedReader(fr);
		int countChar = 0;
		int countLine = 0;
		String str;
		// readLine()是BufferedReader才有的方法 直接讀整行文字 回傳值為字串 所以條件設定不等於空值
		while ((str = br.readLine()) != null) {
			countChar += str.length();
			countLine++;
		}

		System.out.println(file.getName() + "檔案共有" + file.length() + "個位元組，"+ countChar + "個字元，" + countLine + "列資料");

		br.close();
		fr.close();
	}

}
