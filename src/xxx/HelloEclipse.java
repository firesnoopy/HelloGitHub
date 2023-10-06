package xxx;

public class HelloEclipse {

	public static void main(String[] args) {
//		for(int i =1; i<=3 ; i++) {
//			print99();
//		}
//		
//		
//		int s1 = 100, s2 = 100, s3 = 95, s4 = 97;
//		int sum = s1 + s2 + s3 + s4;
//
//		// index 0 1 2 3
//
//		int[] scores1 = { 100, 100, 95, 97, 100 }; // 陣列裡的資料稱為"元素(element)", 有順序性
//
//		int[] scores2 = new int[4];

//		scores2[0] = 100;
//		scores2[1] = 100;
//		scores2[2] = 95;
//		scores2[3] = 97;

//		int sum2 =scores1[0] +scores1[1} +scores1[2] + scores1[3};
//		int sum2 = 0;
//		for(int i = 0; i < scores2.length ; i++) {
//			System.out.println(scores2[i]); //陣列敘述要搭配索引值
//		}
		
//	}
//	public static void print99() {
//		for(int i =1 ; i<=9 ; i++) {
//			for(int j =1; j<=9 ; j++) {
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
//		System.out.println("=================================================");
//		
//	}
	
//	String s1 = "101";
//	int data =Integer.parseInt(s1);
//	
//		// TODO Auto-generated method stub
//
//	
//		// TODO Auto-generated method stub
//
//	}
//		// TODO Auto-generated method stub
//
//	}
		int i, j;
		for (i = 1; i <= 100; i++) {
		for (j = 2; j < i; j++) {
		if (i % j == 0)
		break;
		}
		if (j >= i)
		System.out.println(j);
		}
	}

}