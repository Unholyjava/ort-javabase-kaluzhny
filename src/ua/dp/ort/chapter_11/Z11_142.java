package ua.dp.ort.chapter_11;

import java.util.Arrays;

public class Z11_142 {
	public static void main(String[] args) {
		System.out.println("Задание № 142");
		float min = 0;
		int minNumber = 0;
		final int numberSpotsmen = 23;
		float[] result = new float[numberSpotsmen];			//исходный массив
		float[] copyResult = new float[numberSpotsmen];		
		int[] minResult = new int[4];			//массив с номерами лучших спортсменов
		for (int i = 0; i < numberSpotsmen; i++) {
			result[i] = (float)((Math.random() * 5) + 10);
			copyResult[i] = result[i];
		}
		System.out.println("Результаты соревнований " + numberSpotsmen + " спортсменов:\n" 
		+ Arrays.toString(result));
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < numberSpotsmen - 1; j++) {
				if (j > 0 && copyResult[j] <= min && copyResult[j] != 0) {
					min = copyResult[j];		
					minNumber = j;
				} else if (j == 0) {
					min = copyResult[0];
				}
			}
			minResult[i] = minNumber;
			copyResult[minNumber] = 0;		//обнуление найденных минимумов 
		}									//в копии исходного массива
		System.out.println("Лучшая четверка:");
		System.out.printf(minResult[0] + "-й спортсмен с результатом %.2f"
				+ "\n" + minResult[1] + "-й спортсмен с результатом %.2f"
				+ "\n" + minResult[2] + "-й спортсмен с результатом %.2f"
				+ "\n" + minResult[3] + "-й спортсмен с результатом %.2f", 
				result[minResult[0]], result[minResult[1]], 
				result[minResult[2]], result[minResult[3]]);
	}
}
