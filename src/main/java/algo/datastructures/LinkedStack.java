package algo.datastructures;

import java.util.List;

public class LinkedStack<T> implements Stack<T> {

	private LinkedList<T> list;
	
	public LinkedStack(){
		list = new LinkedListImpl<>();
	}
	
	@Override
	public void push(T item) {
		list.addElementAtBeginning(item);
	}

	@Override
	public T pop() {
		return list.deleteFirstElement();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public List<T> showStackItems() {
		return list.printList();
	}

	@Override
	public void clear() {
		list.clear();
	}

	
}
