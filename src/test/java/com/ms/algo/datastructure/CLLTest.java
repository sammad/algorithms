package com.ms.algo.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ms.algo.datastructures.linkedlist.CircularLinkedList;

public class CLLTest {

	@Test
	public void testAddElementAtBeginning() {
		CircularLinkedList<String> cll = new CircularLinkedList<>();
		cll.addElementAtBeginning("A");
		cll.addElementAtBeginning("B");
		assertTrue("B-->A-->null".equalsIgnoreCase(cll.toString()));
	}

	@Test
	public void testAddElementAtLast() {
		CircularLinkedList<String> cll = new CircularLinkedList<>();
		cll.addElementAtLast("A");
		cll.addElementAtLast("B");
		cll.addElementAtLast("C");
		assertTrue("A-->B-->C-->null".equalsIgnoreCase(cll.toString()));
	}

	@Test
	public void testSearchElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveMatched() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintList() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteFirstElement() {
		CircularLinkedList<String> cll = new CircularLinkedList<>();
		cll.addElementAtLast("A");
		cll.addElementAtLast("B");
		cll.addElementAtLast("C");
		assertTrue("A-->B-->C-->null".equalsIgnoreCase(cll.toString()));
		cll.deleteFirstElement();
		assertTrue("B-->C-->null".equalsIgnoreCase(cll.toString()));
	}

	@Test
	public void testDeleteLastElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveAtPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testReverse() {
		fail("Not yet implemented");
	}

}
