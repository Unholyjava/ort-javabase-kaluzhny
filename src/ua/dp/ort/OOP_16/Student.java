package ua.dp.ort.OOP_16;

/**
 * Class student is a student description (name, phone, address,
 * login and faculty).
 * @author Admin
 *
 */
public class Student {

	private String  _name;
	private long    _phone;
	private Address _address;
	private String  _login;
	private String  _faculty;

	public Student() {
	}

	/**
	 * Constructor with parameters to set student description
	 * @param name - student's name;
	 * @param phone - student's phone;
	 * @param address - student's address;
	 * @param login - student's login;
	 * @param faculty - student's faculty.
	 */
	public Student(String name, long phone, Address address, String login, String faculty) {
		setName(name);
		setPhone(phone);
		setAddress(address);
		setLogin(login);
		setFaculty(faculty);
	}

	/**
	 * Getter-method to return student's name
	 * @return _name
	 */
	public String getName() {
		return _name;
	}

	/**
	 * Setter-method to set student's name
	 * @param name
	 */
	public void setName(String name) {
		this._name = name;
	}

	/**
	 * Getter-method to return student's phone
	 * @return _phone
	 */
	public long getPhone() {
		return _phone;
	}

	/**
	 * Setter-method to set student's phone
	 * @param phone
	 */
	public void setPhone(long phone) {
		this._phone = phone;
	}

	/**
	 * Getter-method to return student's address
	 * @return _address
	 */
	public Address getAddress() {
		return _address;
	}

	/**
	 * Setter-method to set student's address
	 * @param address
	 */
	public void setAddress(Address address) {
		this._address = address;
	}

	/**
	 * Getter-method to return student's login
	 * @return _login
	 */
	public String getLogin() {
		return _login;
	}

	/**
	 * Setter-method to set student's login
	 * @param login
	 */
	public void setLogin(String login) {
		this._login = login;
	}

	/**
	 * Getter-method to return student's faculty
	 * @return _faculty
	 */
	public String getFaculty() {
		return _faculty;
	}

	/**
	 * Setter-method to set student's faculty
	 * @param faculty
	 */
	public void setFaculty(String faculty) {
		this._faculty = faculty;
	}

	@Override
	/**
	 * Method toString for correctly visualization class fields.
	 */
	public String toString() {
		return "Student{" + "name='" + _name + '\'' + ", phone=" + _phone + ", address=" + _address + ", login='"
				+ _login + '\'' + ", faculty='" + _faculty + '\'' + '}';
	}
}
