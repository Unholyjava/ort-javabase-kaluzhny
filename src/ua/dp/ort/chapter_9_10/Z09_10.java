package ua.dp.ort.chapter_9_10;

import java.util.Arrays;
import java.util.Scanner;

public class Z09_10 {
	public static void main(String[] args) {
		System.out.print("Задание № 9.10\n"
				+ "Введите количество городов: ");
		Scanner s = new Scanner(System.in);
		int numberCity = s.nextInt();
		String[] arrayCity = new String[numberCity];
		int[] lenghtCity = new int[numberCity];
		System.out.println("Введите названия городов:");
		
		//формирование массивов городов и их длин (количество букв в слове)
		for (int i = 0; i < arrayCity.length; ++i) {
			System.out.print((i + 1) + "-й: ");
			String city = s.next();
			arrayCity[i] = city;
			lenghtCity[i] = city.length();
		}
		
		//объявление, формирование и вывод массивов 
		//с максимальной/минимальной длиной слова 
		int[] maxCityArray = new int[lenghtCity.length];
		int[] minCityArray = new int[lenghtCity.length];
		maxCity(maxCityArray, lenghtCity);
		minCity(minCityArray, lenghtCity);
		if (Arrays.equals(maxCityArray, minCityArray)) {
			System.out.println("Все слова-города одинаковой длины");
		} else {
				printMaxCity(maxCityArray, arrayCity);
				printMinCity(minCityArray, arrayCity);
		}
		s.close();
	}

	

public static void printMinCity(int[] minCityArray, String[] arrayCity) {
	System.out.println("Самые короткие названия:");
		for (int i = 0; i < minCityArray.length; ++i) {
			if (minCityArray[i] != 0) {
				System.out.println((i + 1) + "-е: " + arrayCity[i]);
			}
		}
	}



	private static void printMaxCity(int[] maxCityArray, String[] arrayCity) {
		System.out.println("Самые длинные названия:");
		for (int i = 0; i < maxCityArray.length; ++i) {
			if (maxCityArray[i] != 0) {
				System.out.println((i + 1) + "-е: " + arrayCity[i]);
			}
		}
	}



	public static void minCity(int[] minCityArray, int[] lenghtCity) {
		int min = lenghtCity[0];
		for (int i = 0; i < lenghtCity.length; ++i) {
			if (lenghtCity[i] < min) {
				min = lenghtCity[i];
			}
		}
		for (int i = 0; i < lenghtCity.length; ++i) {
			if (lenghtCity[i] == min) {
				minCityArray[i] = lenghtCity[i];
			}
		}
	}

	public static void maxCity(int[] maxCityArray, int[] lenghtCity) {
		int max = 0;
		for (int i = 0; i < lenghtCity.length; ++i) {
			if (lenghtCity[i] > max) {
				max = lenghtCity[i];
			}
		}
		for (int i = 0; i < lenghtCity.length; ++i) {
			if (lenghtCity[i] == max) {
				maxCityArray[i] = lenghtCity[i];
			}
		}
	}
}
