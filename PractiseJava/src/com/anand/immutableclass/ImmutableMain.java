package com.anand.immutableclass;

import java.util.Date;

public  class ImmutableMain extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dat = new Date();
		final MyImmutable obj = new MyImmutable(10,dat);


		//obj.dob.setYear(2020);
		obj.getDob().setYear(12);
		System.out.println(obj);
		final int tes= 0;

	}

}
