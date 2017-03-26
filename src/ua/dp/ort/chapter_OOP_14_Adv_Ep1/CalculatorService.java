package ua.dp.ort.chapter_OOP_14_Adv_Ep1;

/**
 * This interface is abstract mechanism to give double numeric from String data
 * Implemented class - SimpleCalculatorService
 * @author Kalyuzhny
 *
 */
public interface CalculatorService {
	public double evaluate(String example) throws CalculatorException;
}
