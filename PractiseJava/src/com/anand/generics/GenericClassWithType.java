package com.anand.generics;

public class GenericClassWithType implements GenericInter<Integer, String>{

	private Integer key;
	private String value;
	@Override
	public void setKey(Integer key) {
		this.key = key;
	}

	@Override
	public void setValue(String value) {
		this.value = value;		
	}

	@Override
	public Integer getKey() {
		return this.key;
	}

	@Override
	public String getValue() {
		return this.value;
	}

}
