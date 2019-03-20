package com.anand.generics;

public class GenericClass<K,V> implements GenericInter<K,V>{
	private K key;
	private V value;

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public V getValue() {
		return this.value;
	}






}
