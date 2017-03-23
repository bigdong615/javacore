package com.rock.multithread;

public class AddThreadJoin {

	/**
	 * @param args
	 *            添加一个join方法,join方法类似于一个插队方法 下面代码掩饰thread one 插队执行,直到thread one
	 *            执行完毕,再去执行主程序线程代码
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
/*		class Runner implements Runnable {

			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10000; i++) {
					if (i % 100 == 0) {

						String name = Thread.currentThread().getName();
						System.out.println(name + ":" + i / 100);
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		}

		Thread t = new Thread(new Runner(), "[Thread one]");

		t.start();
		t.join();*/

		for (int i = 0; i < 10000; i++) {
			if (i % 100 == 0) {

				String name = Thread.currentThread().getName();
				System.out.println(name + ":" + i / 100);
				Thread.sleep(10);
			}
		}

	}

}