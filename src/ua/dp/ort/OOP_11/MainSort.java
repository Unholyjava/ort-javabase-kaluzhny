package ua.dp.ort.OOP_11;


import java.util.Arrays;

import ua.dp.ort.OOP_11.DataWorkers;

/**
 * class launches sort list of workers by salary "from largest to smallest"
 * and sort by names, if workers salaries are equal.
 * Class also print sort all list, first five members and 
 * last three members in console.
 * @author Admin
 *
 */
public class MainSort {
		
	public static void main(String[] args) {
		Worker[] arrayWorkers = new Worker[DataWorkers.setAllWorkers().size()];
		arrayWorkers = (Worker[])DataWorkers.setAllWorkers().toArray(arrayWorkers);
				
		Arrays.sort(arrayWorkers, new NameComparator());
		Arrays.sort(arrayWorkers, new SalaryComparator());
		for (int i = 0; i < arrayWorkers.length; ++i) {
			printWorkers(arrayWorkers, i);
		}
		
		System.out.println("\n" + "Первые 5 человек из списка:");
		for (int i = 0; i < 5; ++i) {
			printWorkers(arrayWorkers, i);
		}
		
		System.out.println("\n" + "Последние 3 человека из списка:");
		for (int i = arrayWorkers.length - 3; i < arrayWorkers.length; ++i) {
			printWorkers(arrayWorkers, i);
		}
		
	}

	private static void printWorkers(Worker[] arrayWorkers, int i) {
		StringBuilder sb = new StringBuilder();
		sb.append("№ ").append(arrayWorkers[i].getNumber())
			.append(" ").append(arrayWorkers[i].getName())
			.append(", з/п ").append(arrayWorkers[i].getSalary());
		System.out.println(sb.toString());
	}
}
