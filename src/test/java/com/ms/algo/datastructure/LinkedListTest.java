package com.ms.algo.datastructure;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import com.ms.algo.datastructures.linkedlist.LinkedList;
import com.ms.algo.datastructures.linkedlist.SingleLinkedList;
import com.ms.algo.datastructures.linkedlist.ListNode;


public class LinkedListTest {
	private LinkedList<String> list = new SingleLinkedList<>();
	@Test
	public void testEmptyListPrint() {
		LinkedList<String> list = new SingleLinkedList<>();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testEmptyListDeleteFirst() {
		LinkedList<String> list = new SingleLinkedList<>();
		list.deleteFirstElement();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testEmptyListDeleteLast() {
		LinkedList<String> list = new SingleLinkedList<>();
		list.deleteLastElement();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testSingleItemListDeleteLast() {
		LinkedList<String> list = new SingleLinkedList<>();
		list.addElementAtBeginning("A");
		String item=list.deleteLastElement();
		assertTrue(list.isEmpty());
		assertTrue("A".equals(item));
	}
	
	@Test
	public void testMultipleItemListDeleteLast() {
		LinkedList<String> list = new SingleLinkedList<>();
		list.addElementAtBeginning("A");
		list.addElementAtBeginning("B");
		list.addElementAtBeginning("C");
		String item=list.deleteLastElement();
		assertTrue("A".equals(item));
	}
	
	@Test
	public void testMatchItemListDelete() {
		LinkedList<String> list = new SingleLinkedList<>();
		list.addElementAtBeginning("A");
		list.addElementAtBeginning("B");
		list.addElementAtBeginning("C");
		boolean isDeleted=list.removeMatched(new ListNode<>("B"));
		assertTrue(isDeleted==Boolean.TRUE);
	}
	
	@Test
	public void testGetPositionInEmptyList() {
		LinkedList<String> list = new SingleLinkedList<>();
		Integer position=list.getPosition("A");
		assertTrue(Integer.valueOf(-1).equals(position));
	}
	
	@Test
	public void testGetPositionInList() {
		LinkedList<String> list = new SingleLinkedList<>();
		list.addElementAtBeginning("A");
		list.addElementAtBeginning("B");
		Integer position=list.getPosition("A");
		assertTrue(Integer.valueOf(1).equals(position));
	}
	
	@Test
	public void testSLLReverese() {
		LinkedList<String> list = new SingleLinkedList<>();
		list.addElementAtBeginning("D");
		list.addElementAtBeginning("C");
		list.addElementAtBeginning("B");
		list.addElementAtBeginning("A");
		list.reverse();
		System.out.println(list);
	}
	@After
	public void afterTest(){
		list.clear();
	}
}
