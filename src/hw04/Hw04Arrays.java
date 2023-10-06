package hw04;

import java.util.Arrays;
import java.util.Scanner;

public class Hw04Arrays {
	public static void main(String[] args) {
/*	  • 有個一維陣列如下：	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 
*/
		int[] numArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum += numArray[i];
		}
		double average = sum / numArray.length ;
		System.out.println("平均數是" + average);
		System.out.print("大於平均數的有");
		
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] > average) {
				System.out.print(numArray[i] + " ");
			}
		}
		System.out.println();
		System.out.println("=======================================================================");
/*		• 請建立一個字串，經過程式執行後，輸入結果是反過來的
		例如String s = “Hello World”，執行結果即為dlroW olleH
*/		
		String s = "Hello World";  // s為一個一維字串陣列
//		System.out.println(s.length()); // 字串長度11 索引值0~10
		for(int j = s.length()-1 ; j >= 0 ; j--) { // 從最後一個字開始取字元 空白也算一個字元
			System.out.print(s.charAt(j));
		}
		System.out.println();
		System.out.println("=======================================================================");
		
//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對，String方法)	
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sumA , sumE, sumI, sumO, sumU;
		sumA = 0 ; sumE = 0 ; sumI = 0 ; sumO = 0 ; sumU = 0 ;
		for (int i = 0; i < planet.length; i++) {
			for (int j = 0; j < planet[i].length() ; j++) {
				if (planet[i].charAt(j) == 'a') {
					sumA+=1;
				}
				else if (planet[i].charAt(j) == 'e') {
					sumE+=1;
				}
				else if (planet[i].charAt(j) == 'i') {
					sumI+=1;
				}
				else if (planet[i].charAt(j) == 'o') {
					sumO+=1;
				}
				else if (planet[i].charAt(j) == 'u') {
					sumU+=1;
				}
			}
		}
		System.out.println("a:"+sumA);
		System.out.println("e:"+sumE);
		System.out.println("i:"+sumI);
		System.out.println("o:"+sumO);
		System.out.println("u:"+sumU);
		System.out.println("=======================================================================");
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列 表如下:
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事 有錢可借他;
//		並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
//		(提示:Scanner，二維陣列)
		
		Scanner sc = new Scanner(System.in);
		int[][] coWorker_Arrays = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.print("欲借的金額：");
		int money = sc.nextInt();
		System.out.printf("有錢可借的員工編號；");
		int coSum = 0;
		for (int i = 0; i < coWorker_Arrays.length; i++) {
			if (money <= coWorker_Arrays[i][1]) {
				System.out.print(coWorker_Arrays[i][0] + " ");
				coSum++;
			}
		}
		System.out.printf("共 %d 人!", coSum);
		sc.close();
		System.out.println();
		System.out.println("=======================================================================");

//		班上有8位同學，他們進行了6次考試結果如下:
//		請算出每位同學考最高分的次數
		
		int score[][] = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 }, { 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };

		int student[] = new int[8];
		int t = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				if (score[t][i] < score[j][i]) {
					t = j;
				}
			}
			student[t]++;
		}
		for (int x = 0; x < student.length; x++) {
			System.out.printf("第%d號同學有%d次考最高分\n", x + 1, student[x]);
		}

		
	}

	

}
