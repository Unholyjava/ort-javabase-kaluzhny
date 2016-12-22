package ua.dp.ort.OOP_08;

import java.util.Arrays;

/**
 * Class for testing methods of class SinglyLinkedList:
 * @author Admin
 *
 */
public class TestLinkedList {
	public static void main(String[] args) {
		
		// Add elements in head and in tail
		System.out.println("Тест 1");
		SinglyLinkedList fiveElements = new SinglyLinkedList();
		fiveElements.addToHead(1);
		fiveElements.addToHead(2);
		fiveElements.addToTail(3);
		fiveElements.addToTail(4);
		fiveElements.addToTail(5);
		printElements(fiveElements);
		
		// Remove element
		System.out.println("Тест 2");
		final int removeValue = 3;
		boolean resultRemove = fiveElements.removeElement(removeValue);
		if (resultRemove == false) {
			System.out.println("Список не содержит элемента " 
				+ removeValue + " или пуст");
		}	else {
			System.out.println("Удаление успешно");
			printElements(fiveElements);
		}
		
		// Check contains element in list
		System.out.println("Тест 3");
		final int contains = 4;
		boolean resultContains = fiveElements.readContains(contains);
		if (resultContains == true) {
			System.out.println("Элемент со значением " + contains 
					+ " находится в списке" + "\n");
		} else {
			System.out.println("Элемента со значением " + contains 
					+ " нет в списке" + "\n");
		}
		
		// remove all elements
		System.out.println("Тест 4");
		fiveElements.removeAll();
		printElements(fiveElements);
	}
	
	
	
	// Print list and check methods copyToArray and getCounter
	private static void printElements(SinglyLinkedList fiveElements) {
		System.out.println(Arrays.toString(fiveElements.copyToArray()));
		System.out.println("Количество элементов = " 
				+ fiveElements.getCounter() + "\n");  
	}
}
