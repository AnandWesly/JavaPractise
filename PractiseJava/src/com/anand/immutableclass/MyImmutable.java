package com.anand.immutableclass;

import java.util.Date;

final class MyImmutable {
	
	private static final int i =0;
	private final int age;
	private final Date dob;
	
	public MyImmutable(int age,Date dob) {
	this.age =age;
	this.dob =dob;
	}
	@Override
	public String toString() {
		return "MyImmutable [age=" + age + ", dob=" + dob + "]";
	}
	public int getAge() {
		return age;
	}
	public Date getDob() {
		Date data = new Date(this.dob.getTime());
		return data;
	}

	 class nestedImm{
		
	}
}
