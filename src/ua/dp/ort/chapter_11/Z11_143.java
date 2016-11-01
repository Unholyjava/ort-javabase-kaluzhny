package ua.dp.ort.chapter_11;

import java.util.Arrays;

public class Z11_143 {
	public static void main(String[] args) {
		System.out.println("Задание № 11.143");
		final int lenght = 20;
		int[] arrayMaxMod = new int[lenght];
		int[] reArrayMaxMod = new int[lenght];
		int maxMod = 0;
		for (int i = 0; i < lenght; i++) {
			int sign = Math.random() > 0.5 ? 1 : -1;  //определение знака элемента
			arrayMaxMod[i] = (int)((Math.random() * 100 + 1) * sign);
			reArrayMaxMod[i] = arrayMaxMod[i];
			if (i > 0 && Math.abs(arrayMaxMod[i]) > maxMod) {  //нахождение макс. элемента
				maxMod = Math.abs(arrayMaxMod[i]); 
			} else if (i == 0){ 
				maxMod = Math.abs(arrayMaxMod[0]);
			}
		}
		for (int i = 0; i < lenght; i++) {
			if (Math.abs(reArrayMaxMod[i]) == maxMod) {
				reArrayMaxMod[i] = -reArrayMaxMod[i];
			}
		}
		System.out.println("В данном массиве:\n" + Arrays.toString(arrayMaxMod));
		System.out.println("изменился знак максимального по модулю элемента:");
		System.out.println(Arrays.toString(reArrayMaxMod));	
	}
}
