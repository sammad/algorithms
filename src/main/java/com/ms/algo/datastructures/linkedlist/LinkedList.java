package com.ms.algo.datastructures.linkedlist;

import java.util.List;

public interface LinkedList<T> {

	public void addElementAtBeginning(T value);
	public void addElementAtLast(T value);
	public ListNode<T> searchElement(T value);
	public boolean removeMatched(ListNode<T> node);
	public boolean isEmpty();
	public List<T> printList();
	public T deleteFirstElement();
	public T deleteLastElement();
	public Integer getListCount();
	public Integer getPosition(T data);
	public boolean removeAtPosition(Integer position);
	public void clear();
}
