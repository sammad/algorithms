package com.ms.algo.datastructure;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.ms.algo.datastructures.linkedlist.LinkedStack;
import com.ms.algo.datastructures.linkedlist.Stack;

public class LinkedStackTest {

	private Stack<String> linkedStack = new LinkedStack<>();
	
	@Test
	public void testPushForLinkedStack(){
		linkedStack.push("A");
		Assert.assertTrue(linkedStack.pop().equals("A"));
		Assert.assertTrue(linkedStack.isEmpty());
	}
	
	@After
	public void cleanStack(){
		linkedStack.clear();
	}

}
