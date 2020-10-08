package KenArnold;

class Practice7 {

			int balance;
			public static void main(String[] args) {
				Practice7 u = new Practice7();
			u.account();
			System.out.println("Balance:Rs."+u.balance);
			}
			public void account() {
			Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
			add();
			}
			
			});
			Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
			sub();
			}
			});
			t1.start();
			t2.start();
			try {
			t1.join();
			t2.join();
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
			public synchronized void add() {
			
			for (int i=0;i<10000;i++)
			balance = balance+1;
			}
			public synchronized void sub() {
			for (int i=0;i<10000;i++){
			balance = balance-1;
			}
			}
			
	}


