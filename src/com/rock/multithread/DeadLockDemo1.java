package com.rock.multithread;

public class DeadLockDemo1 {

	public static void main(String[] args) {
		System.out.println("���߳̿�ʼ");

		final StringBuffer mutex = new StringBuffer("ABCD");

		class Runner1 implements Runnable {

			public void run() {
				System.out.println("���߳̿�ʼ");
				synchronized (mutex) {
					mutex.reverse();
					System.out.println(mutex);
				}
				System.out.println("���߳̽���");
			}
		}
		Thread t = new Thread(new Runner1());
		t.start();

		synchronized (mutex) {
			System.out.println("����ͬ����");
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(mutex);
		}
		System.out.println("���߳̽���");
	}
}
