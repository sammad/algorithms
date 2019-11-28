package com.ms.algo.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

import com.ms.algo.datastructures.linkedlist.Stack;

public class ALStack<T> implements Stack<T> {

	private List<T> store;
	
	public ALStack(int size){
		store = new ArrayList<>(size);
	}
	@Override
	public void push(T item) {
		store.add(item);
	}

	@Override
	public T pop() {
		T item = store.get(store.size()-1); 
		store.remove(store.size()-1);
		return item;
	}

	@Override
	public boolean isEmpty() {
		return store.isEmpty();
	}

	@Override
	public void clear() {
		store.clear();
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int index=store.size()-1;index>0;index--){
			sb.append(store.get(index)).append("\n");
		}
		return sb.toString();
	}
	
	

}
