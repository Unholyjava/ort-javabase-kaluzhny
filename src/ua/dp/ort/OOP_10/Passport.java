package ua.dp.ort.OOP_10;

/**
 * This class is a passport of Ukraine
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
	
	
	public Passport () {
	}
	
	/**
	 * constructor with parameters
	 * @param surname - holder's surname
	 * @param name - holder's name
	 * @param patronymic - holder's patronymic
	 * @param dateOfBirth - holder's date of birth
	 * @param placeOfBirth - holder's place of birth
	 * @param numberPassport - number of passport
	 * @param dateOfIssue - passport issuing date
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
	 * Getter for field _surname
	 * @return - holder's surname
	 */
	public String getSurname() {
		return _surname;
	}
	/**
	 * Setter for field _surname
	 * @param set holder's surname
	 */
	public void setSurname(String surname) {
		_surname = surname;
	}
	/**
	 * Getter for field _name
	 * @return - holder's name
	 */
	public String getName() {
		return _name;
	}
	/**
	 * Setter for field _name
	 * @param set holder's name
	 */
	public void setName(String name) {
		_name = name;
	}
	/**
	 * Getter for field _patronymic
	 * @return - holder's patronymic
	 */
	public String getPatronymic() {
		return _patronymic;
	}
	/**
	 * Setter for field _patronymic
	 * @param set holder's patronymic
	 */
	public void setPatronymic(String patronymic) {
		_patronymic = patronymic;
	}
	/**
	 * Getter for field _dateOfBirth
	 * @return - holder's date of birth
	 */
	public String getDateOfBirth() {
		return _dateOfBirth;
	}
	/**
	 * Setter for field _dateOfBirth
	 * @param set holder's date of birth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}
	/**
	 * Getter for field _placeOfBirth
	 * @return - holder's place of birth
	 */
	public String getPlaceOfBirth() {
		return _placeOfBirth;
	}
	/**
	 * Setter for field _placeOfBirth
	 * @param set holder's place of birth
	 */
	public void setPlaceOfBirth(String placeOfBirth) {
		_placeOfBirth = placeOfBirth;
	}
	/**
	 * Getter for field _numberPassport
	 * @return - number of passport
	 */
	public String getNumberPassport() {
		return _numberPassport;
	}
	/**
	 * Setter for field _numberPassport
	 * @param set number of passport
	 */
	public void setNumberPassport(String numberPassport) {
		_numberPassport = numberPassport;
	}
	/**
	 * Getter for field _dateOfIssue
	 * @return - passport issuing date
	 */
	public String getDateOfIssue() {
		return _dateOfIssue;
	}
	/**
	 * Setter for field _dateOfIssue
	 * @param set passport issuing date
	 */
	public void setDateOfIssue(String dateOfIssue) {
		_dateOfIssue = dateOfIssue;
	}
	
	
	
}
