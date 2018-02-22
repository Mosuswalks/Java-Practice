package genericLinkedList;
import genericNode.GenericNode;

public class GenericLinkedList<T> implements GenericLLInterface<T> {
	
	private GenericNode<T> head;
	protected String name;
	
	public GenericLinkedList(String name){
		head = null;
		this.name = name;
	}
	
	public void insert(T data) {
		GenericNode<T> newNode = new GenericNode<>(data);
		newNode.setNext(head);
		head = newNode;
	};
	
	public boolean isFull() {
		return false;
	};
	
	public int size() {
		int size = 0;
		GenericNode<T> currentNode = head;
		
		while(currentNode != null) {
			size = size + 1;
			currentNode = currentNode.getNext();
		}
		return size;
	};
	
	public boolean contains(T data) {
		GenericNode<T> currentNode = head;
		
		while(currentNode != null) {
			if((currentNode.getData()).equals(data)) {
				return true;
			}
			currentNode = currentNode.getNext();
		}
		return false;
	};
	
	public void clear() {
		GenericNode<T> currentNode = head;
		
		while(currentNode != null) {
			currentNode = head.getNext();
			currentNode = null;
		}
	};
	
	public String toString() {
		GenericNode<T> currentNode = head;
		String values = "Linked List Values \n";
		
		while(currentNode != null) {
			values = values + "- "+ currentNode.getData() + "\n";
			currentNode = currentNode.getNext();
		}
		return values;
	};
	
	public void insertBack(T data) {
		
		GenericNode<T> lastNode = new GenericNode<>(data);
		GenericNode<T> currentNode = head;
		
		if(currentNode == null) {
			currentNode = lastNode;
			currentNode.setNext(null);
			return;
		}else {
			while(currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(lastNode);
		}
	};
	
	public void insertMiddle(T data) {
		
	};

}
