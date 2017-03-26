package ua.dp.ort.OOP_19_Adv_Ep3_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class ReadWriteFileCalculator have some methods which are:
 * - generate threads for read- and arithmetic operations
 * - run write-operation result array data to file
 * - start threads and calculate time for read- and arithmetic operations
 * - read file with input data and save this data in ArrayList
 * @author Kalyuzhny
 *
 */
public class ReadWriteFileCalculator {
	private int _numberTread;
	private List<String> _arrayForCalculator;
	private int _lineNumber;
	
	
	/**
	 * constructor wish parameter (set as a constant in class FileUserinterface)
	 * @param numberTread - number of threads for read file 
	 */
	public ReadWriteFileCalculator(int numberTread) { 
		setNumberTread(numberTread);
	}

	/**
	 * This method run write-operation result array data to file
	 * @throws IOException
	 */
	void writeOutFile() throws IOException {
		SaveFileResult fileResult = new SaveFileResult();
		fileResult.saveFile(ThreadForCalculate.getDataOut());
	}
	
	/**
	 * Method start threads and calculate time 
	 * for read- and arithmetic operations
	 * @param threads - threads 
	 * (number of threads is set in method separateOnThreads)
	 */
	void startThreads(List<Thread> threads) {
		System.out.println("Начало выполнения задачи");
		long start = System.currentTimeMillis();
		threads.forEach(Thread::start);
		threads.forEach(t -> {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		System.out.println("Время выполнения задачи: " + 
			(System.currentTimeMillis() - start));
		
	}

	/**
	 * Method is generate threads for read- and arithmetic operations
	 * and initialize array with output data  
	 * @return threads
	 */
	List<Thread> separateOnThreads() {
		List<Thread> threads = new ArrayList<>();
		String[] dataOut = new String[getArrayForCalculator().size()];
		for (int i = 0; i < _numberTread; ++i) {
			threads.add(new Thread(new ThreadForCalculate(
				(_lineNumber / _numberTread * i), 
				(_lineNumber / _numberTread * (i+1)), getArrayForCalculator(), 
				dataOut, "calculator_" + i)));
		}
		return threads;
	}

	/**
	 * Method read file with input data and save this data in ArrayList
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	void getValueStringFile() 
			throws FileNotFoundException, IOException {
		File fileForCalculator = null;
		try {
			fileForCalculator = new File
					(ReadWriteFileCalculator.class.getResource("expressionsFile.txt").toURI());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		FileReader fileReader = new FileReader(fileForCalculator);
		LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
		List<String> stringsOfFile = new ArrayList<>();
		String currentLine;
		while ((currentLine = lineNumberReader.readLine()) != null){
			stringsOfFile.add(currentLine);
		}
		lineNumberReader.close();
		setArrayForCalculator(stringsOfFile);
		_lineNumber = stringsOfFile.size();
	}
	
	private void setNumberTread(int numberTread) {
		_numberTread = numberTread;
	}
			
	/**
	 * Getter-method for List of input data type String
	 * @return arrayForCalculator
	 */
	public List<String> getArrayForCalculator() {
		return _arrayForCalculator;
	}

	private void setArrayForCalculator(List<String> arrayForCalculator) {
		_arrayForCalculator = arrayForCalculator;
	}
}


/**
 * Class ThreadForCalculate is use one ore more threads for
 * read String data from ArrayList, run calculator mechanism and
 * save result of arithmetic operations in array
 * @author Kalyuzhny
 *
 */
class ThreadForCalculate implements Runnable {
	private int _from;
	private int _to;
	private List<String> _dataIn;
	private static String[] _dataOut;
	
	/**
	 * constructor wish parameters
	 * @param from - number of start array element for current thread
	 * @param to - number of end array element for current thread
	 * @param dataIn - List of String input data
	 * @param name - name of current thread
	 */
	ThreadForCalculate(int from, int to, 
			List<String> dataIn, String[] dataOut, String name) {
		super();
		setFrom(from);
		setTo(to);
		setDataIn(dataIn);
		setDataOut(dataOut);
	}
		
	@Override
	public void run() {
		try {
			ResultOut resultOut = new ResultOut();
			String stringCurrent;
			for (int i = getFrom(); i < getTo(); ++i) {
				stringCurrent = getDataIn().get(i);
				FileUserInterface.calculateCurrentString(stringCurrent);
				String stringResult = resultOut
						  .stringResultFile(FileUserInterface
						  .getExample(), FileUserInterface.getResult());
				getDataOut()[i] = stringResult;
			}
		} catch (CalculatorException e) {
			e.printStackTrace();
		} 
	}

	
	private int getFrom() {
		return _from;
	}

	private void setFrom(int from) {
		_from = from;
	}

	private int getTo() {
		return _to;
	}

	private void setTo(int to) {
		_to = to;
	}

	/**
	 * Getter-method for return List of String input data
	 * @return the data
	 */
	public List<String> getDataIn() {
		return _dataIn;
	}

	private void setDataIn(List<String> data) {
		_dataIn = data;
	}

	/**
	 * Getter-method for return array of String output data
	 * @return _dataOut
	 */
	public static String[] getDataOut() {
		return _dataOut;
	}

	private static void setDataOut(String[] _dataOut) {
		ThreadForCalculate._dataOut = _dataOut;
	}

	
}