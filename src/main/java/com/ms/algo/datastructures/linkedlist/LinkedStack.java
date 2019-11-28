package com.ms.algo.datastructures.linkedlist;

public class LinkedStack<T> implements Stack<T> {

	private LinkedList<T> list;
	
	public LinkedStack(){
		list = new SingleLinkedList<>();
	}
	
	@Override
	public void push(T item) {
		list.addElementAtBeginning(item);
	}

	@Override
	public T pop() {
		return list.deleteFirstElement();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void clear() {
		list.clear();
	}

	
}
