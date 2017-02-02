package ua.dp.ort.chapter_OOP_14_Adv_Ep1;

/**
 * Run-class for other paths of program,
 * uses one method, which catch exception
 * @author Kalyuzhny
 *
 */
public class Main {

	/**
	 * This method runs direct method in interface UserInterface
	 * This method catches exception, which throw in class ConsoleUserInterface,
	 * method use, while errors are in list of definitions 
	 * in the class ValidatorExamples 
	 * @param args
	 */
	public static void main(String[] args) {
		while (!ValidatorExamples.getAllValidator()) {
			try {
				UserInterface ui = new ConsoleUserInterface(ConsoleUserInterface.getCalculatorService());
				ui.start();
			} catch (CalculatorException e) {
				System.out.println(e + "\n");
				//e.printStackTrace();
			}
		}

	}

}
