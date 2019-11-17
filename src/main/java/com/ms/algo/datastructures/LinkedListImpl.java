package com.ms.algo.datastructures;

import java.util.ArrayList;
import java.util.List;

public class LinkedListImpl<T> implements LinkedList<T> {

	private ListNode<T> head;
	
	public LinkedListImpl(){
		head = new ListNode<>(null,null);
		
	}
	@Override
	public void addElementAtBeginning(T element) {
		if(isEmpty()){
			head.setElement(element);
		}else{
			ListNode<T> newNode = new ListNode<>(element, head);
			head =newNode;
		}
	}

	@Override
	public void addElementAtLast(T element) {
		ListNode<T> newTail = new ListNode<T>(element, null);
		ListNode<T> currentNode = head;
		while(currentNode.getNext()!=null){
			currentNode=currentNode.getNext();
		}
		currentNode.setNext(newTail);
	}

	@Override
	public ListNode<T> searchElement(T value) {
		ListNode<T> currentNode =null;
		if(head.getElement().equals(value)){
			return head;
		}else{
			currentNode = head.getNext();

			while(currentNode.getNext()!=null
					&& !currentNode.getElement().equals(value)){
				currentNode=currentNode.getNext();
			}
		}
		return currentNode;
	}

	@Override
	public boolean isEmpty() {
		return head.getElement()==null;
	}

	
	@Override
	public List<T> printList() {
		List<T> elementList = new ArrayList<>();
		if(!isEmpty()){
			ListNode<T> currentNode = head;
			while(currentNode.getNext()!=null){
				elementList.add(currentNode.getElement());
				currentNode =currentNode.getNext();
			}
			elementList.add(currentNode.getElement());
		}
		return elementList;
	}
	@Override
	public T deleteFirstElement() {
		T element = null;
		if(!isEmpty()){
			element=head.getElement();
			head =head.getNext();
		}
		return element;
	}
	
	@Override
	public T deleteLastElement() {
		T element=null;
		ListNode<T> currentNode = head;
		if(!isEmpty()){
			ListNode<T> toBeLastElement=null;
			while(currentNode.getNext()!=null){
				toBeLastElement=currentNode;
				currentNode=currentNode.getNext();
			}
			if(toBeLastElement!=null){
				toBeLastElement.setNext(null);
			}
		}
		
		return element;
	}
	@Override
	public void clear() {
		head = new ListNode<>(null,null);
	}
	@Override
	public boolean removeMatched(ListNode<T> queryNode) {
		ListNode<T> currentNode = head;
		boolean result=false;
		while(currentNode.getElement()!=null){
			if(currentNode.getNext().equals(queryNode)){
				currentNode.setNext(currentNode.getNext().getNext());
				result=true;
				break;
			}
			currentNode=currentNode.getNext();
		}
		return result;
	}
	@Override
	public Integer getListCount() {
		ListNode<T> currentNode=head;
		int count =0;
		while(currentNode.getElement()!=null){
			count+=1;
		}
		return count;
	}
	@Override
	public boolean removeAtPosition(Integer position) {
		
		return false;
	}
}
