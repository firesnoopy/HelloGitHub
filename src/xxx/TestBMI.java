package xxx ;

public class TestBMI {
    public static void main(String[] args) {
    	
        double weight=60,height=1.75;
        double BMI= weight / (height * height);
        System.out.println("BMI = " + BMI);
        System.out.printf("BMI = %.2f%n" , BMI);
        if (BMI < 18.5) {
          System.out.println("過瘦");
        }
        else if(BMI >= 24 ) { //18.5<= BMI < 24 這樣語法不對 因為運算順序<=與<相同 優先順序由左至右(講義35頁)
        	                  //Java運算邏輯會先判斷18.5<=BMI為布林值(true/false) 再計算布林值<24語法錯誤
          System.out.println("過重");
        }
        else {
          System.out.println("正常");
        }

     }
    
}
	


