package ua.dp.ort.OOP_19_Adv_Ep3_1;

import java.util.LinkedList;
import java.util.List;

/**
 * Class SimpleCalculatorService is converts user's String arithmetic expression
 * to double-operands and operators "-", "+", "*", "/".
 * Double-operands must be in corridor between Integer.MIN_VALUE and Integer.MAX_VALUE, 
 * and fractional part must have up to three numbers after the decimal point.
 * Operands must be non-negative. If you want use negative operands, 
 * use positive operands multiplied by -1.
 * Operands and operators must be placed one after another 
 * in succession without any spaces. Division by zero should not be.  
 * @author Kalyuzhny
 *
 */
public class SimpleCalculatorService implements CalculatorService{

	@Override
	/**
	 * This method splits user's String arithmetic expression to operands and operators,
	 * runs arithmetic method, which calculate expression,
	 * return result.
	 */
	public double evaluate(String example) {
		String[] numbers = example.split("[-\\+\\*\\/]");
		String[] operators = example.split("\\d{1,}(\\.\\d{0,3})?");
		
		Double result = stringToResult(numbers, operators);
		return result;
	}
	
	private int priorityOperations(String oper) {
        if(oper.equals("*") || oper.equals("/")) {
            return 1;
        } else {
        	return 0;
        }
    }
	
	private void mathOperationDo(List<Double> bufferNumbers, String oper) {
		double operandOne = ((LinkedList<Double>) bufferNumbers).removeLast();
        double operandTwo = ((LinkedList<Double>) bufferNumbers).removeLast();
        switch(oper) {
            case "+":
                bufferNumbers.add(operandTwo + operandOne);
                break;
            case "-":
                bufferNumbers.add(operandTwo - operandOne);
                break;
            case "*":
                bufferNumbers.add(operandTwo * operandOne);
                break;
            case "/":
                bufferNumbers.add(operandTwo / operandOne);
                break;
            default:
            	try {
    				throw new CalculatorException
                    	("В арифметическом выражении имеются недопустимые символы операций,"
                    			+ "Для разработчиков: регулярные выражения не корректны");
    			} catch (CalculatorException e) {
    				e.printStackTrace();
    			}
        }
    }
	
	/**
	 * This method calculates arithmetic expression  
	 * in accordance with the priorities of operators
	 * @param numbers - numeric's array 
	 * @param operators - operator's array
	 * @return
	 */
	private double stringToResult(String[] numbers, String[] operators) {
		LinkedList<Double> numbersList = new LinkedList<>();
        LinkedList<String> operatorsList = new LinkedList<>();
        
        for(int i = 0; i < numbers.length; i++) {
        	while(!operatorsList.isEmpty() && 
                priorityOperations(operatorsList.getLast()) >= priorityOperations(operators[i])) {
                     mathOperationDo(numbersList, operatorsList.removeLast());
            }
            if (i != 0) {
            	operatorsList.add(operators[i]);
            }
            numbersList.add(Double.parseDouble(numbers[i]));
        }
        while(!operatorsList.isEmpty()) {
        	mathOperationDo(numbersList, operatorsList.removeLast());
        }
        return numbersList.get(0);
    }
				
}
