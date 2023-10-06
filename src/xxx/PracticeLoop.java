package xxx;

public class PracticeLoop {
	public static void main(String[]args ) {
////九九乘法表倒著寫		
//		int i , j;
//		for(i=9 ; i>=1 ; i-- ) {
//			for(j=9 ;j>=1 ; j--) {
//			System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}		
//計算1~100的奇數和 以下為continue語法 被2整除為偶數 碰到偶數跳過
		int number,sum=0 ;
		for(number = 1 ;number<=100 ; number++) {
			if(number % 2 ==0) {
				continue;
			}
			sum += number;
		}
		System.out.print(sum);
		System.out.println();
		System.out.println("===========================================");
//計算1~100的奇數和 除2餘1為奇數		
		int number2,sum2=0 ;
		for(number2 = 1 ;number2<=100 ; number2++) {
			if(number2 % 2 ==1) {
			sum2 += number2;
			}
		}
		System.out.print(sum2);
		System.out.println();
		System.out.println("===========================================");
//計算1*2*3*……*10的結果		
				int sum3=1 , i1 ;
				for(i1=1 ;i1<=10;i1++) {
					sum3= sum3 * i1;
					
				}
				System.out.println(sum3);	

				
//
				for (int j1 = 1; j1 <= 10; j1++) {
					System.out.print(j1 == 10 ? (j1 * j1) : (j1 * j1 + " "));
				}
				System.out.println();
//          
				for (int i = 1; i <= 10; i++) { // 外圈跑10次_y軸
					for (int n = 1; n <= 11 - i; n++) { // 
							System.out.print(n + " ");
					}
					System.out.println();
				}
				
				
				
				String str;
				z:
				str = "";
				for (int i3 = 3; i3 < 8; i3++) {
				    if ( i3 == 4) break;
				    if (i3 == 6) break z;
				    str += i3;
				}
				System.out.println(str);
				
	}

}
