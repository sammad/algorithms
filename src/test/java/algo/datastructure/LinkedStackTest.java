package algo.datastructure;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import algo.datastructures.LinkedStack;
import algo.datastructures.Stack;

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
