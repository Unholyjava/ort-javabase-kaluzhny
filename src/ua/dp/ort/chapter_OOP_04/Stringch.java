package ua.dp.ort.chapter_OOP_04;

public class Stringch {
	private Character[] _simbol; 
	private int _length;
	private final static int DEFAULT_LENGTH = 30;
		
	/**
	 * Создает пустую строку с длиной по умолчанию
	 * 
	 */
	public Stringch() {
		_simbol = new Character[DEFAULT_LENGTH];
		_length = DEFAULT_LENGTH;
	}
	
	/**
	 * Принимает массив char'ов, который фактически является 
	 * внутренним форматом класса Stringch  
	 * @param simbol - массив char'ов
	 */
	public Stringch(Character[] simbol) {
		_simbol = simbol;
		_length = simbol.length;
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
	public void changeStringch(char simbol, int index) {
		for (int i = 0; i < this._length; ++i) {
			if (index >= this._length) {
				System.err.println("Неверный индекс символа для замены");
				return;
			}
			if (i == index) {
				_simbol[i] = simbol;
			}
			_simbol[i] = this._simbol[i];
		}
	}
	
	/**
	 * Удаляет элементы с конца строки 
	 * @param array - исходная строка
	 * @param numberSymbol - количество удаляемых элементов
	 */
	public void deleteStringchEnd(int numberSymbol) {
		if (numberSymbol >= this._length) {
			System.err.println("Неверное число удаляемых элементов");
			_simbol = null;
			_length = 0;
		} else {
			_length = this._length - numberSymbol;
			for (int i = 0; i < _length; ++i) {
				_simbol[i] = this._simbol[i]; 
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
