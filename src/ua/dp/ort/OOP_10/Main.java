package ua.dp.ort.OOP_10;

/**
 * 
 * Class displays the console passport data,
 * specified in the interface DataPassport
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
	 * output data of passport
	 * @param object - object of class Passport
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
	 * output data of foreign passport
	 * @param object - object of class ForeignPassport
	 */
	private static void printDataForeignPassport(ForeignPassport object) {
		
		StringBuilder sbPassport = new StringBuilder();
		sbPassport.append("Фамилия: ").append(object.getSurname()).append("\n")
		.append("Имя: ").append(object.getName()).append("\n")
		.append("Отчество: ").append(object.getPatronymic()).append("\n")
		.append("Дата рождения: ").append(object.getDateOfBirth()).append("\n")
		.append("Место рождения: ").append(object.getPlaceOfBirth()).append("\n")
		.append("Номер паспорта: ").append(object.getNumberPassport()).append("\n")
		.append("Дата выдачи: ").append(object.getDateOfIssue()).append("\n");
		
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
		
		StringBuilder sbForeignPassport = new StringBuilder();
		sbForeignPassport.append("Срок действия: ")
			.append(object.getForeignPassportForei().getDateOfExpiry()).append("\n")
			.append("Гражданство: ").append(object.getForeignPassportForei()
				.getNationality()).append("\n")
			.append("Код страны: ").append(object.getForeignPassportForei()
				.getCountryCode()).append("\n")
			.append("Запись в реестре: ").append(object.getForeignPassportForei()
				.getRecordNo()).append("\n")
			.append("Организация, выдавшая паспорт: ").append(object.getForeignPassportForei()
				.getAuthority()).append("\n");
		
		StringBuilder sb = new StringBuilder();
		sb.append(sbPassport.toString())
			.append(sbVisa.toString())
			.append(sbForeignPassport.toString());
		System.out.println(sb.toString());
	}
}
