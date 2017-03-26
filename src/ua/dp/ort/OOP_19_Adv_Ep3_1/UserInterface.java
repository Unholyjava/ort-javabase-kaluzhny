package ua.dp.ort.OOP_19_Adv_Ep3_1;

import java.io.IOException;

/**
 * This interface defines the basic mechanism of the calculator - 
 * checks, arithmetic operations, output the result.
 * Implemented class - ConsoleUserInterface.
 * @author Kalyuzhny
 *
 */
public interface UserInterface {
	public void start() throws CalculatorException, IOException;
}
