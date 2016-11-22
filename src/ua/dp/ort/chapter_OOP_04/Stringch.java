package ua.dp.ort.chapter_OOP_04;

public class Stringch {
	private Character[] _simbol; 
	private int _length;
	private final static int defaultLength = 30;
		
	/**
	 * Создает пустую строку с длиной по умолчанию
	 * 
	 */
	public Stringch() {
		setDefaultArray(defaultLength);
	}
	
	/**
	 * Создает строку на заданное количество элементов со случайными значениями
	 * @param length - количество элементов
	 */
	public Stringch(int length) {
		setLengthArray(length);
	}
	
	public void setLengthArray(int length) {
		_simbol = new Character[length];
		_length = length;
		for (int i = 0; i < length; ++i) {
			_simbol[i] = (char)((int)(Math.random() * 127) + 21);
		}
		
	}

	/**
	 * Принимает со стороны "стринговую" строку и преобразует во внутренний формат класса
	 * @param wordInput - "стринговая" строка
	 */
	public Stringch(String wordInput) {
		stringToChar(wordInput);
	}
	
	public void stringToChar(String wordInput) {
		_simbol = new Character[wordInput.length()];
		for (int i = 0; i < wordInput.length(); ++i) {
			_simbol[i] = wordInput.charAt(i);
		}
		_length = wordInput.length();
	}
	
	public void setDefaultArray(int defaultLength) {
		_simbol = new Character[defaultLength];
		_length = defaultLength;
	}
	
	/**
	 * Соединяет две строки
	 * @param array1 - первый объект Stringch
	 * @param array2 - второй объект Stringch
	 */
	public void sumStringht(Stringch array1, Stringch array2) {
		_length = array1._length + array2._length;
		_simbol = new Character[_length];
		for (int i = 0; i < _length; ++i) {
			if (i < array1._length) {
				_simbol[i] = array1._simbol[i];
			} else {
				_simbol[i] = array2._simbol[i - array1._length];
			}
		}
	}
	
	/**
	 * Замена одного символа в строке
	 * @param array - исходная строка
	 * @param simbol - заменяемый символ
	 * @param index - индекс заменяемого символа
	 */
	public void changeStringch(Stringch array, char simbol, int index) {
		_length = array._length;
		for (int i = 0; i < array._length; ++i) {
			if (index >= array._length) {
				System.err.println("Неверный индекс символа для замены");
				return;
			}
			if (i == index) {
				_simbol[i] = simbol;
			}
			_simbol[i] = array._simbol[i];
		}
	}
	
	/**
	 * Удаляет элементы с конца строки 
	 * @param array - исходная строка
	 * @param numberSymbol - количество удаляемых элементов
	 */
	public void deleteStringchEnd(Stringch array, int numberSymbol) {
		if (numberSymbol >= array._length) {
			System.err.println("Неверное число удаляемых элементов");
			_simbol = null;
			_length = 0;
		} else {
			_length = array._length - numberSymbol;
			for (int i = 0; i < _length; ++i) {
				_simbol[i] = array._simbol[i]; 
			}
		}
	}

	/**
	 * Возвращает длину строки
	 * @return
	 */
	public int getlength() {
		return _length;
	}
	
	/**
	 * Возвращает строку (массив char-ов)
	 * @return
	 */
	public String getsimbol() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < _length; ++i) {
			sb.append(_simbol[i]); 
		}
		return sb.toString();
	}
}
