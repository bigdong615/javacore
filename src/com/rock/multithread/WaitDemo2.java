package com.rock.multithread;

public class WaitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String mutex = "ȥ����";

		// ˾���߳�
		final Thread driver = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {

					System.out.println("[˾��]���ڿ���ȥĿ�ĵص�·��....");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("[˾��]�ִ�Ŀ�ĵ�");
				synchronized (mutex) {
					System.out.println("[˾��]���ѳ˿�");
					mutex.notify();
				}

			}

		};
		// �˿��߳�
		Thread passenger = new Thread() {
			@Override
			public void run() {
				synchronized (mutex) {
					System.out.println("[�˿�]����˾����ʼ������");
					driver.start();
					System.out.println("[�˿�]׼����ʼ��Ϣ��");
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("[�˿�]�ִﱱ����ʼ�ι۹ʹ�");
				}

			}
		};
		passenger.start();
	}

}
