package com.anand.javabuzzles;

public class ClassObjCounter {

	static int i;
	public ClassObjCounter(){
		i++;
	}
	
	public static void main(String[] args) {
		ClassObjCounter obj = new ClassObjCounter();
		ClassObjCounter obj1 = new ClassObjCounter();
		
		System.out.println(obj.getCounter());
		System.out.println(obj1.getCounter());
	}

	public synchronized int getCounter(){
		return i;
	}
	
	
}
