package Hw09;

public class TestAccount {
	

	static class Account {
		private int totalMoney = 0;

		public synchronized void pay(int money) {
			while (totalMoney > 3000) {
				System.out.println("媽媽看到餘額在3000以上，暫停匯款");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			totalMoney += money;
			System.out.println("媽媽存了" + money + "，帳戶共有：" + totalMoney);
			if (totalMoney > 3000)	{							
				System.out.println("熊大被老媽告知帳戶已經有錢！");
			}
			notify();
		}

		public synchronized void take(int money) {
			while (totalMoney == 0) {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				System.out.println("媽媽被熊大要求匯款！");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			totalMoney -= money;
			System.out.println("熊大領了" + money + "，帳戶共有；" + totalMoney);
			if (totalMoney < 2000) {
				System.out.println("熊大看到餘額在2000元以下，要求匯款");
				notify();
			}
			
		
		

		}
	}

	static class Mom extends Thread {
		Account account;

		public Mom(Account account) {
			this.account = account;
		}

		public void run() {
			for (int i = 1; i <= 10; i++)
				account.pay(2000);
		}
	}

	static class Bigbear extends Thread {
		Account account;

		public Bigbear(Account account) {
			this.account = account;
		}

		public void run() {
			for (int i = 1; i <= 10; i++)
				account.take(1000);
		}
	}
	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Bigbear bigBear = new Bigbear(account);
		mom.start();
		bigBear.start();
	}

}
