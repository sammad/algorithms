package com.ms.algo.datastructures.linkedlist;

import java.util.List;

public class DoublyLinkedList<T> implements LinkedList<T> {

	private DLLNode<T> head;
	
	@Override
	public void addElementAtBeginning(T value) {
	if(head!=null){
		DLLNode<T> newListNode = new DLLNode<T>(value,null,head);
		head.setPrevious(newListNode);
		head=newListNode;
	}else{
		head= new DLLNode<T>(value);
	}	

	}

	@Override
	public void addElementAtLast(T value) {

	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public List<T> printList() {
		return null;
	}

	@Override
	public T deleteFirstElement() {
		return null;
	}

	@Override
	public T deleteLastElement() {
		return null;
	}

	@Override
	public Integer getListCount() {
		return null;
	}

	@Override
	public Integer getPosition(T data) {
		return null;
	}

	@Override
	public boolean removeAtPosition(Integer position) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public String toString() {
		DLLNode<T> currentNode = head;
		StringBuffer result=new StringBuffer("null-->");
		while(currentNode!=null) {
			result.append(currentNode.getElement()).append("-->");
			currentNode = currentNode.getNext();
		}
		result.append("null");
		return result.toString();
	}

	@Override
	public void reverse() {
		
	}

	@Override
	public boolean searchElement(T value) {
		return false;
	}

	@Override
	public boolean removeMatched(T node) {
		return false;
	}
	
	

}
