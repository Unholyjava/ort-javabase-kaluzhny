package ua.dp.ort.OOP_08;

/**
 * Class is implementation singly linked list.
 * Class contains follow methods:
 * addToTail, addToHead, removeElement, removeAll,
 * readContains, copyToArray, getCounter. 
 * @author Admin
 *
 */
public class SinglyLinkedList {
	private LinkedListNode _headElement;
	private LinkedListNode _tailElement;
	private int _counter;

	/**
	 * add element in tail of the list
	 * @param value - data of element
	 */
	public void addToTail (int value) {
		LinkedListNode element = new LinkedListNode(value);
		// if list was empty
		if (getHeadElement() == null) {
			setHeadElement(element);
			setTailElement(element);
		} else {
			getTailElement().setNextElement(element);
			setTailElement(element);
		}
		++_counter;
	}
	
	/**
	 * add element in head of the list
	 * @param value - data of element
	 */
	public void addToHead (int value) {
		LinkedListNode element = new LinkedListNode(value);
		if (getHeadElement() == null) {
			setHeadElement(element);
			setTailElement(element);
		} else {
			
			element.setNextElement(getHeadElement());
			setHeadElement(element);
		}
		++_counter;
	}
	
	/**
	 * remove element from list 
	 * or print failure message, if failed to remove
	 * @param value - data of element
	 * @return - true, if element was removed 
	 * 			and false, if element was not removed
	 */
	public boolean removeElement(int value) {
		LinkedListNode previousElement = null;
		LinkedListNode currentElement = getHeadElement();
		while (currentElement != null) {
			if (currentElement.getValueElement() == value) {
				// if remove element is in middle or in tail of list 
				if (previousElement != null) {
					previousElement.setNextElement(currentElement.getNextElement());
					// if removed element was in tail of list
					if (currentElement.getNextElement() == null) {
						setTailElement(previousElement);
					}
				} else {
					setHeadElement(getHeadElement().getNextElement());
					// if list is empty after remove
					if (getHeadElement() == null) {
						setTailElement(null);
					}
				}
				--_counter;
				return true;
			}
			previousElement = currentElement;
			currentElement = currentElement.getNextElement();
		}
		return false;
	}
	
	/**
	 * read list and check contains element in list	
	 * @param value - verifiable element
	 * @return true, if verifiable element is in the list,
	 * 		or false, if verifiable element is not in the list
	 */
	public boolean readContains (int value) {
		LinkedListNode currentElement = getHeadElement();
		while (currentElement != null) {
			if (currentElement.getValueElement() == value) {
				return true;
			}
			currentElement = currentElement.getNextElement();
		}
		return false;
	}
	
	/**
	 * remove all elements of list, list will be empty
	 */
	public void removeAll() {
		setHeadElement(null);
		setTailElement(null);
		_counter = 0;
	}

	/**
	 * copy element of list in array
	 * @return array
	 */
	public int[] copyToArray () {
		LinkedListNode currentElement = getHeadElement();
		int i = 0;
		int[] listArray = new int[_counter];
		while (currentElement != null) {
			listArray[i] = currentElement.getValueElement();
			currentElement = currentElement.getNextElement();
			++i;
		}
		return listArray;
	}
	
	
	
	/**
	 * Getter for field _counter
	 * @return - quantity of elements in list
	 */
	public int getCounter() {
		return _counter;
	}
	
	private LinkedListNode getTailElement() {
		return _tailElement;
	}
	
	private void setTailElement(LinkedListNode tailElement) {
		_tailElement = tailElement;
	}
	
	private LinkedListNode getHeadElement() {
		return _headElement;
	}
	
	private void setHeadElement(LinkedListNode headElement) {
		_headElement = headElement;
	}
	
}
