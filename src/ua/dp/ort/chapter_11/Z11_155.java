package ua.dp.ort.chapter_11;

import java.util.Arrays;
import java.util.Scanner;

public class Z11_155 {
	public static void main(String[] args) {
		System.out.println("Задание № 11.115");
		final int pupilAll = 25;
		int[] pupil = new int[pupilAll];
		pupil[0] = 170;
		
		//Формирование массива ростов
		for (int i = 1; i < pupil.length; i++) {								
			pupil[i] = (pupil[i-1] - 1);
		}
		System.out.println("Рост" + pupil.length + "учеников в классе по убыванию:\n"
				+ Arrays.toString(pupil));
		System.out.print("Введите 2 номера выбывших учеников:\n1 номер: ");
		Scanner s = new Scanner(System.in);
		int number1 = s.nextInt();
		System.out.print("2 номер: ");
		int number2 = s.nextInt();
		int[] pupilMinus2 = new int[pupilAll - 2];
		
		//Формирование массива ростов оставшихся по выбывшим номерам
		for (int i = 0; i < pupilMinus2.length; i++) {								
			if (i < number1 - 1) {									
				pupilMinus2[i] = pupil[i];							
			}	else if (i >= number1 - 1 && i < number2 - 2) {
					pupilMinus2[i] = pupil[i+1];
			}	else {
				pupilMinus2[i] = pupil[i+2];
			}
		}
		System.out.println("Рост оставшихся " + pupilMinus2.length + " учеников:\n"
				+ Arrays.toString(pupilMinus2));
		System.out.println("Введите рост 2-х выбывших учеников"
				+ " (от 146 см до 170 см с шагом 1 см)");
		System.out.print("Рост 1-го ученика: ");
		int heigt1 = s.nextInt();
		System.out.print("Рост 2-го ученика: ");
		int heigt2 = s.nextInt();
		
		//Формирование массива ростов оставшихся по выбывшим по росту
		for (int i = 0; i < pupilMinus2.length; i++) {									
			if (pupil[i] > heigt1) {									
				pupilMinus2[i] = pupil[i];								
			}	else if (pupil[i] <= heigt1 && pupil[i+1] > heigt2) {
					pupilMinus2[i] = pupil[i+1];
			}	else {
				pupilMinus2[i] = pupil[i+2];
			}
		}
		System.out.println("Рост оставшихся " + pupilMinus2.length + " учеников:\n"
				+ Arrays.toString(pupilMinus2));
		s.close();
				
	}
}
