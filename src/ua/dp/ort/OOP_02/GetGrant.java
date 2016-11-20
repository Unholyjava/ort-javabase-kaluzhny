package ua.dp.ort.OOP_02;

import java.util.Arrays;
import java.util.Scanner;

public class GetGrant {
	public static void main(String[] args) {
		System.out.print("Введите количество групп студентов: ");
		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		int numGroup = scanInt.nextInt();
		System.out.print("Введите количество студентов в группе: ");
		int numStud = scanInt.nextInt();
		
		//инициализация массива студентов по группам
		Student[][] arrayStudent = createArrayStudent(numGroup, numStud);
		
		//заполнение массива данными
		dataArrayStudent(scanStr, arrayStudent);
		
		//проверка массива оценок для каждого студента
		//и определение размера стипендии (свойство "grant")
		createGrant(arrayStudent);
		
		//сортировка студентов по алфавиту фамилий в каждой группе
		sortStudent(arrayStudent);
		
		//вывод студентов, получающих стипендию
		printStudentGrant(arrayStudent);
				
		scanInt.close();
		scanStr.close();
	}

	public static void printStudentGrant(Student[][] arrayStudent) {
		for (int i = 0; i < arrayStudent.length; ++i) {
			System.out.println("В " + (i+1) + "-ой группе начислены стипендии:");
			for (int j = 0; j < arrayStudent[0].length; ++j) {
				if (arrayStudent[i][j].getGrant() > 1) {
					StringBuilder sb = new StringBuilder();
					sb.append(j+1).append(". ")
					.append(arrayStudent[i][j].getSurName())
					.append(" ").append(arrayStudent[i][j].getName())
					.append(" ").append(arrayStudent[i][j].getSecondName())
					.append(" - надбавка к стипендии ")
					.append(arrayStudent[i][j].getGrant())
					.append("%");
					System.out.println(sb.toString());
					System.out.println(Arrays.toString(arrayStudent[i][j].getRating()));
				} else if (arrayStudent[i][j].getGrant() == 1) {
					StringBuilder sb = new StringBuilder();
					sb.append(j+1).append(". ")
					.append(arrayStudent[i][j].getSurName())
					.append(" ").append(arrayStudent[i][j].getName())
					.append(" ").append(arrayStudent[i][j].getSecondName())
					.append(" - стипендия");
					System.out.println(sb.toString());
					System.out.println(Arrays.toString(arrayStudent[i][j].getRating()));
				}
			}
		}
	}

	public static void sortStudent(Student[][] arrayStudent) {
		for (int i = 0; i < arrayStudent.length; ++i) {
			for (int j = arrayStudent[0].length - 1; j > 0; --j) {
				for (int k = 0; k < j; ++k) {
					if (arrayStudent[i][k].getSurName().charAt(0) > 
						arrayStudent[i][k+1].getSurName().charAt(0)) {
						Student temp = arrayStudent[i][k];
						arrayStudent[i][k] = arrayStudent[i][k+1];
						arrayStudent[i][k+1] = temp;
					}
				}
			}
		}
	}

	public static void createGrant(Student[][] arrayStudent) {
		for (int i = 0; i < arrayStudent.length; ++i) {
			for (int j = 0; j < arrayStudent[0].length; ++j) {
				int[] arrayTemp = arrayStudent[i][j].getRating();
				int fiveRate = 0;
				int threeRate = 0;
				int zeroRate = 0;
				for (int k = 0; k < arrayTemp.length; ++k) {
					if (arrayTemp[k] == 5) {
						++fiveRate;
					}
					if (arrayTemp[k] == 3) {
						++threeRate;
					}
					if (arrayTemp[k] == 0) {
						++zeroRate;
					}
				}
				if (fiveRate + zeroRate == arrayTemp.length) {
					arrayStudent[i][j].setGrant(100);
				} else if (fiveRate != 0 && threeRate == 0 && 
						(fiveRate + zeroRate != arrayTemp.length)) {
					arrayStudent[i][j].setGrant(50);
				} else if (fiveRate == 0 && threeRate == 0) {
					arrayStudent[i][j].setGrant(25);
				} else if (threeRate <= 2 && threeRate >=1) {
					arrayStudent[i][j].setGrant(1);
				} else {
					arrayStudent[i][j].setGrant(0);
				}
			}
		}
	}

	public static void dataArrayStudent(Scanner scanStr, Student[][] arrayStudent) {
		for (int i = 0; i < arrayStudent.length; ++i) {
			System.out.println("Введите студентов " + (i + 1) + 
					"-ой группы в следующем порядке: фамилия имя отчество");
			for (int j = 0; j < arrayStudent[0].length; ++j) {
				System.out.print((i+1) + "." + (j+1) + ". Фамилия - ");
				String tempSurName = scanStr.nextLine();
				System.out.print("     Имя - ");
				String tempName = scanStr.nextLine();
				System.out.print("     Отчество - ");
				String tempSecondName = scanStr.nextLine();
				arrayStudent[i][j] = new Student(tempName, tempSecondName, 
						tempSurName, i+1, generatorRating());
			}
		}
	}

	public static Student[][] createArrayStudent(int numGroup, int numStud) {
		Student[][] arrayStudent = new Student[numGroup][];
		for (int i = 0; i < arrayStudent.length; ++i) {
			arrayStudent[i] = new Student[numStud];
		}
		return arrayStudent;
	}
	
	//генератор оценок - массив на 5 (определено в классе Student),
	//причем, 3 - обязательные позиции
	private static int[] generatorRating() {
		int[] tempRating = new int[Student.numRating];
		for (int i = 0; i < tempRating.length; ++i) {
			if (i > 2) {
				int key = Math.random() > 0.5 ? 0 : 1;
				tempRating[i] = ((int)(Math.random() * 3 + 3)) * key;
			} else {
				tempRating[i] = (int)(Math.random() * 3 + 3);
			}
		}
		return tempRating;
		
	}
}
