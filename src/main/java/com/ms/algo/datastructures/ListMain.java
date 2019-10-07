package com.ms.algo.datastructures;

public class ListMain {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedListImpl<>();
		linkedList.addElementAtBeginning("A");
		/*linkedList.addElementAtBeginning("B");
		linkedList.addElementAtBeginning("C");
		linkedList.addElementAtBeginning("D");
		linkedList.addElementAtBeginning("E");
		linkedList.addElementAtBeginning("F");
		linkedList.addElementAtLast("X");
		linkedList.addElementAtLast("Y");
		linkedList.addElementAtLast("Z");*/
		System.out.println(linkedList.printList());
		linkedList.deleteFirstElement();
		System.out.println(linkedList.printList());
		linkedList.deleteFirstElement();
		System.out.println(linkedList.printList());
	}
}
