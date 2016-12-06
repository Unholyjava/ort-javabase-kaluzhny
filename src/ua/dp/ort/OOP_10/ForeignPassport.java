package ua.dp.ort.OOP_10;

/**
 * Класс представляет собой данные загранпаспорта Украины
 * и является расширением класса данных гражданского
 * паспорта Украины - класса Passport.
 * @author Admin
 *
 */
public class ForeignPassport extends Passport {
	private Visa _visaData;
	private String _dateOfExpiry;
	private String _nationality;
	private String _countryCode;
	private String _recordNo;
	private String _authority;
	
	/**
	 * инициализация класса без параметров
	 */
	public ForeignPassport() {
	}
	
	/**
	 * инициализация класса с параметрами
	 * @param surname - фамилия
	 * @param name - имя
	 * @param patronymic - отчество
	 * @param dateOfBirth - дата рождения
	 * @param placeOfBirth - место рождения
	 * @param numberPassport - номер паспорта
	 * @param dateOfIssue - дата выдачи
	 * @param visaData - типы визы
	 * @param dateOfExpiry - дата окончания срока действия паспорта
	 * @param nationality - гражданство
	 * @param countryCode - код страны, выдавшей паспорт
	 * @param recordNo - запись в реестре
	 * @param authority - организация, выдавшая паспорт
	 */
	public ForeignPassport(String surname, 
			String name, 
			String patronymic,
			String dateOfBirth,
			String placeOfBirth,
			String numberPassport,
			String dateOfIssue,
			Visa visaData,
			String dateOfExpiry,
			String nationality,
			String countryCode,
			String recordNo,
			String authority) {
		super (surname, name, patronymic, dateOfBirth, placeOfBirth,
				numberPassport, dateOfIssue);
		setVisaData(visaData);
		setDateOfExpiry(dateOfExpiry);
		setNationality(nationality);
		setCountryCode(countryCode);
		setRecordNo(recordNo);
		setAuthority(authority);
	}
	/**
	 * возвращение параметра
	 * @return типы визы
	 */
	public Visa getVisaData() {
		return _visaData;
	}
	/**
	 * установка параметра
	 * @param visaData - типы визы
	 */
	public void setVisaData(Visa visaData) {
		_visaData = visaData;
	}
	/**
	 * возвращение параметра
	 * @return дата окончания срока действия паспорта
	 */
	public String getDateOfExpiry() {
		return _dateOfExpiry;
	}
	/**
	 * установка параметра
	 * @param dateOfExpiry - дата окончания срока действия паспорта
	 */
	public void setDateOfExpiry(String dateOfExpiry) {
		_dateOfExpiry = dateOfExpiry;
	}
	/**
	 * возвращение параметра
	 * @return гражданство
	 */
	public String getNationality() {
		return _nationality;
	}
	/**
	 * установка параметра
	 * @param nationality - гражданство
	 */
	public void setNationality(String nationality) {
		_nationality = nationality;
	}
	/**
	 * возвращение параметра
	 * @return код страны, выдавшей паспорт
	 */
	public String getCountryCode() {
		return _countryCode;
	}
	/**
	 * установка параметра
	 * @param countryCode - код страны, выдавшей паспорт
	 */
	public void setCountryCode(String countryCode) {
		_countryCode = countryCode;
	}
	/**
	 * возвращение параметра
	 * @return запись в реестре
	 */
	public String getRecordNo() {
		return _recordNo;
	}
	/**
	 * установка параметра
	 * @param recordNo - запись в реестре
	 */
	public void setRecordNo(String recordNo) {
		_recordNo = recordNo;
	}
	/**
	 * возвращение параметра
	 * @return организация, выдавшая паспорт
	 */
	public String getAuthority() {
		return _authority;
	}
	/**
	 * установка параметра
	 * @param authority - организация, выдавшая паспорт
	 */
	public void setAuthority(String authority) {
		_authority = authority;
	}
}
