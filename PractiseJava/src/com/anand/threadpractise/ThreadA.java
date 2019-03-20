package com.anand.threadpractise;

public class ThreadA implements Runnable {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println(main.getName());
		ThreadA obj = new ThreadA();

		Thread threadobj = new Thread(obj);
		threadobj.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (threadobj) {
			// threadobj.notifyAll();
		}
		System.out.println("Exit");
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Thread task:" + i);
			synchronized (this) {
				System.out.println("synchronized:" + i);
				//wait(100);
			}
			System.out.println("came out of Thread task:" + i);
			// Thread.sleep(500);
		}
	}

}
