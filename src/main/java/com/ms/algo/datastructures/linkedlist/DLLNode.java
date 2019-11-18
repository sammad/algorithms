package com.ms.algo.datastructures.linkedlist;



public class DLLNode<T>{
		private T element;
		private DLLNode<T> previous;
		private DLLNode<T> next;
		
		@Override
		public boolean equals(Object obj) {
			DLLNode<T> objOperand2 = (DLLNode<T>)obj;
			return this.element.equals(objOperand2.element);
		}
		public DLLNode(T element,DLLNode<T> previous, DLLNode<T> next) {
			super();
			this.element = element;
			this.next = next;
			this.previous=previous;
		}
		public DLLNode(T element) {
			super();
			this.element = element;
		}
		public T getElement() {
			return element;
		}
		public void setElement(T element) {
			this.element = element;
		}
		public DLLNode<T> getNext() {
			return next;
		}
		public void setNext(DLLNode<T> next) {
			this.next = next;
		}
		
		public DLLNode<T> getPrevious() {
			return previous;
		}
		public void setPrevious(DLLNode<T> previous) {
			this.previous = previous;
		}
		@Override
		public String toString() {
			return "DLLNode [element=" + element + ", previous=" + previous + ", next=" + next + "]";
		}
				
	}


