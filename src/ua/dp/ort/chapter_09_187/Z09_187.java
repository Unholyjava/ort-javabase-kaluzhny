package ua.dp.ort.chapter_09_187;

import java.util.Scanner;

public class Z09_187 {
	public static void main(String[] args) {
		System.out.print("Задание № 9.187\n"
				+ "Введите натуральное число от 0 до 1000: ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		//проверка введенного числа
		if (number > 1000 || number < 1) {
			System.out.println("Вы ввели неверное число");
			s.close();
		} else if (number == 1000) {
			System.out.println(number + " - тысяча");
			s.close();
		} else {
			
			//разрядность введенного числа
			//разрядность десятичной системы
			final int bitNumber = 3;
			final int numeral = 10;
			
			//создание и заполнение массива с названиями чисел 
			String[][] thousand = createArrayWords(bitNumber, numeral);
			DataArrayWords(bitNumber, numeral, thousand);
					
			//"склеивание" частей составного числа и его вывод
			System.out.println(number + " - " 
					+ createNumberWord(number, bitNumber, thousand));
			
			s.close();
		}
	}


	private static String createNumberWord(int number, final int bitNumber, String[][] thousand) {
		String numberStr = String.valueOf(number); 
		String numberWord = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numberStr.length(); ++i) {
			int charNum = Character.digit(numberStr.charAt(i), 10);
			if (charNum == 1 && i == numberStr.length() - 2) {
				sb.append(thousand[0][Character.digit
					         (numberStr.charAt(i + 1), 10)]);
				break;
			}
			if (charNum != 0) {
				sb.append(thousand[numberStr.length() - i][charNum]).append(" ");
			}
		}
		numberWord = sb.toString();
		return numberWord;
	}
	
	
	private static void DataArrayWords(int bitNumber, int numeral, String[][] thousand) {
		String[] units = new String[]{"", "один", "два", "три", "четыре", "пять", 
				"шесть", "семь", "восемь", "девять"};
		String[] subDecs = new String[]{"", "одиннадцать", "двенадцать", "тринадцать", 
				"четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", 
				"восемнадцать", "девятнадцать"};
		String[] decs = new String[]{"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", 
				"шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
		String[] hundreds = new String[] {"", "сто", "двести", "триста", "четыреста", "пятьсот", 
				"шестьсот", "семьсот", "восемьсот", "девятьсот"};
		for (int i = 0; i <= bitNumber; ++i) {
			for (int j = 0; j < numeral; ++j) {
				if (i == 0) {
					thousand[i][j] = subDecs[j];
				} else if (i == 1) {
					thousand[i][j] = units[j];
				} else if (i == 2) {
					thousand[i][j] = decs[j];
				} else {
					thousand[i][j] = hundreds[j];
				}
			}
							
		}
	}


	private static String[][] createArrayWords(int bitnumber, int numeral) {
		String[][] arrayWords = new String[bitnumber + 1][numeral];
		for (int i = 0; i <= bitnumber; ++i) {
			arrayWords[i] = new String[numeral]; 
		}
		return arrayWords;
	}
}
