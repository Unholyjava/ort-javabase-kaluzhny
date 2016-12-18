package ua.dp.ort.OOP_11;

/**
 * class, which realized method for class TimeWorker
 * @author Admin
 *
 */
public class TimeWorkerSalary {
	
	/**
	 * a coefficient for the calculation - hourly rate
	 */
	public static final int HOUR_SALARY = 50;
	
	/**
	 * method for class TimeWorker
	 * @return - worker's salary
	 */
	public static double workerSalary() {
		double timeWorkerSalary = 20.8 * 8 * HOUR_SALARY;
		return timeWorkerSalary;
	}
}
