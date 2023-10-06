package xxx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Hw3_3 {
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?");

		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		int count = 0;

		System.out.println();
		for (int i = 1; i <= 49; i++) {
			if (!((i >= 10 && i / 10 == type) || i % 10 == type)) {
				System.out.print(i + "\t");
				count++;
			}
			if ((count % 6 == 0)) {
				System.out.println();
			}
		}
		System.out.print("");
		System.out.print("總共有 " + count + " 個數字可選擇");

		System.out.println();
		System.out.println("================================================");
		Set<Integer> set = new HashSet<>();

		while (set.size() != 6) {
			int randomNumber = (int) (Math.random() * 49) + 1;
			if (randomNumber % 10 != type && randomNumber / 10 != type && randomNumber != type) {
				set.add(randomNumber);
			}
		}
		System.out.println("隨機選出你要的" + set.size() + "個數字(使用Set集合)");
		System.out.println("迭代器Iterator遍歷方法");
		// 迭代器Iterator遍歷方法
		Iterator objs = set.iterator();
		while (objs.hasNext())
			System.out.print(objs.next() + "\t");

		System.out.println();
		System.out.println("增強型for迴圈方法");
		// 增強型for迴圈方法
		for (int number : set) {
			System.out.print(number + "\t");
		}
		sc.close();
	}

}
