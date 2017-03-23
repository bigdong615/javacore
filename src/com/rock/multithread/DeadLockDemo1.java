package com.rock.multithread;

public class DeadLockDemo1 {

	public static void main(String[] args) {
		System.out.println("主线程开始");

		final StringBuffer mutex = new StringBuffer("ABCD");

		class Runner1 implements Runnable {

			public void run() {
				System.out.println("子线程开始");
				synchronized (mutex) {
					mutex.reverse();
					System.out.println(mutex);
				}
				System.out.println("子线程结束");
			}
		}
		Thread t = new Thread(new Runner1());
		t.start();

		synchronized (mutex) {
			System.out.println("进入同步锁");
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(mutex);
		}
		System.out.println("主线程结束");
	}
}
