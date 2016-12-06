package ua.dp.ort.OOP_10;

/**
 * Класс выводит на консоль данные паспортов,
 * заданных в интерфейсе DataPassport
 * @author Admin
 *
 */
public class Main {
	public static void main(String[] args) {
		Passport[] passports = DataPassport.setDataPassport();
		printDataPassport(passports[0]);
		System.out.println("");
		ForeignPassport[] foreignPassports = DataPassport.setDataForeignPassport();
		printDataForeignPassport(foreignPassports[1]);
	}
	
	/**
	 * вывод данных гражданского паспорта
	 * @param object - объект Passport
	 */
	private static void printDataPassport(Passport object) {
		StringBuilder sb = new StringBuilder();
		sb.append("Фамилия: ").append(object.getSurname()).append("\n")
				.append("Имя: ").append(object.getName()).append("\n")
				.append("Отчество: ").append(object.getPatronymic()).append("\n")
				.append("Дата рождения: ").append(object.getDateOfBirth()).append("\n")
				.append("Место рождения: ").append(object.getPlaceOfBirth()).append("\n")
				.append("Номер паспорта: ").append(object.getNumberPassport()).append("\n")
				.append("Дата выдачи: ").append(object.getDateOfIssue());
		System.out.println(sb.toString());
	}
	
	/**
	 * вывод данных загранпаспорта
	 * @param object - объект ForeignPassport
	 */
	private static void printDataForeignPassport(ForeignPassport object) {
		StringBuilder sbVisa = new StringBuilder();
		sbVisa.append("Виза содружеств: ")
			.append(object.getVisaData().getTypeUnion()).append("\n")
			.append("Назначение визы: ")
			.append(object.getVisaData().getTypePurpose()).append("\n")
			.append("Длительность визы: ")
			.append(object.getVisaData().getTypeAction()).append("\n")
			.append("Дата открытия визы: ")
			.append(object.getVisaData().getDataOpen()).append("\n")
			.append("Дата закрытия визы: ")
			.append(object.getVisaData().getDataClose()).append("\n");
		StringBuilder sb = new StringBuilder();
		sb.append("Фамилия: ").append(object.getSurname()).append("\n")
				.append("Имя: ").append(object.getName()).append("\n")
				.append("Отчество: ").append(object.getPatronymic()).append("\n")
				.append("Дата рождения: ").append(object.getDateOfBirth()).append("\n")
				.append("Место рождения: ").append(object.getPlaceOfBirth()).append("\n")
				.append("Номер паспорта: ").append(object.getNumberPassport()).append("\n")
				.append("Дата выдачи: ").append(object.getDateOfIssue()).append("\n")
				.append(sbVisa.toString())
				.append("Срок действия: ").append(object.getDateOfExpiry()).append("\n")
				.append("Гражданство: ").append(object.getNationality()).append("\n")
				.append("Код страны: ").append(object.getCountryCode()).append("\n")
				.append("Запись в реестре: ").append(object.getRecordNo()).append("\n")
				.append("Организация, выдавшая паспорт: ").append(object.getAuthority()).append("\n");
		System.out.println(sb.toString());
	}
}
