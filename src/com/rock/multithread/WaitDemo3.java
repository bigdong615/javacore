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

// 仓库
class Godown {

	public static final int max_size = 100;// 最大库存
	public int curnum;// 当前库存

	public Godown(int curnum) {

		this.curnum = curnum;
	}

	public synchronized void produce(int neednum) {
		// 测试是佛需要生产
		while (neednum + curnum > 100) {
			System.out.println("要生产的产品数量" + neednum + "超过库存量"
					+  (max_size - curnum));
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// 满足条件,则进行生产
		curnum += neednum;
		System.out.println("已经生产了" + neednum + "个产品, 现仓库量为" + curnum);
		// 唤醒所有等待线程
		notifyAll();

	}

	public synchronized void consume(int neednum) {
		// 测试是否可消费
		while (curnum < neednum) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		curnum -= neednum;
		System.out.println("已经消费了" + neednum + "个产品,现仓库量为" + curnum);
		notifyAll();

	}

}

// 生产者
class Producer extends Thread {

	private int neednum; // 生产产品的数量
	private Godown godown; // 仓库

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

// 消费者

class Consumer extends Thread {
	private int neednum; // 生产产品的数量
	private Godown godown; // 仓库

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
