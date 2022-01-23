public class IntList {

	private IntNode _head;

	public IntList() {
		this(null);
	}

	public IntList(IntNode head) {
		_head = head;
	}

	public IntNode getHead() {
		return _head;
	}

	public void setHead(IntNode head) {
		_head = head;
	}

	public boolean empty() {
		return this.getHead() == null;
	}

	public int getLength() {
		
	}

	public int getValueOfNode(IntNode node) {
		return node.getValue();
	}

	public IntNode nextElement(IntNode node) {
		return node.getNext();
	}


	public void addToHead(IntNode node) {
		IntNode temp = this.getHead();
		this.setHead(node);
		node.setNext(temp);
	} 

	public void addToEnd(IntNode node) {
		
		if(this.empty()) {
			this.setHead(node);
			return;
		}
		
		IntNode ptr = this.getHead();
		
		while(ptr.getNext() != null) {
			ptr = this.nextElement(ptr);
		}

		ptr.setNext(node);
	}

	public void remove (int num) {
		
		if(this.empty())
			return;
		
		if(this.getHead().getValue() == num){
			this.setHead(this.nextElement(this.getHead()));
			return;
		}
			 
		IntNode behind = this.getHead();
		while(this.nextElement(behind) != null) {			
			if(this.getValueOfNode(this.nextElement(behind)) == num) {
				behind.setNext(this.nextElement(this.nextElement(behind)));
				return;
			}

			behind = this.nextElement(behind);
		}
	}

	public IntNode predecessor(IntNode node) {
	
		if(this.empty() || this.getHead() == node)
			return null;

		IntNode behind = this.getHead();
	
		while(behind.getNext() != null) {
			if(behind.getNext() == node)
				return behind;
			behind = behind.getNext();
		}

		return null;
	}

	public void printList() {
		
		IntNode temp = this.getHead();
		while(temp != null) {
			System.out.print(temp.getValue() + " --> ");
			temp = this.nextElement(temp);
		}

		System.out.println("null");
	}
}






