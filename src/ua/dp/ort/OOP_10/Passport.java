package ua.dp.ort.OOP_10;

/**
 * Класс представляет собой данные паспорта Украины
 * @author Admin
 *
 */
public class Passport {
	private String _surname;
	private String _name;
	private String _patronymic;
	private String _dateOfBirth;
	private String _placeOfBirth;
	private String _numberPassport;
	private String _dateOfIssue;
	
	/**
	 * инициализация класса без параметров
	 */
	public Passport () {
	}
	
	/**
	 * инициализация класса с параметрами:
	 * @param surname - фамилия
	 * @param name - имя
	 * @param patronymic - отчество
	 * @param dateOfBirth - дата рождения
	 * @param placeOfBirth - место рождения
	 * @param numberPassport - номер паспорта
	 * @param dateOfIssue - дата выдачи
	 */
	public Passport (String surname, 
			String name, 
			String patronymic,
			String dateOfBirth,
			String placeOfBirth,
			String numberPassport,
			String dateOfIssue) {
		setSurname(surname);
		setName(name);
		setPatronymic(patronymic);
		setDateOfBirth(dateOfBirth);
		setPlaceOfBirth(placeOfBirth);
		setNumberPassport(numberPassport);
		setDateOfIssue(dateOfIssue);
	}
	/**
	 * возвращение параметра
	 * @return фамилия
	 */
	public String getSurname() {
		return _surname;
	}
	/**
	 * установка параметра
	 * @param surname - фамилия
	 */
	public void setSurname(String surname) {
		_surname = surname;
	}
	/**
	 * возвращение параметра
	 * @return имя
	 */
	public String getName() {
		return _name;
	}
	/**
	 * установка параметра
	 * @param name - имя
	 */
	public void setName(String name) {
		_name = name;
	}
	/**
	 * возвращение параметра
	 * @return отчество
	 */
	public String getPatronymic() {
		return _patronymic;
	}
	/**
	 * установка параметра
	 * @param patronymic - отчество
	 */
	public void setPatronymic(String patronymic) {
		_patronymic = patronymic;
	}
	/**
	 * возвращение параметра
	 * @return дата рождения
	 */
	public String getDateOfBirth() {
		return _dateOfBirth;
	}
	/**
	 * установка параметра
	 * @param dateOfBirth - дата рождения
	 */
	public void setDateOfBirth(String dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}
	/**
	 * возвращение параметра
	 * @return место рождения
	 */
	public String getPlaceOfBirth() {
		return _placeOfBirth;
	}
	/**
	 * установка параметра
	 * @param placeOfBirth - место рождения
	 */
	public void setPlaceOfBirth(String placeOfBirth) {
		_placeOfBirth = placeOfBirth;
	}
	/**
	 * возвращение параметра
	 * @return номер паспорта
	 */
	public String getNumberPassport() {
		return _numberPassport;
	}
	/**
	 * установка параметра
	 * @param numberPassport - номер паспорта
	 */
	public void setNumberPassport(String numberPassport) {
		_numberPassport = numberPassport;
	}
	/**
	 * возвращение параметра
	 * @return дата выдачи
	 */
	public String getDateOfIssue() {
		return _dateOfIssue;
	}
	/**
	 * установка параметра
	 * @param dateOfIssue - дата выдачи
	 */
	public void setDateOfIssue(String dateOfIssue) {
		_dateOfIssue = dateOfIssue;
	}
	
	
	
}
