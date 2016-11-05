package ua.dp.ort.chapter_11;

import java.util.Arrays;

public class Z11_142 {
	public static void main(String[] args) {
		System.out.println("Задание № 142");
		float min = 0;
		int minNumber = 0;
		final int numberSpotsmen = 23;
		final int bestSportsmen = 4;
		float[] result = new float[numberSpotsmen];			
		float[] copyResult = new float[numberSpotsmen];		
		int[] minResult = new int[bestSportsmen];			
		
		//исходный массив
		for (int i = 0; i < result.length; i++) {
			result[i] = (float)((Math.random() * 5) + 10);
			copyResult[i] = result[i];
		}
		System.out.println("Результаты соревнований " + numberSpotsmen + " спортсменов:\n" 
		+ Arrays.toString(result));
		
		//массив с номерами лучших спортсменов
		for (int i = 0; i < minResult.length; i++) {
			for (int j = 0; j < copyResult.length - 1; j++) {
				if (j > 0 && copyResult[j] <= min && copyResult[j] != 0) {
					min = copyResult[j];		
					minNumber = j;
				} else if (j == 0) {
					min = copyResult[0];
					minNumber = 0;
				}
			}
			minResult[i] = minNumber;
			
			//обнуление найденных минимумов в копии исходного массива
			copyResult[minNumber] = 0;		 
		}									
		System.out.println("Лучшая четверка:");
		System.out.printf((1 + minResult[0]) + "-й спортсмен с результатом %.2f"
				+ "\n" + (1 + minResult[1]) + "-й спортсмен с результатом %.2f"
				+ "\n" + (1 + minResult[2]) + "-й спортсмен с результатом %.2f"
				+ "\n" + (1 + minResult[3]) + "-й спортсмен с результатом %.2f", 
				result[minResult[0]], result[minResult[1]], 
				result[minResult[2]], result[minResult[3]]);
	}
}
