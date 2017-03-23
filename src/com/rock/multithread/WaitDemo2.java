package com.rock.multithread;

public class WaitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String mutex = "去北京";

		// 司机线程
		final Thread driver = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {

					System.out.println("[司机]正在开车去目的地的路上....");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("[司机]抵达目的地");
				synchronized (mutex) {
					System.out.println("[司机]叫醒乘客");
					mutex.notify();
				}

			}

		};
		// 乘客线程
		Thread passenger = new Thread() {
			@Override
			public void run() {
				synchronized (mutex) {
					System.out.println("[乘客]告诉司机开始出发了");
					driver.start();
					System.out.println("[乘客]准备开始休息了");
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("[乘客]抵达北京开始参观故宫");
				}

			}
		};
		passenger.start();
	}

}
