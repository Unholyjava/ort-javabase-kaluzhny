package ua.dp.ort.OOP_19_Adv_Ep3_1;

import java.io.IOException;

/**
 * Run-class for other paths of program,
 * uses one method, which catch exception
 * @author Kalyuzhny
 *
 */
public class Main {

	/**
	 * This method runs direct method in interface UserInterface
	 * This method catches exception, which throw in class FileUserInterface,
	 * method use, while errors are in list of definitions 
	 * in the class ValidatorExamples 
	 * @param args
	 */
	public static void main(String[] args) {
		while (!ValidatorExamples.getAllValidator()) {
			try {
				UserInterface ui = new FileUserInterface(FileUserInterface.getCalculatorService());
				ui.start();
			} catch (CalculatorException e) {
				System.out.println(e + "\n");
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
