package ua.dp.ort.OOP_10;

/**
 * This class contains group of fields as a composition 
 * for class ForeignPassport
 * @author Admin
 *
 */
public class ForeignPassportForei {
	private String _dateOfExpiry;
	private String _nationality;
	private String _countryCode;
	private String _recordNo;
	private String _authority;
	
	/**
	 * constructor without parameters
	 */
	public ForeignPassportForei() {
	}
	
	/**
	 * constructor with parameters
	 * @param dateOfExpiry - expiration date of foreign passport
	 * @param nationality - holder's nationality
	 * @param countryCode - code of the country issuing the foreign passport
	 * @param recordNo - registry entry
	 * @param authority - organization that issued the passport
	 */
	public ForeignPassportForei(
			String dateOfExpiry,
			String nationality,
			String countryCode,
			String recordNo,
			String authority) {
		
		setDateOfExpiry(dateOfExpiry);
		setNationality(nationality);
		setCountryCode(countryCode);
		setRecordNo(recordNo);
		setAuthority(authority);
	}
	
	/**
	 * Getter
	 * @return - expiration date of foreign passport
	 */
	public String getDateOfExpiry() {
		return _dateOfExpiry;
	}
	/**
	 * Setter
	 * @param set expiration date of foreign passport
	 */
	public void setDateOfExpiry(String dateOfExpiry) {
		_dateOfExpiry = dateOfExpiry;
	}
	/**
	 * Getter
	 * @return - holder's nationality
	 */
	public String getNationality() {
		return _nationality;
	}
	/**
	 * Setter
	 * @param set holder's nationality
	 */
	public void setNationality(String nationality) {
		_nationality = nationality;
	}
	/**
	 * Getter
	 * @return - code of the country issuing the foreign passport
	 */
	public String getCountryCode() {
		return _countryCode;
	}
	/**
	 * Setter
	 * @param set code of the country issuing the foreign passport
	 */
	public void setCountryCode(String countryCode) {
		_countryCode = countryCode;
	}
	/**
	 * Getter
	 * @return - registry entry
	 */
	public String getRecordNo() {
		return _recordNo;
	}
	/**
	 * Setter
	 * @param set registry entry
	 */
	public void setRecordNo(String recordNo) {
		_recordNo = recordNo;
	}
	/**
	 * Getter
	 * @return - organization that issued the passport
	 */
	public String getAuthority() {
		return _authority;
	}
	/**
	 * Setter
	 * @param set organization that issued the passport
	 */
	public void setAuthority(String authority) {
		_authority = authority;
	}
}
