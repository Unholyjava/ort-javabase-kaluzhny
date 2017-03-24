package ua.dp.ort.OOP_19_Adv_Ep3_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class SaveFileResult write array of string result of arithmetic operations
 * in file
 * @author Kalyuzhny
 *
 */
public class SaveFileResult {
	public void saveFile(String[] resultCalculator) throws IOException {
		File fileOutResult = new File
		("src/ua/dp/ort/OOP_19_Adv_Ep3_1/expressionsFileResult.txt");
		FileWriter fileWriter = new FileWriter(fileOutResult);
		for (int i = 0; i < resultCalculator.length; ++i) {
			fileWriter.write(resultCalculator[i] + "\n");
		}
		fileWriter.close();
	}
}
