package ua.dp.ort.OOP_10;

/**
 * Класс представляет собой параметры визы
 * @author Admin
 *
 */
public class Visa {
	private String _typeUnion;
	private String _typePurpose;
	private String _typeAction;
	private String _dataOpen;
	private String _dataClose;
	
	/**
	 * инициализация класса без параметров
	 */
	public Visa() {
	}
	
	/**
	 * инициализация класса с параметрами
	 * @param typeUnion - тип визы содружеств (например, шенгенская)
	 * @param typePurpose - тип визы по назначению (рабочая, туристическая)
	 * @param typeAction - тип визы по длительности (одно-, многократные)
	 * @param dataOpen - дата открытия визы
	 * @param dataClose - дата закрытия визы
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
	 * возвращение параметра
	 * @return тип визы содружеств
	 */
	public String getTypeUnion() {
		return _typeUnion;
	}
	/**
	 * установка параметра
	 * @param typeUnion - тип визы содружеств
	 */
	public void setTypeUnion(String typeUnion) {
		_typeUnion = typeUnion;
	}
	/**
	 * возвращение параметра
	 * @return тип визы по назначению
	 */
	public String getTypePurpose() {
		return _typePurpose;
	}
	/**
	 * установка параметра
	 * @param typePurpose - тип визы по назначению
	 */
	public void setTypePurpose(String typePurpose) {
		_typePurpose = typePurpose;
	}
	/**
	 * возвращение параметра
	 * @return тип визы по длительности
	 */
	public String getTypeAction() {
		return _typeAction;
	}
	/**
	 * установка параметра
	 * @param typeAction - тип визы по длительности
	 */
	public void setTypeAction(String typeAction) {
		_typeAction = typeAction;
	}
	/**
	 * возвращение параметра
	 * @return дата открытия визы
	 */
	public String getDataOpen() {
		return _dataOpen;
	}
	/**
	 * установка параметра
	 * @param dataOpen - дата открытия визы
	 */
	public void setDataOpen(String dataOpen) {
		_dataOpen = dataOpen;
	}
	/**
	 * возвращение параметра
	 * @return дата закрытия визы
	 */
	public String getDataClose() {
		return _dataClose;
	}
	/**
	 * установка параметра
	 * @param dataClose - дата закрытия визы
	 */
	public void setDataClose(String dataClose) {
		_dataClose = dataClose;
	}
	
}
