package ua.dp.ort.chapter_11;

import java.util.Arrays;

public class Z11_158 {
	public static void main(String[] args) {
		System.out.println("Задание № 11.158");
		final int lenght = 20;
		int[] arrayDoubleElement = new int[lenght];
		int[] arrayDoubleCopy = new int[lenght];
		for (int i = 0; i < arrayDoubleElement.length; i++) {
			arrayDoubleElement[i] = (int)(Math.random() * 100);		//Исходный массив
			arrayDoubleCopy[i] = arrayDoubleElement[i];
		}
		System.out.println("Исходный массив:\n"
				+ Arrays.toString(arrayDoubleElement));
		int equalElement = 0;
		for (int i = 0; i < arrayDoubleCopy.length; i++) {
			for (int j = i + 1; j < arrayDoubleCopy.length; j++) {
				if (arrayDoubleCopy[i] == arrayDoubleCopy[j]) {
					arrayDoubleCopy[j] = 100;						//Замена повторений на "100"
				}													//"100" - заведомо неиспользованное 
			}														//число в массиве
			if (arrayDoubleCopy[i] == 100) {
				equalElement++;
			}
		}
		int[] arrayNotDouble = new int[lenght - equalElement];		//Формирование массива
		int i = 0;													//без повторений
		for (int j = 0 ; j < arrayNotDouble.length; j++) {
			while (arrayDoubleCopy[i] == 100) {
					i++;
			}	
			arrayNotDouble[j] = arrayDoubleCopy[i];	
			i++;
		}
		System.out.println("Массив с удаленными одинаковыми членами:\n" 
				+ Arrays.toString(arrayNotDouble));
	}
}
