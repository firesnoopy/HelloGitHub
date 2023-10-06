package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class random1_49 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		while (set.size() < 6) {       // < 可以改成 !=6
			set.add((int) (Math.random() * 49) + 1);
		}
		Iterator<Integer> objs = set.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());

	}

}
