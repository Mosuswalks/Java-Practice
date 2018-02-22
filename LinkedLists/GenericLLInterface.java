package genericLinkedList;

public interface GenericLLInterface<T> {
	
	public void insert(T element);
	public boolean isFull();
	public int size();
	public boolean contains(T element);
	public void clear();
	public String toString();
	public void insertBack(T Element);
	public void insertMiddle(T Element);
}
