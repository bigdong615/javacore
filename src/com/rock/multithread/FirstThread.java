package com.rock.multithread;

public class FirstThread extends Thread {

	/**
	 * @param args
	 */

	private long max = 10000;

	public FirstThread(long max) {
		// TODO Auto-generated constructor stub
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 0; i < max; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread ft = new FirstThread(100);
		ft.start(); // run in thread
		// ft.run(); //run in main
	}

}
