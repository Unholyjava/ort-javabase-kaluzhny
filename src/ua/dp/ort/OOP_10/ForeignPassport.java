package ua.dp.ort.OOP_10;

/**
 * This class is a foreign passport of Ukraine
 * and it is an extension class Passport
 * Class contains fields which are other classes  
 * @author Admin
 *
 */
public class ForeignPassport extends Passport {
	private Visa _visaData;
	private ForeignPassportForei _foreignPassportForei;
		
	
	public ForeignPassport() {
	}
	
	/**
	 * constructor with parameters
	 * @param passport - data of passport
	 * @param visaData - data of visa
	 * @param foreignPassportForei - other data of foreign passport
	 */
	public ForeignPassport(
		Passport passport,
		Visa visaData,
		ForeignPassportForei foreignPassportForei) {
		super(passport.getSurname(), passport.getName(), 
			passport.getPatronymic(), passport.getDateOfBirth(), 
			passport.getPlaceOfBirth(), passport.getNumberPassport(), 
			passport.getDateOfIssue());
		setVisaData(visaData);
		setForeignPassportForei(foreignPassportForei);
		
	}
	
	/**
	 * Getter for field _visaData (variable of class Visa)
	 * @return data of visa
	 */
	public Visa getVisaData() {
		return _visaData;
	}
	/**
	 * Setter for field _visaData (variable of class Visa)
	 * @param visaData - set data of visa
	 */
	public void setVisaData(Visa visaData) {
		_visaData = visaData;
	}

	/**
	 * Getter for field _foreignPassportForei (variable of class ForeignPassportForei)
	 * @return - other data of foreign passport
	 */
	public ForeignPassportForei getForeignPassportForei() {
		return _foreignPassportForei;
	}

	/**
	 * Setter for field _foreignPassportForei (variable of class ForeignPassportForei)
	 * @param set other data of foreign passport
	 */
	public void setForeignPassportForei(ForeignPassportForei foreignPassportForei) {
		_foreignPassportForei = foreignPassportForei;
	}

		
}
