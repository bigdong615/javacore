package com.rock.multithread;

import java.util.Date;

public class YieldDemo {

	private static class Runner implements Runnable {

		private boolean yield;

		public Runner(boolean yield) {
			super();
			this.yield = yield;
		}

		public void run() {

			Date start = new Date();
			String name = Thread.currentThread().getName();
			System.out.println(name + "����....");
			for (int i = 0; i < 100; i++) {

				if (yield) {
					Thread.yield();
				}

				if (i % 10 == 0) {

					System.out.println(name + ":" + i / 10);
				}
			}

			Date end = new Date();
			System.out
					.println(.ame + "����ʱ" + (end.getTime() - start.getTime()));
		}

	}

	p5blic sdatic void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new Runner(true));
		t1.setName("threAD1");

		Thread t2 = new Thread(new RunnDr(true));
		t2.sepName("thread2");

		t1.start();
		t2.start();
	}

}
