package hw08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/*
請建立一個Collection物件並將以下資料加入：
Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
Object物件、“Snoopy”、BigInteger(“1000”)
• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
• 移除不是java.lang.Number相關的物件
• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
*/

public class Collection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add(new String("Kitty"));
		list.add(new Integer(100));
		list.add(new Object());
		list.add(new String("Snoopy"));
		list.add(new BigInteger("1000"));

		System.out.println("======Iterator======");

		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			System.out.print(objs.next() + " ");
		}
		System.out.println();
		System.out.println("======傳統for迴圈======");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("=====for-each迴圈=====");
			
		    // (型別 變數 : 陣列or集合)
		for (Object obj : list) {       
			System.out.print(obj + " ");
		}
		System.out.println();
		System.out.println("====================================");
		System.out.println("移除不是java.lang.Number相關的物件");
		
		Iterator objs2 = list.iterator();
		while (objs2.hasNext()){
			while (!(objs2.next() instanceof Number)) {
				objs2.remove();
			}
		}
		System.out.println("再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功");
		
		for (Object obj : list) {       
			System.out.print(obj + " ");
		}
	}

}
