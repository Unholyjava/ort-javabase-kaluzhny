package ua.dp.ort.OOP_06;

/**
 * Класс представляет собой базу данных читателей студенческой библиотеки
 * @author Admin
 *
 */
public class UserLibrary {
	private String _nameUserLib;
	private int _numberTicket;
	private String _faculty;
	private String _dataOfBirsh;
	private String _phone;
	
	/**
	 * инициализация класса без параметров
	 */
	public UserLibrary() {
	}
	
	/**
	 * инициализация класса с параметрами
	 * @param nameUserLib - Фамилия Имя Отчество 
	 * @param numberTicket - номер читательского билета
	 * @param faculty - факультет
	 * @param dataOfBirth - дата рождения
	 * @param phone - телефон
	 */
	public UserLibrary(String nameUserLib, int numberTicket, String faculty,
			String dataOfBirth, String phone) {
		setNameUserLib(nameUserLib);
		setNumberTicket(numberTicket);
		setFaculty(faculty);
		setDataOfBirth(dataOfBirth);
		setPhone(phone);
	}
	
	/**
	 * установка параметра
	 * @param phone - телефон
	 */
	public void setPhone(String phone) {
		_phone = phone;
	}
	
	/**
	 * установка параметра
	 * @param dataOfBirth - дата рождения
	 */
	public void setDataOfBirth(String dataOfBirth) {
		_dataOfBirsh = dataOfBirth;
	}
	
	/**
	 * установка параметра
	 * @param faculty - факультет
	 */
	public void setFaculty(String faculty) {
		_faculty = faculty;
	}
	
	/**
	 * установка параметра
	 * @param numberTicket - номер читательского билета
	 */
	public void setNumberTicket(int numberTicket) {
		if (numberTicket <= 0 || numberTicket > Integer.MAX_VALUE) {
			_numberTicket = 0;
		} else {
			_numberTicket = numberTicket;
		}
	}
	
	/**
	 * установка параметра
	 * @param nameUserLib - Фамилия Имя Отчество
	 */
	public void setNameUserLib(String nameUserLib) {
		_nameUserLib = nameUserLib;
	}
	
	/**
	 * возвращение параметра
	 * @return телефон
	 */
	public String getPhone() {
		return _phone;
	}
	
	/**
	 * возвращение параметра
	 * @return дата рождения
	 */
	public String getDataOfBirsh() {
		return _dataOfBirsh;
	}
	
	/**
	 * возвращение параметра
	 * @return факультет
	 */
	public String getfaculty() {
		return _faculty;
	}
	
	/**
	 * возвращение параметра
	 * @return номер читательского билета
	 */
	public int getNumberTicket() {
		return _numberTicket;
	}
	
	/**
	 * возвращение параметра
	 * @return Фамилия Имя Отчество
	 */
	public String getNameUserLib() {
		return _nameUserLib;
	}
}

