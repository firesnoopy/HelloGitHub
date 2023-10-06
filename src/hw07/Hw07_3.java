package hw07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw07_3 {

// 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,
// 第一個參數所代表的檔案會複製到第二個參數代表的檔案

	public static void main(String[] args) throws IOException {
		File inputFile = new File("F1.txt");
		File outputFile = new File("F2.txt");
		copyFile(inputFile, outputFile);
	}

	public static void copyFile(File inputFile, File outputFile) throws IOException {

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile));

		int i;
		while ((i = bis.read()) != -1) {
			bos.write(i);
		}
		System.out.print("\n已將F1複製到F2");
		bos.close();
		bis.close();

	}

}
