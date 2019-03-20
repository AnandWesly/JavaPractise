package com.anand.generics;

public interface GenericInter <K,V> {
	public void setKey(K key);
	public void setValue(V value);
	public K getKey();
	public V getValue();

}
