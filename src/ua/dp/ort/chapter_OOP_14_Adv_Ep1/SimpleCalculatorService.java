package ua.dp.ort.chapter_OOP_14_Adv_Ep1;

import java.util.LinkedList;

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

	
	
	public SimpleCalculatorService() {
	}
	
	/**
	 * Constructor with parameters - user's String arithmetic expression
	 * @param example
	 */
	public SimpleCalculatorService(String example) {
	}
	
	@Override
	/**
	 * This method splits user's String arithmetic expression to operands and operators,
	 * runs arithmetic method, which calculate expression,
	 * return result.
	 */
	public double evaluate(String example) {
		String[] numbers = example.split("[-\\+\\*\\/]");
		String[] operators = example.split("\\d(\\.\\d{0,3})?");
		
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
	
	private void MathOperationDo(LinkedList<Double> bufferNumbers, String oper) {
		double operandOne = bufferNumbers.removeLast();
        double operandTwo = bufferNumbers.removeLast();
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
                System.err.println("Неведомая ошибка");
        }
    }
	
	/**
	 * This method calculates arithmetic expression  
	 * in accordance with the priorities of operators
	 * @param numbers - numeric's array 
	 * @param operators - operator's array
	 * @return
	 */
	public double stringToResult(String[] numbers, String[] operators) {
		LinkedList<Double> numbersList = new LinkedList<>();
        LinkedList<String> operatorsList = new LinkedList<>();
        
        for(int i = 0; i < numbers.length; i++) {
        	while(!operatorsList.isEmpty() && 
                priorityOperations(operatorsList.getLast()) >= priorityOperations(operators[i])) {
                     MathOperationDo(numbersList, operatorsList.removeLast());
            }
            if (i != 0) {
            	operatorsList.add(operators[i]);
            }
            numbersList.add(Double.parseDouble(numbers[i]));
        }
        while(!operatorsList.isEmpty()) {
        	MathOperationDo(numbersList, operatorsList.removeLast());
        }
        return numbersList.get(0);
    }
				
}
