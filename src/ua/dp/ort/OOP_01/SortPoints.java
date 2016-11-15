package ua.dp.ort.OOP_01;

import java.util.Scanner;

public class SortPoints {
	public static void main(String[] args) {
		System.out.print("Введите количество точек на плоскости: ");
		Scanner s = new Scanner(System.in);
		int numberPoint = s.nextInt();
		PointSquare[] arrayPoint = generatePoint(numberPoint);
		sortPoint(arrayPoint);
		printSortPoint(arrayPoint);
		
		
		s.close();
	}

	private static void printSortPoint(PointSquare[] arrayPoint) {
		for (int i = 0; i < arrayPoint.length; ++i) {
			StringBuilder sb = new StringBuilder();
			sb.append("Точка " )
			.append(arrayPoint[i].getName())
			.append(", x = ")
			.append(arrayPoint[i].getAbscissa())
			.append(", y = ")
			.append(arrayPoint[i].getOrdinata());
			System.out.printf("%d. %s%n", i + 1, sb.toString());
		}
		
	}

	private static void sortPoint(PointSquare[] arrayPoint) {
		for (int i = arrayPoint.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (Math.pow(arrayPoint[j].getAbscissa(), 2)
						+ Math.pow(arrayPoint[j].getOrdinata(), 2)
						> Math.pow(arrayPoint[j+1].getAbscissa(), 2)
						+ Math.pow(arrayPoint[j+1].getOrdinata(), 2)) {
					PointSquare temp = arrayPoint[j];
					arrayPoint[j] = arrayPoint[j+1];
					arrayPoint[j+1] = temp;
				}
			}
		}
		
	}

	private static PointSquare[] generatePoint(int numberPoint) {
		PointSquare[] arrayPoint = 
				new PointSquare[numberPoint];
		for (int i = 0; i < arrayPoint.length; ++i) {
			int sign = 1;
			if (Math.random() > 0.5) {
				sign = 1;
			} else {
				sign = -1;
			}
			arrayPoint[i] = new PointSquare("Point-" + (i + 1), 
					(int)(Math.random() * 100) * sign, 
					(int)(Math.random() * 100) * sign);
		}
		return arrayPoint;
	}
}
