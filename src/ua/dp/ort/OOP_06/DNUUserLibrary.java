package ua.dp.ort.OOP_06;

import java.util.Scanner;

public class DNUUserLibrary {
	
	
	/**
	 * В программе создается массив объектов класса UserLibrary.
	 * Реализованы:
	 * - ввод/вывод данных о читателях,
	 * - поиск по фамилии или факультету
	 */
	public static void main(String[] args) {
		final int findForName = 1;
		final int findForFaculty = 2;
		System.out.println("База данных о читателях библиотеки ДНУ");
		System.out.print("Введите количество читателей: ");
		Scanner sInt = new Scanner(System.in);
		Scanner sString = new Scanner(System.in);
		int numberUser = sInt.nextInt();
		
		//Ввод данных о читателях
		UserLibrary[] dnuUsers = new UserLibrary[numberUser];
		System.out.println("Введите данные о читателях библиотеки в формате:\n"
				+ "Фамилия Имя Отчество;\n" 
				+ "номер читательского билета (целое число);\n"
				+ "факультет (например, \"РФФ\");\n"
				+ "дата рождения (например, \"01.01.2000\");\n"
				+ "телефон (например, \"095-500-22-02\")");
		for (int i = 0; i < dnuUsers.length; ++i) {
			dnuUsers[i] = new UserLibrary();
			System.out.print((i+1) + ". ФИО: ");
			String temp = sString.nextLine();
			dnuUsers[i].setNameUserLib(temp);
			System.out.print("   номер читательского билета: ");
			dnuUsers[i].setNumberTicket(sInt.nextInt());
			System.out.print("   факультет: ");
			dnuUsers[i].setFaculty(sString.nextLine());
			System.out.print("   дата рождения: ");
			dnuUsers[i].setDataOfBirth(sString.nextLine());
			System.out.print("   телефон: ");
			dnuUsers[i].setPhone(sString.nextLine());
		}
		
		//Вывод данных о читателях
		for (int i = 0; i < dnuUsers.length; ++i) {
			printUsersLibrary(dnuUsers, i);
		}
		
		System.out.println("Поиск данных читателя:");
		System.out.println(findForName + " - " + "по имени");
		System.out.println(findForFaculty + " - " + "по факультету");
		int findFor = sInt.nextInt();
		switch (findFor) {
		
		//Поиск читателей по фамилии
		case findForName:
			System.out.print("Чтобы посмотреть данные читателя, введите его фамилию: ");
			String nameFind = sString.nextLine();
			for (int i = 0; i < dnuUsers.length; ++i) {
				if (dnuUsers[i].getNameUserLib().substring(0, nameFind.length())
						.equalsIgnoreCase (nameFind)) {
					printUsersLibrary(dnuUsers, i);
				}
			}
		break;
		
		//Поиск читателей по факультету
		case findForFaculty:
			System.out.print("Чтобы посмотреть данные читателя, введите его факультет: ");
			String facultyFind = sString.nextLine();
			for (int i = 0; i < dnuUsers.length; ++i) {
				if (dnuUsers[i].getfaculty().substring(0, facultyFind.length())
						.equalsIgnoreCase (facultyFind)) {
					printUsersLibrary(dnuUsers, i);
				}
			}
		break;
		default:
			System.out.println("Вы ввели неверную операцию");
			sInt.close();
			sString.close();
			return;
		}
		
		sInt.close();
		sString.close();
		
	}

	private static void printUsersLibrary(UserLibrary[] dnuUsers, int i) {
		StringBuffer sb = new StringBuffer();
		sb.append(i + 1)
			.append(". ФИО - ")
			.append(dnuUsers[i].getNameUserLib())
			.append("; номер читательского билета - ")
			.append(dnuUsers[i].getNumberTicket())
			.append("; факультет - ")
			.append(dnuUsers[i].getfaculty())
			.append("; дата рождения - ")
			.append(dnuUsers[i].getDataOfBirsh())
			.append("; телефон - ")
			.append(dnuUsers[i].getPhone());
		System.out.println(sb.toString());
	}
}
