package hw07;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw07_4 {

//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 建立一個物件資料夾
		File file = new File("C:\\data");

		if (!file.exists()) {
			file.mkdir();
		}

		File ser = new File("C:\\data\\Object.ser");

		if (!ser.exists()) {
			ser.createNewFile();
		}

		Animal animals[] = new Animal[4];
		animals[0] = new Dog("乖乖");
		animals[1] = new Dog("皮皮");
		animals[2] = new Cat("可洛乙");
		animals[3] = new Cat("五吉");

		FileOutputStream fos = new FileOutputStream(ser);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < animals.length; i++) {
			oos.writeObject(animals[i]);
		}
		oos.close();
		fos.close();
	}
	
// 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
// (請利用多型簡化本題的程式設計)
		
			//輸入
		
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
