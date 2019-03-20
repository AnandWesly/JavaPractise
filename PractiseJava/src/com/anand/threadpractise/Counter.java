package com.anand.threadpractise;

class Counter{
	private static int c = 0;
	public void increment() {
		c++;
		System.out.println("Counter Incre:"+c);
	}

	public void decrement() {
		c--;
		System.out.println("Counter Dec:"+c);
	}

	public int value() {
		return c;
	}
}