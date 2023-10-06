package xxx;

import java.util.Scanner;

public class Homework3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();  //這三行可以用陣列搭配迴圈
		System.out.println(data1 + data2 + data3);
	}

}
