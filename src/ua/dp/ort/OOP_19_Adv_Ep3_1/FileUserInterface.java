package ua.dp.ort.OOP_19_Adv_Ep3_1;

import java.io.IOException;

/**
 * This class is mechanism to give result of arithmetic operation 
 * in file from another file with String data, using one or more threads  
 * Class FileUserInterface implements interface UserInterface
 * Class FileUserInterface runs some methods (in own method "start"):
 * - read file with arithmetic operation using one or more threads
 * (class ReadWriteFileCalculator), 
 * - check input data for compliance with the specified format (in class ValidatorExamples), 
 * - run arithmetic operation (in class SimpleCalculatorService),
 * - save result of arithmetic operations or throw exceptions,
 * - write result in file (in class ResultOut) 
 * @author Kalyuzhny
 *
 */
public class FileUserInterface implements UserInterface{

	private static CalculatorService _calculatorService;
	private static double _result;
	private static String _example;
	private static final int _NUMBER_THREADS = 2;	

	/**
	 * Constructor with parameters
	 * @param calculatorService - variable of interface CalculatorService
	 * and then field of class FileUserInterface -    
	 * use for run method "evaluate" (do arithmetic operations)in this interface 
	 * and class SimpleCalculatorService 
	 */
	public FileUserInterface(CalculatorService calculatorService) {
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
	 * - generate threads for read and calculate arithmetic operations 
	 * - read input data, 
	 * - validation input data,
	 * - calculation arithmetic operations,
	 * - save and write in file result of arithmetic operations
	 * class CommandToReadWrite is the pattern "Command" for class ReadWriteFileCalculator 
	 */
	public void start() throws IOException {
		new CommandToReadWrite(_NUMBER_THREADS).startReadWrite();
	}

	/**
	 * This method validate string of input file, is it correct 
	 * @param stringCurrent - arithmetic operation type String 
	 * @throws CalculatorException
	 */
	public static void calculateCurrentString(String stringCurrent) throws CalculatorException {
		ValidatorExamples validator = new ValidatorExamples();
		validatorExampleDo(stringCurrent, validator);
	}
	
	private static void validatorExampleDo(String stringCurrent, 
			ValidatorExamples validator) throws CalculatorException {
		
		String example = stringCurrent;
		ValidatorExamples.setAllValidator(false);
		if (!validator.validatorFormat(example)) {
			throw new CalculatorException("Неверный формат данных" + 
				": " + example);
		} else if (!validator.validatorValue(example)) {
				throw new CalculatorException("Один или более операндов "
					+ "выходят за пределы допустимых значений");
		}
		if (!validator.validatorDivisionByZero(example)) {
			throw new CalculatorException("В выражении содержится "
				+ "деление на 0");
		}
		ValidatorExamples.setAllValidator(true);
		setCalculatorService(new SimpleCalculatorService());
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
