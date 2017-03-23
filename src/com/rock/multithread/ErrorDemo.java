package com.rock.multithread;

public class ErrorDemo {

	static class SellTicket implements Runnable {

		private int ticket = 10;

		public void run() {
			while (true) {

				synchronized (this) {

					if (this.ticket > 0) {

						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						System.out.println("¬Ù∆±-->  £”‡= " + this.ticket--
								+ Thread.currentThread().getName());

					}
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SellTicket my = new SellTicket();
		Thread t1 = new Thread(my, "[Thread 1]");
		Thread t2 = new Thread(my, "[Thread 2]");
		Thread t3 = new Thread(my, "[Thread 3]");

		t1.start();
		// t1.join();
		t2.start();
		t3.start();

	}

}
