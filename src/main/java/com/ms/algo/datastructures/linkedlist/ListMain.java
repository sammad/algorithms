package com.ms.algo.datastructures.linkedlist;

public class ListMain {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new SingleLinkedList<>();
		linkedList.addElementAtBeginning("A");
		linkedList.addElementAtBeginning("B");
		linkedList.addElementAtBeginning("C");
		linkedList.addElementAtBeginning("D");
		linkedList.addElementAtBeginning("E");
		linkedList.addElementAtBeginning("F");
		linkedList.addElementAtLast("X");
		linkedList.addElementAtLast("Y");
		linkedList.addElementAtLast("Z");
		System.out.println(linkedList.printList());
		linkedList.deleteFirstElement();
		System.out.println(linkedList.printList());
		linkedList.deleteFirstElement();
		System.out.println(linkedList.printList());
		linkedList.deleteLastElement();
		System.out.println(linkedList.printList());
		System.out.println(linkedList.searchElement("F"));
		linkedList.removeMatched(new ListNode<String>("B"));
		System.out.println(linkedList.printList());
	}
}
