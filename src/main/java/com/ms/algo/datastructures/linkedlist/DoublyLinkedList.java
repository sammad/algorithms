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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean searchElement(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeMatched(T node) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
