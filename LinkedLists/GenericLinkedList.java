

package linkedLists;

public class LinkedLists<T> implements LinkedListsInterface<T> {
	
	// Creating a Node object for the head value and a String for list name
	private Node<T> head;
	protected String name;
	
	/*
	* Constructor
	*/
	public LinkedLists(String name){
		head = null;
		this.name = name;
	}
	
	/*
	* Creates a new Node and sets its next value to head. The new Node is then set as the head of the list.
	*/
	public void insert(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNext(head);
		head = newNode;
	};
	
	/*
	* Always returns false since a Linked Lists can never be full(memory permitting).
	*/
	public boolean isFull() {
		return false;
	};
	
	/*
	* Transverses the list while keeping count of each node which does not equal Null.
	*/
	public int size() {
		int size = 0;
		Node<T> currentNode = head;
		
		while(currentNode != null) {
			size = size + 1;
			currentNode = currentNode.getNext();
		}
		return size;
	};
	/*
	* Transverses the LinkedList and checks each Nodes value for the parameter being passed through. 
	*/
	public boolean contains(T data) {
		Node<T> currentNode = head;
		
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
	 * Transverse the Linked List until
	 */
	public String toString() {
		Node<T> currentNode = head;
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
	 * Transverses the list until a null value is reached,
	 * and then sets the currentNodes next value to the newly created node.
	 */
	public void insertBack(T data) {
			
		Node<T> lastNode = new Node<>(data);
		Node<T> currentNode = head;
		
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
	* Divides the size by 2 and inserts the node at the middle value.
	* Connects the middle node to currentNodes next and currentNode to middleNode.
	*/
	public void insertMiddle(T data) {
		
		Node<T> middleNode = new Node<>(data);
		Node<T> currentNode = head;
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
	
	
	/*
	 * Solution to COMP2080 Data Structures and Algorithms Lab Test 1C
	 */
	public T locateConvergence(LinkedLists<T> listL, LinkedLists<T> listM) {
		
		// 1. Using the size() method, Get the size/length of both lists and store them into separate variables.
		int sizeOfL = listL.size();
		int sizeOfM = listM.size();
		
		// 2. Store a reference of each lists head into Node Objects. 
		Node<T> listLHead = listL.head;
		Node<T> listMHead = listM.head;
		
		// 3. Utilize a while loop to ensure that the lists are aligned at the same starting point. 
		while(sizeOfL > sizeOfM) {
			listMHead = listLHead.getNext();
			sizeOfL--;
		}
		while(sizeOfL < sizeOfM) {
			listMHead = listMHead.getNext();
			sizeOfM--;
		}
		
		// 4. Transverse both lists simultaneously until node values match.
		while(listLHead.getData() != listMHead.getData()) {
			listLHead = listLHead.getNext();
			listMHead = listMHead.getNext();	
		}
		
		// 5. If we have a match, return the data else return null.
		if(listLHead.getData().equals(listMHead.getData())) {
			return listLHead.getData();
		}
		else {
			return null;
		}
		
	}
}
