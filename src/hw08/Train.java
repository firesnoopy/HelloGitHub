package hw08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	public int compareTo(Train aTrain) {
		if (this.number > aTrain.number) {
			return 1;
		} else if (this.number == aTrain.number) {
			return 0;
		} else {
			return -1;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		System.out.println("-----------請寫一隻程式，能印出不重複的Train物件");

		Set<Train> set = new HashSet<>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		Iterator<Train> t = set.iterator();
		while (t.hasNext())
			System.out.println(t.next());
		System.out.println("-----------請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出");
		List<Train> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		Collections.sort(list);
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件");
//		new TreeMap<>(Collections.reverseOrder())
		Map<Integer, Train> map = new TreeMap<>(Collections.reverseOrder());
		map.put(202, t1);
		map.put(1254, t2);
		map.put(118, t3);
		map.put(1288, t4);
		map.put(122, t5);
		map.put(1222, t6);
		map.put(1254, t7);
		for (Train tr : map.values()) {
			System.out.println(tr);
		}

	}
}
