package com.rock.multithread;

public class AddThreadJoin {

	/**
	 * @param args
	 *            ���һ��join����,join����������һ����ӷ��� �����������thread one ���ִ��,ֱ��thread one
	 *            ִ�����,��ȥִ���������̴߳���
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