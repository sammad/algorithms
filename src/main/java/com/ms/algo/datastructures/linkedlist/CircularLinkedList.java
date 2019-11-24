package com.ms.algo.datastructures.linkedlist;

import java.util.List;

public class CircularLinkedList<T> implements LinkedList<T> {
	
	private CLLNode<T> tail;

	@Override
	public void addElementAtBeginning(T value) {
		if(tail!=null){
			CLLNode<T> newNode = new CLLNode<T>(value,tail);
			tail.setNext(newNode);
		}else{
			tail = new CLLNode<T>(value);
			tail.setNext(tail);
		}
	}

	@Override
	public void addElementAtLast(T value) {
		if(tail!=null){
		CLLNode<T> currentNode = tail.getNext();
		while(currentNode!=tail){
			if(currentNode.getNext()==tail){
				CLLNode<T> newNode = new CLLNode<T>(value, tail);
				currentNode.setNext(newNode);
				break;
			}
		}
		}else{
			tail = new CLLNode<T>(value);
			tail.setNext(tail);
		}

	}

	@Override
	public ListNode<T> searchElement(T value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeMatched(ListNode<T> node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> printList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T deleteFirstElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T deleteLastElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getListCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getPosition(T data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAtPosition(Integer position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		StringBuffer result=new StringBuffer().append(tail.getElement()).append("-->");
		CLLNode<T> currentNode = tail.getNext();
		while(currentNode!=null && currentNode!=tail) {
			result.append(currentNode.getElement()).append("-->");
			currentNode = currentNode.getNext();
		}
		result.append("null");
		return result.toString();
	}

}
