package com.anand.practise;

public class VolatilePractise {

	// volatile keyword in Java is used as an indicator to Java compiler and Thread
	//that do not cache value of this variable and always read it from main memory.
	//Its used only variable not with class and method
	private volatile int  Age;

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
}
