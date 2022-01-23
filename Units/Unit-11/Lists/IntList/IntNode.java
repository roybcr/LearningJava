public class IntNode {
	
	private int _value;
	private IntNode _next;

	public IntNode(int val) {
		this(val, null);
	}

	public IntNode(int value, IntNode next) {
		_value = value;
		_next = next;
	}

	public int getValue() {
		return _value;
	}

	public IntNode getNext() {
		return _next;
	}

	public void setValue(int val) {
		_value = val;
	}

	public void setNext(IntNode next) {
		_next = next;
	}

}