package ua.dp.ort.OOP_11;

/**
 * TimeWorker extends Worker - class who's members has salary,
 * which is calculated according to the employee's work time.
 * Has also override method, which calculate salary.
 * @author Admin
 *
 */
public class TimeWorker extends Worker {
	//private double _salary;
	
	/**
	 * empty constructor
	 */
	public TimeWorker() {}
	
	/**
	 * constructor with parameters
	 * @param number - worker's number
	 * @param name - worker's name
	 */
	public TimeWorker(int number, String name) {
		super(number, name);
		setSalary();
	}
	
	
	
		
	@Override
	/**
	 * method, which delegated in class TimeWorkerSalary
	 */
	public void setSalary() {
		_salary = TimeWorkerSalary.workerSalary();
	}

}
