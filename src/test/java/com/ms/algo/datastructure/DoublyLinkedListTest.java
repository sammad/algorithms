package com.ms.algo.datastructure;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.ms.algo.datastructures.linkedlist.DoublyLinkedList;
import com.ms.algo.datastructures.linkedlist.LinkedList;
import com.ms.algo.datastructures.linkedlist.ListNode;


public class DoublyLinkedListTest {
	@Test
	public void testAddElementAtBeginning() {
		LinkedList<String> list = new DoublyLinkedList<>();
		list.addElementAtBeginning("A");
		list.addElementAtBeginning("B");
		assertTrue(list.toString().equals("null-->B-->A-->null"));
	}
	@Test
	public void testEmptyListPrint() {
		LinkedList<String> list = new DoublyLinkedList<>();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testEmptyListDeleteFirst() {
		LinkedList<String> list = new DoublyLinkedList<>();
		list.deleteFirstElement();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testEmptyListDeleteLast() {
		LinkedList<String> list = new DoublyLinkedList<>();
		list.deleteLastElement();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testSingleItemListDeleteLast() {
		LinkedList<String> list = new DoublyLinkedList<>();
		list.addElementAtBeginning("A");
		String item=list.deleteLastElement();
		assertTrue(list.isEmpty());
		assertTrue("A".equals(item));
	}
	
	@Test
	public void testMultipleItemListDeleteLast() {
		LinkedList<String> list = new DoublyLinkedList<>();
		list.addElementAtBeginning("A");
		list.addElementAtBeginning("B");
		list.addElementAtBeginning("C");
		String item=list.deleteLastElement();
		assertTrue("A".equals(item));
	}
	
	@Test
	public void testMatchItemListDelete() {
		LinkedList<String> list = new DoublyLinkedList<>();
		list.addElementAtBeginning("A");
		list.addElementAtBeginning("B");
		list.addElementAtBeginning("C");
		boolean isDeleted=list.removeMatched("B");
		assertTrue(isDeleted==Boolean.TRUE);
	}
	
	@Test
	public void testGetPositionInEmptyList() {
		LinkedList<String> list = new DoublyLinkedList<>();
		Integer position=list.getPosition("A");
		assertTrue(Integer.valueOf(-1).equals(position));
	}
	
	@Test
	public void testGetPositionInList() {
		LinkedList<String> list = new DoublyLinkedList<>();
		list.addElementAtBeginning("A");
		list.addElementAtBeginning("B");
		Integer position=list.getPosition("A");
		assertTrue(Integer.valueOf(1).equals(position));
	}
}
