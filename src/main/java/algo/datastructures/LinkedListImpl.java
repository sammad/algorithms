package algo.datastructures;

import java.util.ArrayList;
import java.util.List;

public class LinkedListImpl<T> implements LinkedList<T> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	
	
	public LinkedListImpl(){
		lastNode = new Node<>(null,null);
		firstNode = new Node<>(null,lastNode);
		
	}
	@Override
	public void addElementAtBeginning(T element) {
		if(isEmpty()){
			firstNode.setElement(element);
		}else{
			Node<T> newNode = new Node<>(element, firstNode);
			firstNode =newNode;
		}
	}

	@Override
	public void addElementAtLast(T element) {
		lastNode.setElement(element);
		lastNode.setNext(new Node<>(null,null));
		lastNode=lastNode.getNext();
	}

	@Override
	public T searchElement(T value) {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return firstNode.getElement()==null;
	}

	private class Node<T>{
		private T element;
		private Node<T> next;
		
		@Override
		public boolean equals(Object obj) {
			return this.element.equals(((Node)obj).element);
		}
		public Node(T element, Node<T> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public T getElement() {
			return element;
		}
		public void setElement(T element) {
			this.element = element;
		}
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		@Override
		public String toString() {
			return "Node [element=" + element + ", next=" + next +", hashCode="+hashCode() +"]";
		}
		
		
	}

	@Override
	public List<T> printList() {
		List<T> elementList = new ArrayList<>();
		if(!isEmpty()){
			Node<T> node = firstNode.next;
			elementList.add(firstNode.getElement());
			while(node!=null && node.next!=null){
				elementList.add(node.getElement());
				node=node.next;
			}
		}
		return elementList;
	}
	@Override
	public T deleteFirstElement() {
		T element = null;
		if(!isEmpty()){
			element=firstNode.getElement();
			firstNode =firstNode.next;
		}
		return element;
	}
	
	@Override
	public T deleteLastElement() {
		T element=null;
		Node<T> currentNode = firstNode;
		if(!isEmpty()){
			Node<T> toBeLastElement=null;
			while(currentNode.getNext().getElement()!=null){
				toBeLastElement=currentNode;
				currentNode=currentNode.getNext();
			}
			element=currentNode.getElement();
			if(toBeLastElement!=null){
				toBeLastElement.setNext(currentNode.getNext());
			}else{
				currentNode.setElement(null); 
			}
		}
		
		return element;
	}
	@Override
	public void clear() {
		lastNode = new Node<>(null,null);
		firstNode = new Node<>(null,lastNode);
	}
}
