package com.rock.multithread;

import java.util.Arrays;

public class DeadLockDemo2 {

	public static void main(String[] args) {

		class MyThread extends Thread {

			private char[] source;
			private char[] target;

			public MyThread(char[] source, char[] target) {
				super();
				this.source = source;
				this.target = target;
			}

			@Override
			public void run() {

				System.out.println(this.getName() + "�߳̿�ʼ");
				synchronized (source) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (target) {
						target = Arrays.copyOf(source, source.length);

					}
				}
				System.out.println(this.getName() + "�߳̽���");
			}

		}
		char[] c1 = { 'A', 'B', 'C', 'D' };
		char[] c2 = { '1', '2', '3', '4' };

		MyThread t1 = new MyThread(c1, c2);
		t1.start();
		MyThread t2 = new MyThread(c2, c1);
		t2.start();

	}

}
