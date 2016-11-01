package ua.dp.ort.chapter_11;

import java.util.Arrays;

public class Z11_103 {
	public static void main(String[] args) {
		System.out.println("Задание № 11.103");
		final int lenght = 20;
		int[] arraySign = new int[lenght];
		int inversionSign = 0;
		for (int i = 0; i < lenght; i++) {
			int sign = Math.random() > 0.5 ? 1 : -1;  //определение знака элемента
			arraySign[i] = (int)((Math.random() * 100 + 1) * sign);
			if (i > 0 && arraySign[i] * arraySign[i-1] < 0) { //определение кол-ва смены знака
				inversionSign += 1; 
			} 
		}
		System.out.println("В данном массиве:\n" + Arrays.toString(arraySign));
		System.out.println("элементы меняют знак " + inversionSign + " раз.");
		
	}
}
