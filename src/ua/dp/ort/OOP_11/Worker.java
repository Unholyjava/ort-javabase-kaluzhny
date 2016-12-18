package ua.dp.ort.OOP_11;

/**
 * Worker - abstract class workers, who has next fields:
 * _number, _name and _salary.
 * This class also has abstract method for set _salary. 
 * @author Admin
 *
 */
public abstract class Worker {
	private int _number;
	private String _name;
	protected double _salary;
	
	/**
	 * empty constructor
	 */
	public Worker() {};
	
	/**
	 * constructor with parameters
	 * @param number - worker's number
	 * @param name - worker's name
	 */
	public Worker(int number, String name) {
		setNumber(number);
		setName(name);
	}
	/**
	 * Getter 
	 * @return - number of worker
	 */
	public int getNumber() {
		return _number;
	}
	/**
	 * Setter
	 * @param set number of worker
	 */
	public void setNumber(int number) {
		_number = number;
	}
	/**
	 * Getter
	 * @return - name of worker
	 */
	public String getName() {
		return _name;
	}
	/**
	 * Setter
	 * @param set name of worker
	 */
	public void setName(String name) {
		_name = name;
	}
	
	/**
	 * Abstract setter
	 * @param abstract set worker's salary
	 */
	public abstract void setSalary();
		
	/**
	 * Getter
	 * @return - worker's salary
	 */
	public double getSalary() {
		return _salary;
	}
	
}
