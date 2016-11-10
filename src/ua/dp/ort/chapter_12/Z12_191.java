package ua.dp.ort.chapter_12;

import java.util.Scanner;

public class Z12_191 {
	public static void main(String[] args) {
		System.out.print("Задание № 12.191\nВведите сторону квадратной таблицы: ");
		Scanner s = new Scanner(System.in);
		int side = s.nextInt();
		int[][] squareArray = createTable(side);
		createDataSquare (squareArray);
		printDataSquare (squareArray);
		final int upDown = 1;
		final int leftRight = 2;
		final int leftUp = 3;
		final int rightDown = 4;
		final int upRight = 5;
		final int downLeft = 6;
		System.out.println("\n" 
				+ upDown + " - таблица с зеркальными верхней и нижней четвертями;"
				+ "\n" + leftRight + " - таблица с зеркальными правой и левой четвертями;"
				+ "\n" + leftUp + " - таблица с зеркальными левой и верхней четвертями;"
				+ "\n" + rightDown + " - таблица с зеркальными правой и нижней четвертями;"
				+ "\n" + upRight + " - таблица с зеркальными верхней и правой четвертями;"
				+ "\n" + downLeft + " - таблица с зеркальными левой и нижней четвертями;");
		System.out.print("Введите тип замены образованных диагоналями четвертей таблицы: ");
		int choice = s.nextInt();
		System.out.println();
		switch(choice) {
		case upDown:
			printDataSquare(sortUpDown(squareArray));
			break;
		case leftRight:
			printDataSquare(sortLeftRight(squareArray));
			break;
		case leftUp:
			printDataSquare(sortLeftUp(squareArray));
			break;
		case rightDown:
			printDataSquare(sortRightDown(squareArray));
			break;
		case upRight:
			printDataSquare(sortUpRight(squareArray));
			break;
		case downLeft:
			printDataSquare(sortDownLeft(squareArray));
			break;
		default:
			System.out.println("Вы ввели неверное число");
			s.close();
			return;
		}
		
		s.close();
	}

	
	
	private static int[][] sortDownLeft(int[][] squareRange) {
		int[][] squareSort = copySquare(squareRange);
		for (int i = 1; i < squareRange.length; ++i) {
			for (int j = 0; j < squareRange[0].length - 1; ++j) {
				if (i > j && i + j != squareRange.length - 1) {
					squareSort[i][j] = 
						squareRange[squareRange.length - 1 - j][squareRange.length - 1 - i]; 
				}
			}
		}
		return squareSort;
	}



	private static int[][] sortUpRight(int[][] squareRange) {
		int[][] squareSort = copySquare(squareRange);
		for (int i = 0; i < squareRange.length - 1; ++i) {
			for (int j = 1; j < squareRange[0].length; ++j) {
				if (i < j && i + j != squareRange.length - 1) {
					squareSort[i][j] = 
						squareRange[squareRange.length - 1 - j][squareRange.length - 1 - i]; 
				}
			}
		}
		return squareSort;
	}



	private static int[][] sortRightDown(int[][] squareRange) {
		int[][] squareSort = copySquare(squareRange);
		for (int i = 1; i < squareRange.length; ++i) {
			for (int j = 1; j < squareRange[0].length; ++j) {
				if (i + j >= squareRange.length - 1 && i + j != squareRange.length - 1) {
					squareSort[i][j] = squareRange[j][i]; 
				}
			}
		}
		return squareSort;
	}



	private static int[][] sortLeftUp(int[][] squareRange) {
		int[][] squareSort = copySquare(squareRange);
		for (int i = 0; i < squareRange.length - 1; ++i) {
			for (int j = 0; j < squareRange[0].length - 1; ++j) {
				if (i + j >= squareRange.length && i + j != squareRange.length - 1) {
					squareSort[i][j] = squareRange[j][i]; 
				}
			}
		}
		return squareSort;
	}



	private static int[][] sortLeftRight(int[][] squareRange) {
		int[][] squareSort = copySquare(squareRange);
		for (int i = 1; i < squareRange.length - 1; ++i) {
			for (int j = 0; j < squareRange[0].length; ++j) {
				if (j < (int)(squareRange.length / 2) && i > j && 
						j + i < squareRange.length - 1) {
					squareSort[i][j] = squareRange[i][squareRange[0].length - 1 - j]; 
				} else if (j > (int)(squareRange.length / 2) && i < j &&
						j + i >= squareRange.length) {
					squareSort[i][j] = squareRange[i][squareRange[0].length - 1 - j]; 
				}
			}
		}
		return squareSort;
	}



	private static int[][] copySquare(int[][] squareRange) {
		int[][] copy = createTable(squareRange.length);
		for (int i = 0; i < squareRange.length; ++i) {
			for (int j = 0; j < squareRange[0].length; ++j) {
				copy[i][j] = squareRange[i][j];
			}
		}
		return copy;
	}



	private static int[][] sortUpDown(int[][] squareRange) {
		int[][] squareSort = copySquare(squareRange);
		for (int i = 0; i < squareRange.length; ++i) {
			for (int j = 1; j < squareRange[0].length - 1; ++j) {
				if (i < (int)(squareRange.length / 2) && j > i && 
						j + i < squareRange.length - 1) {
					squareSort[i][j] = squareRange[squareRange.length - 1 - i][j]; 
				} else if (i > (int)(squareRange.length / 2) && j < i &&
						j + i >= squareRange.length) {
					squareSort[i][j] = squareRange[squareRange.length - 1 - i][j]; 
				}
			}
		}
		return squareSort;
	}

	private static void printDataSquare(int[][] squareRange) {
		for (int i = 0; i < squareRange.length; ++i) {
			for (int j = 0; j < squareRange[0].length; ++j) {
				System.out.printf("%-2d", squareRange[i][j]);
			}
			System.out.println("");
		}
		
	}

	private static void createDataSquare(int[][] squareRange) {
		for (int i = 0; i < squareRange.length; ++i) {
			for (int j = 0; j < squareRange[i].length; ++j) {
				squareRange[i][j] = (int)(Math.random() * 10);
			}
		}
	}

	private static int[][] createTable(int sideOfSquare) {
		int[][] square = new int[sideOfSquare][];
		for (int i = 0; i < square.length; ++i) {
			square[i] = new int[sideOfSquare]; 
		}
		return square;
	}
}
