package ua.dp.ort.OOP_11;

import java.util.Comparator;

/**
 * class SalaryComparator sort list by worker's salary
 * @author Admin
 *
 */
public class SalaryComparator implements Comparator <Worker>{

	@Override
	/**
	 * Implemented method for Comparator, which
	 * set "from largest to smallest"
	 */
	public int compare(Worker o1, Worker o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}

}


