package com.ms.algo.datastructure;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import com.ms.algo.datastructures.LinkedList;
import com.ms.algo.datastructures.LinkedListImpl;


public class LinkedListTest {
	private LinkedList<String> list = new LinkedListImpl<>();
	@Test
	public void testEmptyListPrint() {
		LinkedList<String> list = new LinkedListImpl<>();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testEmptyListDeleteFirst() {
		LinkedList<String> list = new LinkedListImpl<>();
		list.deleteFirstElement();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testEmptyListDeleteLast() {
		LinkedList<String> list = new LinkedListImpl<>();
		list.deleteLastElement();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
	}
	
	@Test
	public void testSingleItemListDeleteLast() {
		LinkedList<String> list = new LinkedListImpl<>();
		list.addElementAtBeginning("A");
		String item=list.deleteLastElement();
		List<String> strElementList=list.printList();
		assertTrue(strElementList.isEmpty());
		assertTrue("A".equals(item));
	}
	
	@Test
	public void testMultipleItemListDeleteLast() {
		LinkedList<String> list = new LinkedListImpl<>();
		list.addElementAtBeginning("A");
		list.addElementAtBeginning("B");
		list.addElementAtBeginning("C");
		String item=list.deleteLastElement();
		assertTrue("A".equals(item));
	}
	@After
	public void afterTest(){
		list.clear();
	}
}
