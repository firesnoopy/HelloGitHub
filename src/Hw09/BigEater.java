package Hw09;

public class BigEater {
	
	public static void main(String[] args) {
		CounterRunnable man = new CounterRunnable("饅頭人");
		Thread t1 = new Thread(man);
		CounterRunnable james = new CounterRunnable("詹姆士");
		Thread t2 = new Thread(james);
		t1.start();
		t2.start();
		System.out.println("-----大胃王快食比賽開始！-----");
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束！-----");
	}
}

class CounterRunnable implements Runnable {
	private String name;
	private int count = 0;

	public CounterRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			while (count < 10) {
				count++;
				System.out.println(name + "吃第" + count + "碗飯");
				Thread.sleep((long) (Math.random() * 2500 + 500)); 
			}
			System.out.println(name + "吃完了！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}


