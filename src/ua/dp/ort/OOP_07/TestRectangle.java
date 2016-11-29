package ua.dp.ort.OOP_07;

import java.util.Scanner;

/**
 * Класс тестирует методы класса Rectangle:
 * - пересечение прямоугольников,
 * - попадание точки в прямоугольник,
 * - масштабирование,
 * - движение по плоскости без вращения,
 * а также выводит прямоугольник на консоль средствами псевдографики 
 * 
 * @author Admin
 *
 */
public class TestRectangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int cross = 1;
		final int pointIn = 2;
		final int zoom = 3;
		final int go = 4;
		System.out.println(cross + " - пересечение прямоугольников;");
		System.out.println(pointIn + " - попадание точки в прямоугольник;");
		System.out.println(zoom + " - масштабирование прямоугольника;");
		System.out.println(go + " - движение по плоскости без вращения;");
		System.out.print("Выберите тип теста: ");
		int test = s.nextInt();
		switch (test) {
		//Тест на пересечение прямоугольников
		case cross:
			System.out.println("Выясним, пересекаются ли два прямоугольника?"
				+ "\n" + "Введите координаты левого верхнего и правого нижнего углов");
			System.out.print("Первый прямоугольник: \n"
				+ "x1 = ");
			int x1 = s.nextInt();
			System.out.print("y1 = ");
			int y1 = s.nextInt();
			System.out.print("x2 = ");
			int x2 = s.nextInt();
			System.out.print("y2 = ");
			int y2 = s.nextInt();
			Rectangle rectangle1 = new Rectangle(x1, y1, x2, y2);
			System.out.print("Второй прямоугольник: \n"
				+ "x1 = ");
			x1 = s.nextInt();
			System.out.print("y1 = ");
			y1 = s.nextInt();
			System.out.print("x2 = ");
			x2 = s.nextInt();
			System.out.print("y2 = ");
			y2 = s.nextInt();
			Rectangle rectangle2 = new Rectangle(x1, y1, x2, y2);
			if (rectangle1.crossTwoRectangles(rectangle1, rectangle2)) {
				System.out.println("Эти два прямоугольника пересекаются");
			} else {
				System.out.println("Эти два прямоугольника не пересекаются");
			}
			//Указывается координата потому, что рисунок псевдографики формируется
			//от левого верхнего угла
			System.out.println("Координата левого верхнего угла первого прямоугольника: "
				+ "х = " + rectangle1.getLeftUpX() + ", y = " + rectangle1.getLeftUpY());
			printRectangle(rectangle1);
			System.out.println("Координата левого верхнего угла второго прямоугольника: "
				+ "х = " + rectangle2.getLeftUpX() + ", y = " + rectangle2.getLeftUpY());
			printRectangle(rectangle2);
		break;
		
		//Тест на попадание точки в прямоугольник
		case pointIn:
			System.out.println("Выясним, попадает ли точка в прямоугольник?" + "\n" 
				+ "Введите координаты левого верхнего и правого нижнего углов прямоугольника");
			System.out.print("x1 = ");
			x1 = s.nextInt();
			System.out.print("y1 = ");
			y1 = s.nextInt();
			System.out.print("x2 = ");
			x2 = s.nextInt();
			System.out.print("y2 = ");
			y2 = s.nextInt();
			Rectangle rectangle = new Rectangle(x1, y1, x2, y2);
			System.out.print("Введите координаты точки: " + "\n"
				+ "x = ");
			x1 = s.nextInt();
			System.out.print("y = ");
			y1 = s.nextInt();
			if (rectangle.pointInRectangle(x1, y1)) {
				System.out.println("Точка попадает в прямоугольник");
			} else {
				System.out.println("Точка не попадает в прямоугольник");
			}
			//Указывается координата потому, что рисунок псевдографики формируется
			//от левого верхнего угла
			System.out.println("Координата левого верхнего угла прямоугольника: "
				+ "х = " + rectangle.getLeftUpX() + ", y = " + rectangle.getLeftUpY());
			printRectangle(rectangle);
		break;
		
		//Тест на масштабирование
		//множитель больше 1 - увеличение, меньше - уменьшение
		case zoom:
			System.out.println("Масштабируем прямоугольник" + "\n" 
				+ "Введите координаты левого верхнего и правого нижнего углов прямоугольника");
			System.out.print("x1 = ");
			x1 = s.nextInt();
			System.out.print("y1 = ");
			y1 = s.nextInt();
			System.out.print("x2 = ");
			x2 = s.nextInt();
			System.out.print("y2 = ");
			y2 = s.nextInt();
			Rectangle rectangle3 = new Rectangle(x1, y1, x2, y2);
			System.out.print("Введите ненулевой множитель: " + "\n"
				+ "множитель = ");
			float factor = s.nextFloat();
			rectangle3.zoomRectangle(factor);
			System.out.println("Новые координаты правого нижнего угла прямоугольника:\n"
				+ "x = " + rectangle3.getRightDownX()
				+ ", y = " + rectangle3.getRightDownY());
			//Указывается координата потому, что рисунок псевдографики формируется
			//от левого верхнего угла
			System.out.println("Координата левого верхнего угла прямоугольника: "
				+ "х = " + rectangle3.getLeftUpX() + ", y = " + rectangle3.getLeftUpY());
			printRectangle(rectangle3);
		break;
		
		//Тест на движение по плоскости без вращения
		case go:
			System.out.println("Двигаем прямоугольник" + "\n" 
				+ "Введите координаты левого верхнего и правого нижнего углов прямоугольника");
			System.out.print("x1 = ");
			x1 = s.nextInt();
			System.out.print("y1 = ");
			y1 = s.nextInt();
			System.out.print("x2 = ");
			x2 = s.nextInt();
			System.out.print("y2 = ");
			y2 = s.nextInt();
			Rectangle rectangle4 = new Rectangle(x1, y1, x2, y2);
			System.out.print("Введите смещение прямоугольника по осям: " + "\n"
				+ "x = ");
			x1 = s.nextInt();
			System.out.print("y = ");
			y1 = s.nextInt();
			rectangle4.goRectangle(x1, y1);;
			System.out.println("Новые координаты левого верхнего угла прямоугольника:\n"
				+ "x = " + rectangle4.getLeftUpX()
				+ ", y = " + rectangle4.getLeftUpY());
			System.out.println("Новые координаты правого нижнего угла прямоугольника:\n"
				+ "x = " + rectangle4.getRightDownX()
				+ ", y = " + rectangle4.getRightDownY());
			printRectangle(rectangle4);
		break;
		default:
			s.close();
			System.out.println("Вы ввели неверное число");
		return;
		}
		
		
		s.close();
	}

	/**
	 * Вывод прямоугольника на консоль с помощью псевдографики
	 * @param rectangle - заданный прямоугольник
	 */
	public static void printRectangle(Rectangle rectangle) {
		int length = rectangle.getRightDownX() - rectangle.getLeftUpX();
		int height = rectangle.getLeftUpY() - rectangle.getRightDownY();
		char symbol = '*';
		for (int i = 0; i <= height; ++i) {
			for (int j = 0; j <= length; ++j) {
				if (i == 0 || i == height) {
					System.out.print(symbol);
				}
			}
			//System.out.println();
			for (int j = 0; j <= length; ++j) {
				if ((i != 0 && i != height) && (j == 0 || j == length)) {
					System.out.print(symbol);
				} else if ((i != 0 && i != height)) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
