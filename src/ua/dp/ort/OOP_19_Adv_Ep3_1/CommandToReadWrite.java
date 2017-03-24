package ua.dp.ort.OOP_19_Adv_Ep3_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Class CommandToReadWrite is run some methods of class ReadWriteFileCalculator
 * This class catch FileNotFoundException and IOException
 * @author Kalyuzhny
 *
 */
public class CommandToReadWrite {
	private ReadWriteFileCalculator _readWrite;
	
	public CommandToReadWrite(int numberTread) 
			throws FileNotFoundException, IOException {
		setReadWrite(new ReadWriteFileCalculator(numberTread));
	}
	
	public void startReadWrite() {
			try {
				getReadWrite().getValueStringFile();
				List<Thread> threads = getReadWrite().separateOnThreads();
				getReadWrite().startThreads(threads);
				getReadWrite().writeOutFile();
			} catch (FileNotFoundException e) {
				System.out.println("Нет файла на чтение");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Ошибка чтения/записи файла");
				e.printStackTrace();
			} 
	}
	
	/**
	 * Getter-method return object of class ReadWriteFileCalculator 
	 * for run some command
	 * @return readWrite
	 */
	public ReadWriteFileCalculator getReadWrite() {
		return _readWrite;
	}
	
	private void setReadWrite(ReadWriteFileCalculator readWrite) {
		_readWrite = readWrite;
	}
	
}
