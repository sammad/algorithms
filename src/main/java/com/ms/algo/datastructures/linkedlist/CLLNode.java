package com.ms.algo.datastructures.linkedlist;

public class CLLNode<T> {

	private T element;
	private CLLNode<T> next;
	public CLLNode(){
		this(null,null);
	}
	public CLLNode(T value) {
		this(value,null);
	}
	public CLLNode(T value, CLLNode<T> next) {
		this.element=value;
		this.next=next;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public CLLNode<T> getNext() {
		return next;
	}
	public void setNext(CLLNode<T> next) {
		this.next = next;
	}
}
