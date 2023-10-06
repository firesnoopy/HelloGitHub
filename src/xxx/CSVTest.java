package xxx;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVTest {
	
	public static void main(String[] args) throws IOException {
		// 3. 直接更改Java環境的編碼設定 (Window -> preferences -> General -> Workspace -> Text file encoding)
//		FileReader fr = new FileReader("C:\\javawork\\students.csv");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String data;
//		while ((data = br.readLine()) != null)
//			System.out.println(data);
//		
//		br.close();
//		fr.close();
		
		// 1. 先用位元資料流讀進來, 再進行轉換跟編碼的指定
		FileInputStream fis = new FileInputStream("C:\\javawork\\students.csv");
		InputStreamReader isr = new InputStreamReader(fis, "MS950");
		BufferedReader br = new BufferedReader(isr);
		
		String data;
		while ((data = br.readLine()) != null)
			System.out.println(data);
		
		br.close();
		isr.close();
		fis.close();
		
		// 2. 先用位元資料流讀進來, 利用字串建構子還原文字
//		FileInputStream fis = new FileInputStream("C:\\javawork\\students.csv");
//		byte[] data = new byte[fis.available()];
//		fis.read(data);
//		System.out.println(new String(data, "MS950"));
//		fis.close();
	}
}
