package ua.dp.ort.OOP_10;

/**
 * This class is a visa's parameters
 * @author Admin
 *
 */
public class Visa {
	private String _typeUnion;
	private String _typePurpose;
	private String _typeAction;
	private String _dataOpen;
	private String _dataClose;
	
	
	public Visa() {
	}
	
	/**
	 * constructor with parameters
	 * @param typeUnion - commonwealths type of visa (for example, the Schengen)
	 * @param typePurpose - type of visa for the purpose (work, travel)
	 * @param typeAction - type of visa for the duration 
	 *  (single-entry, multiple-entry)
	 * @param dataOpen - visa opening date
	 * @param dataClose - visa closing date
	 */
	public Visa(String typeUnion, 
			String typePurpose,
			String typeAction, 
			String dataOpen, 
			String dataClose) {
		setTypeUnion(typeUnion);
		setTypePurpose(typePurpose);
		setTypeAction(typeAction);
		setDataOpen(dataOpen);
		setDataClose(dataClose);
	}
	/**
	 * Getter for field _typeUnion
	 * @return - commonwealths type of visa
	 */
	public String getTypeUnion() {
		return _typeUnion;
	}
	/**
	 * Setter for field _typeUnion
	 * @param set commonwealths type of visa
	 */
	public void setTypeUnion(String typeUnion) {
		_typeUnion = typeUnion;
	}
	/**
	 * Getter for field _typePurpose
	 * @return - type of visa for the purpose
	 */
	public String getTypePurpose() {
		return _typePurpose;
	}
	/**
	 * Setter for field _typePurpose
	 * @param set type of visa for the purpose
	 */
	public void setTypePurpose(String typePurpose) {
		_typePurpose = typePurpose;
	}
	/**
	 * Getter for field _typeAction
	 * @return - type of visa for the duration
	 */
	public String getTypeAction() {
		return _typeAction;
	}
	/**
	 * Setter for field _typeAction
	 * @param set type of visa for the duration
	 */
	public void setTypeAction(String typeAction) {
		_typeAction = typeAction;
	}
	/**
	 * Getter for field _dataOpen
	 * @return - visa opening date
	 */
	public String getDataOpen() {
		return _dataOpen;
	}
	/**
	 * Setter for field _dataOpen
	 * @param set visa opening date
	 */
	public void setDataOpen(String dataOpen) {
		_dataOpen = dataOpen;
	}
	/**
	 * Getter for field _dataClose
	 * @return - visa closing date
	 */
	public String getDataClose() {
		return _dataClose;
	}
	/**
	 * Setter for field _dataClose
	 * @param set visa closing date
	 */
	public void setDataClose(String dataClose) {
		_dataClose = dataClose;
	}
	
}
