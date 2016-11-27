package ua.dp.ort.chapter_OOP_04;

public class TestStringch {
	public static void main(String[] args) {
		
		/**
		 * Тесты конструкторов и методов класса Stringch
		 */
		
		//Создание пустой строки длиной по умолчанию
		Stringch test1 = new Stringch();
		System.out.println("Длина пустой строки: " + test1.getlength());
		System.out.println("Пустая строка: ");
		System.out.println(test1.getsimbol() + "\n");
		
		//Создание строки заданной длины со случайными значениями
		final int length = 5;
		Character[] simbol = new Character[length];
		for (int i = 0; i < length; ++i) {
			simbol[i] = (char)((int)(Math.random() * 127) + 21);
		}
		Stringch test2 = new Stringch(simbol);
		System.out.println("Длина строки: " + test2.getlength());
		System.out.println("Случайная строка: ");
		System.out.println(test2.getsimbol() + "\n");
		
		//Преобразование стандартной строки в строку типа Stringch
		Stringch test3 = new Stringch("ТЕСТ_3");
		System.out.println("Длина строки: " + test3.getlength());
		System.out.println("Cтрока: ");
		System.out.println(test3.getsimbol() + "\n");
		
		//Сложение двух строк
		Stringch test4_1 = new Stringch("Yellow ");
		Stringch test4_2 = new Stringch("Submarine");
		Stringch test4 = new Stringch();
		test4.sumStringht(test4_1, test4_2);
		System.out.println("Длина строки: " + test4.getlength());
		System.out.println("Cтрока: ");
		System.out.println(test4.getsimbol() + "\n");
		
		//Замена символа в строке
		Stringch test5 = new Stringch("Велосипедисты");
		test5.changeStringch('Б', 6);
		System.out.println("Длина строки: " + test5.getlength());
		System.out.println("Cтрока: ");
		System.out.println(test5.getsimbol() + "\n");
				
		//Удаление заданное количество элементов с конца строки
		Stringch test6 = new Stringch("Велосипедисты");
		test6.deleteStringchEnd(4);
		System.out.println("Длина строки: " + test6.getlength());
		System.out.println("Cтрока: ");
		System.out.println(test6.getsimbol() + "\n");
		
	}
}
