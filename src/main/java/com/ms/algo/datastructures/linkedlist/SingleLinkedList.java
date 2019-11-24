package com.ms.algo.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkedList<T> implements LinkedList<T> {

	private ListNode<T> head;
	
	public SingleLinkedList(){
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
		return head==null ||
				(head!=null && head.getElement()==null);
	}

	
	@Override
	public String toString() {
		ListNode<T> currentNode = head;
		StringBuffer result=new StringBuffer();
		while(currentNode!=null && currentNode!=null) {
			result.append(currentNode.getElement()).append("-->");
			currentNode = currentNode.getNext();
		}
		result.append("null");
		return "LinkedListImpl [head=" + result.toString() + "]";
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
		ListNode<T> currentNode = head;
		if(!isEmpty()){
			if(this.getListCount()>1) {
				ListNode<T> toBeLastElement=null;
				while(currentNode.getNext()!=null){
					toBeLastElement=currentNode;
					currentNode=currentNode.getNext();
				}
				if(toBeLastElement!=null){
					toBeLastElement.setNext(null);
				}
			}else {
				head=null;
			}
		}

		return currentNode.getElement();
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
		while(currentNode!=null &&
				currentNode.getElement()!=null){
			count+=1;
			currentNode=currentNode.getNext();
		}
		return count;
	}
	@Override
	public boolean removeAtPosition(Integer position) {
		
		return false;
	}
	@Override
	public Integer getPosition(T data) {
		ListNode<T> currentNode = head;
		Integer count=-1;
		while (!isEmpty() && currentNode!=null){
			count+=1;
			if(currentNode.getElement().equals(data)){
				break;
			}
			currentNode = currentNode.getNext();
		}
		
		return count;
	}
	@Override
	public void reverse() {
		ListNode<T> previous = null;
		ListNode<T> current =head;
		
		while(current!=null){
			ListNode<T> next = current.getNext();
			current.setNext(previous);
			previous=current;
			current=next;
		}
		head=previous;
		System.out.println(this);
	}
}
