package ua.dp.ort.OOP_08;

/**
 * Class is the node of singly linked list.
 * The node has a field of data (type "int") 
 * and a field as a pointer to the next element
 * @author Admin
 *
 */
public class LinkedListNode {
	private int _valueElement;
	private LinkedListNode _nextElement;
	
	/**
	 * constructor with parameters
	 * @param value - data in list
	 */
	public LinkedListNode (int value) {
		setValueElement(value);
	}

	/**
	 * Getter
	 * @return - data of list's element
	 */
	public int getValueElement() {
		return _valueElement;
	}

	/**
	 * Setter
	 * @param set data of list's element
	 */
	public void setValueElement(int value) {
		_valueElement = value;
	}

	/**
	 * Getter
	 * @return - pointer to the next element
	 */
	public LinkedListNode getNextElement() {
		return _nextElement;
	}

	/**
	 * Setter
	 * @param set pointer to the next element
	 */
	public void setNextElement(LinkedListNode nextElement) {
		_nextElement = nextElement;
	}
	
}
