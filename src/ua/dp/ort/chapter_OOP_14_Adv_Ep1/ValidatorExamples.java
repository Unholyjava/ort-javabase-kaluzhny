package ua.dp.ort.chapter_OOP_14_Adv_Ep1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contains three methods, which are check 
 * user's input String-arithmetic expression for compliance with the rules
 * Rules are described in a class SimpleCalculatorService
 * The status of all checks is in the class fields  
 * @author Kalyuzhny
 *
 */
public class ValidatorExamples {
	
	private static boolean _allValidator;
	private boolean _valueValidator;
	private boolean _formatValidator;
	private boolean _division0;
	
	public ValidatorExamples() {
	}
	
	/**
	 * Constructor with parameters String example - user's input arithmetic expression
	 * @param example
	 */
	public ValidatorExamples(String example) {
	}
	
	/**
	 * Constructor with parameters double value - converted arithmetic operands
	 * @param value
	 */
	public ValidatorExamples(double value) {
	}
	
	/**
	 * This method validates user's input String-arithmetic expression 
	 * for compliance with the rules.
	 * @param example - String-arithmetic expression
	 * @return - true, if expression complies with the rules
	 */
	public boolean validatorFormat(String example){  
		Pattern p = Pattern.compile("^(\\d(\\.\\d{0,3})?[-\\+\\*\\/])+\\d(\\.\\d{0,3})?$");
		Matcher m = p.matcher(example);  
		setFormatValidator(m.matches());
		return getFormatValidator(); 
	}
	
	/**
	 * This method validates use division by zero
	 * @param example - String-arithmetic expression
	 * @return - true, if no use division by zero
	 */
	public boolean validatorDivision0(String example) {
		Pattern p = Pattern.compile(".+\\/0.?+");
		Matcher m = p.matcher(example);  
		setDivision0(!m.matches());
		return getDivision0(); 
	}
	
	/**
	 * This method validates minimum and maximum use numeric
	 * @param example - String-arithmetic expression
	 * @return true, if all operands use in corridor
	 *  Integer.MIN_VALUE - Integer.MAX_VALUE
	 */
	public boolean validatorValue(String example) {
		String[] numbersValue = example.split("[-\\+\\*\\/]");
		setValueValidator(false);
		for (int i = 0; i < numbersValue.length; ++i) {
			if (Double.parseDouble(numbersValue[i]) > Integer.MAX_VALUE ||
				Double.parseDouble(numbersValue[i]) < Integer.MIN_VALUE) {
				return getValueValidator();
			}
		}
		setValueValidator(true);
		return getValueValidator();
	}
	
	/**
	 * Getter-method, return field, indicating division by zero 
	 * @return _division0
	 */
	public boolean getDivision0() {
		return _division0;
	}
	
	private void setDivision0(boolean division0) {
		_division0 = division0;
	}
	
	/**
	 * Getter-method, return field, indicating
	 * minimum and maximum use numeric operands
	 * @return _valueValidator
	 */
	public boolean getValueValidator() {
		return _valueValidator;
	}
	
	private void setValueValidator(boolean valueValidator) {
		_valueValidator = valueValidator;
	}
	
	/**
	 * Getter-method, return field, indicating
	 * user's input String-arithmetic expression 
	 * for compliance with the rules
	 * @return _formatValidator
	 */
	public boolean getFormatValidator() {
		return _formatValidator;
	}
	
	private void setFormatValidator(boolean formatValidator) {
		_formatValidator = formatValidator;
	}

	/**
	 * Getter-method, return field, indicating the status of the other three fields
	 * @return _allValidator
	 */
	public static boolean getAllValidator() {
		return _allValidator;
	}

	/**
	 * Setter-method, set field, indicating the status of the other three fields 
	 * @param set _allValidator
	 */
	public static void setAllValidator(boolean allValidator) {
		_allValidator = allValidator;
	}
}
