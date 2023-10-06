package hw05;

public class RandAvg {
	public static void main(String[] args) {
		randAvg();
	}

	public static void randAvg() {
		System.out.println("本次亂數結果");
		int[] number = new int[10];
		int sum = 0;
		int j = 0;
		for (int i = 0; i < number.length; i++) {
			number[j] = (int) (Math.random() * 101); // 生成 0~100 之間的亂數
			System.out.print(number[j] + " ");
			sum += number[j];
			j++;
		}
		System.out.println();
		System.out.println(sum / number.length);
	}

}
