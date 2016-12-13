package ua.dp.ort.OOP_11;


import java.util.Comparator;

/**
 * class NameComparator sort list by worker's name
 * @author Admin
 *
 */
public class NameComparator implements Comparator<Worker> {

	@Override
	/**
	 * Implemented method for Comparator, which
	 * set "from smallest to largest" 
	 */
	public int compare(Worker o1, Worker o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
