package com.rock.multithread;

import java.util.Date;

public class AddToTenK implements Runnable {
	int sum = 0;

	public void run() {
		// TODO Auto-generated method stub
		int start = new Date().getSeconds();
		for (int i = 0; i < 100; i++) {

			sum += i;
			System.out.println("current number is " + sum);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int end = new Date().getSeconds();
		System.out.println("Total time consumed is " +  (end - start));

	}

	public static void main(String[] args) {

		Thread t = new Thread(new AddToTenK());
		t.start();

	}

}