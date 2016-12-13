package ua.dp.ort.OOP_11;

/**
 * class, which realized method for class ConstWorker
 * @author Admin
 *
 */
public class ConstWorkerSalary {
	
	/**
	 * the average monthly salary
	 */
	public static final int MONTH_SALARY = 8000;
	
	/**
	 * method for class ConstWorker
	 * @return - worker's salary
	 */
	public static double workerSalary() {
		double constWorkerSalary = MONTH_SALARY;
		return constWorkerSalary;
	}
}
