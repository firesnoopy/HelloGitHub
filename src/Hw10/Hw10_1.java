package Hw10;

import java.util.ArrayList;
import java.util.List;

public class Hw10_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add((int) (Math.random() * 100 + 1));
		}
		Label: 
		for (int number : list) {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					System.out.println(number + "不是質數");
					continue Label;
				}
			}
			System.out.println(number + "是質數");
		}
	}

}
