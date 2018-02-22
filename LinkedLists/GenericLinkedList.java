package genericLinkedList;

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
	
	/*
	 * To clear the LinkedList simply set the head value to null. 
	 * Because Java has automatic garbage collection, there is no need to remove each element or node.
	 */
	public void clear() {
		head = null;
	};
	
	
	/*
	 *
	 */
	public String toString() {
		GenericNode<T> currentNode = head;
		int count = 0;
		String values = "List: "+ name + "\nContains \n\n";
		String nodeValues = "";
			
		while(currentNode != null) {
			count = count + 1;
			nodeValues = nodeValues + "" +  count +": "+ currentNode.getData() + "\n";
			currentNode = currentNode.getNext();
		}
		return values + nodeValues;
	};
	
	/*
	 * 
	 * 
	 */
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
	
	/*
	*
	*/
	public void insertMiddle(T data) {
		
		GenericNode<T> middleNode = new GenericNode<>(data);
		GenericNode<T> currentNode = head;
		int middleIndex = Math.round(size()/2);
		
		if(currentNode == null) {
			currentNode = middleNode;
			currentNode.setNext(null);
			return;
		}else {
			for(int i = 1; i < middleIndex; i++) {
				currentNode = currentNode.getNext();
			}
			middleNode.setNext(currentNode.getNext());
			currentNode.setNext(middleNode);
		}
	};
	
	public GenericLinkedList<Object> appendLists(T list1, T list2, T list3) {
		GenericLinkedList<Object> W = new GenericLinkedList<>("W");
		
		W.insert(list1);
		W.insert(list2);
		W.insert(list3);
		
		return W;
	}
	
	public void reverseLinkedList() {
		GenericNode<T> currentNode = head;
		
		
	}
}
