package algo.datastructures;

import java.util.ArrayList;
import java.util.List;

public class LinkedListImpl<T> implements LinkedList<T> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	
	public LinkedListImpl(){
		firstNode = new Node<T>(null,null);
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
		lastNode =new Node<>(element,null);
	}

	@Override
	public T searchElement(T value) {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return (firstNode.getElement()==null 
				&& firstNode.getNext()==lastNode);
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
			return "Node [element=" + element + ", next=" + next + "]";
		}
		
		
	}

	@Override
	public List<T> printList() {
		List<T> elementList = new ArrayList<>();
		Node<T> node = firstNode.next;
		elementList.add(firstNode.getElement());
		while(node.next!=null){
			elementList.add(node.getElement());
			node=node.next;
		}
		return elementList;
	}
	@Override
	public T deleteFirstElement() {
		T element = firstNode.getElement();
		firstNode =firstNode.next;
		return element;
	}
	
	@Override
	public T deleteLastElement() {
		T element = lastNode.getElement();
		lastNode=null;
		return element;
	}
}
