package ua.dp.ort.chapter_09_157;

import java.util.Objects;
import java.util.Scanner;

public class Z09_157 {
	public static void main(String[] args) {
		System.out.print("Задание № 9.157\n"
				+ "Введите два слова:\n"
				+ "1-ое: ");
		
		//Ввод и преобразование в нижний регистр двух слов
		Scanner s = new Scanner(System.in);
		String word1 = s.next();
		word1 = word1.toLowerCase();
		System.out.print("2-е: ");
		String word2 = s.next();
		word2 = word2.toLowerCase();
		
		//замена повторяющихся символов в первом слове на "-1"
		int[] doubleWord = changeDoubleSymbol(word1);
		
		System.out.println("Содержится ли каждая буква первого слова "
				+ "во втором слове?");
		
		//собственно, проверка основного условия задачи
		doubleTrueFalse(word1, word2, doubleWord);
		s.close();
	}

	private static int[] changeDoubleSymbol(String word1) {
		int[] doubleWord = new int[word1.length()];
		for (int i = 0; i < word1.length(); ++i) {
			for (int j = 1 + i; j < word1.length(); ++j) {
				if (Objects.equals(word1.substring(i, i + 1), word1.substring(j, j + 1))) {
					doubleWord[j] = -1;
				}
			}
		}
		return doubleWord;
	}

	private static void doubleTrueFalse(String word1, String word2, int[] doubleWord) {
		boolean temp = false;
		for (int i = 0; i < word1.length(); ++i) {
			for (int j = 0; j < word2.length(); ++j) {
				if ((Objects.equals(word1.substring(i, i + 1), word2.substring(j, j + 1)) 
						&& doubleWord[i] != -1)) {
					temp = true;
				} 
			}
			if (temp) {
				System.out.print("да ");
			}	else if (doubleWord[i] != -1){
					System.out.print("нет ");
			}
			temp = false;
		}
	}
}
