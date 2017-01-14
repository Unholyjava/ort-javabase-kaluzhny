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
	 * Getter for field _valueElement
	 * @return - data of list's element
	 */
	public int getValueElement() {
		return _valueElement;
	}

	/**
	 * Setter for field _valueElement
	 * @param set data of list's element
	 */
	public void setValueElement(int value) {
		_valueElement = value;
	}

	/**
	 * Getter for field _nextElement
	 * @return - pointer to the next element
	 */
	public LinkedListNode getNextElement() {
		return _nextElement;
	}

	/**
	 * Setter for field _nextElement
	 * @param set pointer to the next element
	 */
	public void setNextElement(LinkedListNode nextElement) {
		_nextElement = nextElement;
	}
	
}
