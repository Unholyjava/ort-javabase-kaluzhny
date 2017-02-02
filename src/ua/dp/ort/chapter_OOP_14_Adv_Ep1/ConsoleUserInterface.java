package ua.dp.ort.chapter_OOP_14_Adv_Ep1;

import java.util.Scanner;

/**
 * This class is mechanism to give double numeric in console 
 * from String data which user input also in console
 * Class ConsoleUserInterface implements interface UserInterface
 * Class ConsoleUserInterface runs some methods (in own method "start"): 
 * - check input data for compliance with the specified format (in class ValidatorExamples), 
 * - run arithmetic operation (in class SimpleCalculatorService),
 * - save result of arithmetic operations or throw exceptions,
 * - print result (in class ResultOut) 
 * @author Kalyuzhny
 *
 */
public class ConsoleUserInterface implements UserInterface{

	private static CalculatorService _calculatorService;
	private static double _result;
	private static String _example;
		

	/**
	 * Constructor with parameters
	 * @param calculatorService - variable of interface CalculatorService
	 * and then field of class ConsoleUserInterface -    
	 * use for run method "evaluate" (do arithmetic operations)in this interface 
	 * and class SimpleCalculatorService 
	 */
	public ConsoleUserInterface(CalculatorService calculatorService) {
		super();
		setCalculatorService(calculatorService);
	}
	
	private static void setCalculatorService(CalculatorService calculatorService) {
		_calculatorService = calculatorService;
	}
		
	/**
	 * Getter-method for class field 
	 * @return _calculatorService
	 */
	public static CalculatorService getCalculatorService() {
		return _calculatorService;
	}
	
	@Override
	/**
	 * This method runs 
	 * - input data, 
	 * - validation input data,
	 * - calculation arithmetic operations,
	 * - save and print result of arithmetic operations
	 */
	public void start() throws CalculatorException {
		Scanner sc = new Scanner(System.in);
		ValidatorExamples validator = new ValidatorExamples();
		
		validatorExampleDo(sc, validator);
		
		ResultOut resultOut = new ResultOut();
		resultOut.printConsole(getExample(), getResult());
		sc.close();
		
	}
	
	private void validatorExampleDo(Scanner sc, ValidatorExamples validator) throws CalculatorException {
		
		System.out.print("Введите математическое выражение: ");
		String example = sc.nextLine();
			ValidatorExamples.setAllValidator(false);
			if (!validator.validatorFormat(example)) {
				throw new CalculatorException("Неверный формат данных");
			} else if (!validator.validatorValue(example)) {
					throw new CalculatorException("Один или более операндов "
							+ "выходят за пределы допустимых значений");
			}
			if (!validator.validatorDivision0(example)) {
				throw new CalculatorException("В выражении содержится "
						+ "деление на 0");
			}
			ValidatorExamples.setAllValidator(true);
			setCalculatorService(new SimpleCalculatorService(example));
			setResult(getCalculatorService().evaluate(example));
			setExample(example);
	}

	private static void setResult(double result) {
		_result = result;
	}

	private static void setExample(String example) {
		_example = example;
	}

	/**
	 * Getter-method, return result of arithmetic operation
	 * @return _result
	 */
	public static double getResult() {
		return _result;
	}
	
	/**
	 * Getter-method, return String data, which user input in console 
	 * @return _example
	 */
	public static String getExample() {
		return _example;
	}
		
}
