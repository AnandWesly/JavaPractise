package com.anand.threadpractise;

public class ThreadApp {

	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {Counter c = new Counter();	c.increment();System.out.println("in place incre:"+c.value());});
		Thread t2 = new Thread(()-> {Counter c = new Counter();	c.decrement();System.out.println("in place dec:"+c.value());});
		t1.start();
		t2.start();
		Counter c = new Counter();
		System.out.println("Main:"+c.value());
	}
	
	
}
