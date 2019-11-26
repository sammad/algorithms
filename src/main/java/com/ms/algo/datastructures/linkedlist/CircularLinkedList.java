package com.ms.algo.datastructures.linkedlist;

import java.util.List;

public class CircularLinkedList<T> implements LinkedList<T> {
	
	private CLLNode<T> tail;

	@Override
	public void addElementAtBeginning(T value) {
		if(tail!=null){
			CLLNode<T> newNode = new CLLNode<T>(value,tail);
			tail.setNext(newNode);
			tail=newNode;
		}else{
			tail = new CLLNode<T>(value);
			tail.setNext(tail);
		}
	}

	@Override
	public void addElementAtLast(T value) {
		if(tail!=null){
		if(tail.getNext()==tail){
			CLLNode<T> tempNode = new CLLNode<>(value);
			tempNode.setNext(tail);
			tail.setNext(tempNode);
		}else{	
			CLLNode<T> currentNode = tail.getNext();
			while(currentNode!=tail){
				if(currentNode.getNext()==tail){
					CLLNode<T> newNode = new CLLNode<T>(value, tail);
					currentNode.setNext(newNode);
					break;
				}
			}
		}
		}else{
			tail = new CLLNode<T>(value);
			tail.setNext(tail);
		}

	}

	@Override
	public boolean searchElement(T value) {
		boolean isValueExist=Boolean.FALSE;
		if(value.equals(tail.getElement())){
			isValueExist= Boolean.TRUE;
		}else{
			CLLNode<T> currentNode = tail.getNext();
			while(currentNode!=tail){
				if(value.equals(tail.getElement())){
					isValueExist= Boolean.TRUE;
					break;
				}
			}
		}
		
		return isValueExist;
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
		T result = tail.getElement();
		tail=tail.getNext();
		return result;
	}

	@Override
	public T deleteLastElement() {
		
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

	@Override
	public boolean removeMatched(T node) {
		// TODO Auto-generated method stub
		return false;
	}

}
