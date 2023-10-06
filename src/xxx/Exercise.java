package xxx;

public class Exercise {
	public static void main(String[] args) {
//    	• 請設計一隻Java程式,計算12,6這兩個數值的和與積
//     int i = 12 ,j = 6;
//     System.out.println("12跟6的和為" + (i+j));
//     System.out.println("12跟6的乘積為" + (i*j));

//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
//    	int egg=200;
//    	int dozen=200/12;
//    	int restegg=200%12;
//    	System.out.println("200顆蛋是"+dozen+"打"+restegg+"顆");

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//    	int totalsecs=256559;   //256559秒
//    	int mins=256559/60;     //總共幾分
//    	int hrs=mins / 60;      //總共幾小時
//    	int days=hrs / 24 ;     //總共幾天
//    	int resthrs= hrs % 24 ; //總共多少小時%24(一天24小時)的餘數為剩餘小時
//    	int restmins= mins % 60 ;
//    	int restsecs = 256559 % 60 ;
//    	
//    	System.out.println("256559秒為"+days+"天"+resthrs+"小時"+restmins+"分"+restsecs+"秒");

//BMI計算
//    	double height=1.75 , weight = 60;
//    	double BMI = weight/(height*height);
//    	    System.out.println("BMI為"+BMI);
//    	if(BMI<18.5){
//    		System.out.println("過瘦");
//    	}
//    	else if(BMI>=24) {
//    		System.out.println("過重");
//        }
//        else{
//		    System.out.println("正常");
//        }
////      
    	int x = 0;
    	int y = 0;
    	do {
    	    y++;
    	    System.out.println(y);
    	    ++x;
    	} while (x < 5);
    	System.out.print(x + "," + y);

//   	    String str = "";
//    	z:
//    	for (int x = 0; x < 3; x++) {
//    	    for (int y = 0; y < 2; y++) {
//    	        if ( x == 1) break;
//    	        if ( y == 2) break z;
//    	        str = str + x + y;
//    	    }
//    	}
//    	System.out.println(str);

//    	String str;
//    	str = "";
//    	z:
//    	for (int i = 3; i < 8; i++) {
//    	    if ( i == 4) break;
//    	    if (i == 6) break z;
//    	    str += i;
//    	}
//    	System.out.println(str);

//    	String str = "";
//    	z:
//    	for (int x = 0; x < 3; x++) {
//    	    for (int y = 0; y < 2; y++) {
//    	        if ( x == 1) break;
//    	        if ( y == 2) break z;
//    	        str = str + x + y;
//    	    }
//    	}
//    	System.out.println(str);

//		for (int i = 1; i <= 9; i++) {
//			int j=1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}while(j<=9);
//				
//		    System.out.println();
//		}
		
//		for(int i=1;i<=9;i++) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}while(j<=9);
//			
//			System.out.println();
//			
//		}
//		for(int i =1;i<=9;i++) {
//			for(int j =1;j<=i;j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//1加到10
//		for(int i = 1 ; i<=9 ; i++) {
//			int j =1;
//			while(j<=9) {
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//				j++;
//			}	
//			System.out.println();
//		}
//    
		
//		for(int i =1;i<=9;i++) {
//			for(int j = 1 ; j<=i ; j++) {
//				System.out.print(i);
//			}				System.out.print(i);
//
//			System.out.println();
//		}
//			System.out.println();
//		
//		for(int i =10; i>=1 ;i-- ) {
//			for(int j =1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		int sum = 1,i=1;
		while(i<=10) {
			sum = sum*i;
			i++;
		}
		System.out.println(sum);
			
		
		
	}
}






