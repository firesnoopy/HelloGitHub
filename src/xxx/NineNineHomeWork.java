package xxx;

public class NineNineHomeWork {
	public static void main(String[] args) {
		//使用for迴圈+while迴圈
		System.out.println("使用for迴圈+while迴圈的九九乘法表:");
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t"); // "\t" 空格
				j++;
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------");
		
		//使用for迴圈+do while迴圈
		System.out.println("使用for迴圈+do while迴圈的九九乘法表");
		int x, y;
		for (x = 1; x <= 9; x++) {
			y = 1;
			do {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
				y++;
			} while (y <= 9);
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------");
		
		//使用while迴圈+do while迴圈
        System.out.println("使用while迴圈+do while迴圈的九九乘法表:");
		int m = 1;
		while (m <= 9) {
			int n = 1;
			do {
				System.out.print(m + "*" + n + "=" + m * n + "\t");
				n++;
			} while (n <= 9);
			System.out.println();
			m++;
		}
	}

}

