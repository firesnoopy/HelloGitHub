package hw07;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
// (請利用多型簡化本題的程式設計)

public class Hw07_5 {

	public static void main(String[] args) throws ClassNotFoundException {

		File file = new File("C:\\data\\Object.ser");

		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Object obj;
			while ((obj = ois.readObject()) != null) {
				Animal animal = (Animal) obj;
				animal.speak();
			}
			ois.close();
			fis.close();
		} catch (EOFException e) {
			System.out.println("檔案讀取完畢！");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
	}

}
