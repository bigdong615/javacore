package com.rock.multithread;

public class WaitDemo1 {

	public static void main(String[] args) {

		ThreadB b = new ThreadB();

		b.start();

		synchronized (b) {

			System.out.println("等待对象b完成计算.....");
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("b对象计算的总合是:" + b.total);
		}

	}
}

class ThreadB extends Thread {

	int total;

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 0; i < 10; i++) {

				total += i;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			notify();
		}
	}

}
