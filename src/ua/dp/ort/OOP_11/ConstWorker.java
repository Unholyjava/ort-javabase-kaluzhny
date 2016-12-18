package ua.dp.ort.OOP_11;

/**
 * ConstWorker extends Worker - class who's members has salary,
 * which is calculated as average month salary.
 * Has also override method, which calculate salary.
 * @author Admin
 *
 */
public class ConstWorker extends Worker{
	//private double _salary;
	/**
	 * empty constructor 
	 */
	public ConstWorker() {};
	
	/**
	 * constructor with parameters
	 * @param number - worker's number
	 * @param name - worker's name
	 */
	public ConstWorker(int number, String name) {
		super (number, name);
		setSalary();
	}

	
	
	@Override
	/**
	 * method, which delegated in class ConstWorkerSalary
	 */
	public void setSalary() {
		_salary = ConstWorkerSalary.workerSalary();
	}
}
