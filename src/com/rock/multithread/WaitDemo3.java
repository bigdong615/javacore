package com.rock.multithread;

public class WaitDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Godown godown = new Godown(30);
		Consumer c1 = new Consumer(50, godown);
		Consumer c2 = new Consumer(20, godown);
		Consumer c3 = new Consumer(10, godown);
		Producer p1 = new Producer(10, godown);
		Producer p2 = new Producer(10, godown);
		Producer p3 = new Producer(10, godown);
		Producer p4 = new Producer(10, godown);
		Producer p5 = new Producer(10, godown);
		Producer p6 = new Producer(10, godown);
		Producer p7 = new Producer(80, godown);
		c1.start();
		c2.start();
		c3.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();

	}

}

// �ֿ�
class Godown {

	public static final int max_size = 100;// �����
	public int curnum;// ��ǰ���

	public Godown(int curnum) {

		this.curnum = curnum;
	}

	public synchronized void produce(int neednum) {
		// �����Ƿ���Ҫ����
		while (neednum + curnum > 100) {
			System.out.println("Ҫ�����Ĳ�Ʒ����" + neednum + "���������"
					+  (max_size - curnum));
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// ��������,���������
		curnum += neednum;
		System.out.println("�Ѿ�������" + neednum + "����Ʒ, �ֲֿ���Ϊ" + curnum);
		// �������еȴ��߳�
		notifyAll();

	}

	public synchronized void consume(int neednum) {
		// �����Ƿ������
		while (curnum < neednum) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		curnum -= neednum;
		System.out.println("�Ѿ�������" + neednum + "����Ʒ,�ֲֿ���Ϊ" + curnum);
		notifyAll();

	}

}

// ������
class Producer extends Thread {

	private int neednum; // ������Ʒ������
	private Godown godown; // �ֿ�

	public Producer(int neednum, Godown godown) {
		super();
		this.neednum = neednum;
		this.godown = godown;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		godown.produce(neednum);
	}
}

// ������

class Consumer extends Thread {
	private int neednum; // ������Ʒ������
	private Godown godown; // �ֿ�

	public Consumer(int neednum, Godown godown) {
		super();
		this.neednum = neednum;
		this.godown = godown;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		godown.consume(neednum);
	}

}
