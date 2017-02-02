package ua.dp.ort.chapter_OOP_14_Adv_Ep1;

public class CalculatorException extends Exception {
	
	/**
	 * This class is for print out own messages when error action
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor with parameter
	 * @param message - error message 
	 */
	public CalculatorException(String message) {
		super(message);
	}
	
	/**
	 * This method overrides method of class Throwable for best read  
	 */
	@Override
	public String toString() {
		return getMessage();
	}


}
