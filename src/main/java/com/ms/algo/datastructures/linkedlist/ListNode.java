package com.ms.algo.datastructures.linkedlist;



public class ListNode<T>{
		private T element;
		private ListNode<T> next;
		
		@Override
		public boolean equals(Object obj) {
			ListNode<T> objOperand2 = (ListNode<T>)obj;
			return this.element.equals(objOperand2.element);
		}
		public ListNode(T element, ListNode<T> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public ListNode(T element) {
			super();
			this.element = element;
		}
		public T getElement() {
			return element;
		}
		public void setElement(T element) {
			this.element = element;
		}
		public ListNode<T> getNext() {
			return next;
		}
		public void setNext(ListNode<T> next) {
			this.next = next;
		}
		@Override
		public String toString() {
			return "Node [element=" + element + ", next=" + next +", hashCode="+hashCode() +"]";
		}
		
		
	}


