package ua.dp.ort.OOP_16;

/**
 * Class Address is a presentation of student's address.
 * @author Admin
 *
 */
public class Address {

    private String _country;
    private String _city;
    private String _street;

	/**
	 * Constructor with parameters - real address of student.
	 * @param country - country, where live student;
	 * @param city - city, where live student;
	 * @param street - street, where live student.
	 */
    public Address(String country, String city, String street) {
		setCountry(country);
		setCity(city);
		setStreet(street);
	}

	public Address() {
	}

    /**
     * Getter-method to return student's country
     * @return _country
     */
	public String getCountry() {
        return _country;
    }

    /**
     * Setter-method for set student's country
     * @param country
     */
	public void setCountry(String country) {
        _country = country;
    }

    /**
     * Getter-method to return student's city
     * @return _city
     */
	public String getCity() {
        return _city;
    }

    /**
     * Setter-method for set student's city
     * @param city
     */
	public void setCity(String city) {
        _city = city;
    }

    /**
     * Getter-method to return student's street
     * @return _street
     */
	public String getStreet() {
        return _street;
    }

    /**
     * Setter-method for set student's street
     * @param street
     */
	public void setStreet(String street) {
        _street = street;
    }

	@Override
	/**
	 * Method toString for correctly visualization class fields. 
	 */
	public String toString() {
		return "Address{" +
				"country='" + _country + '\'' +
				", city='" + _city + '\'' +
				", street='" + _street + '\'' +
				'}';
	}
}
