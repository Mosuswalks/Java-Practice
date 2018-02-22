package genericNode;

public class GenericNode<T> {
	
	private T data;
	private GenericNode<T> next;
	
	public GenericNode(T data){
		this.data = data;
		this.setNext(null);
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
		return;
	}
	
	public GenericNode<T> getNext() {
		return next;
	}
	
	public void setNext(GenericNode<T> next) {
		this.next = next;
	}
}
