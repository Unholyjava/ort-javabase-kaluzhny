package ua.dp.ort.OOP_19_Adv_Ep3_1;

import java.text.DecimalFormat;

/**
 * Class print to console result of example entered or
 * return result of arithmetic operations for write in file  
 * @author Kalyuzhny
 *
 */
public class ResultOut {
	
	private static final String FORMAT_OUT = "#0.000";
	
	public void printConsole(String example, double result) {
		System.out.println("Выражение " + example + " = " + result);
	}
	
	public String stringResultFile(String example, double result) {
		String formatResult = new DecimalFormat(FORMAT_OUT).format(result);
		String currentStringResult = example + " = " + formatResult;
		return currentStringResult;
	}
}

