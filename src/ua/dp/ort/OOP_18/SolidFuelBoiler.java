package ua.dp.ort.OOP_18;

/**
 * Class SolidFuelBoiler is describe a boiler with different type of solid fuel.
 * The particular types are determined by composition for pattern Strategy 
 * (see class Boiler).
 * Class SolidFuelBoiler also implements interface ObserverBoiler, so class is 
 * observer for subject-class (class GasBoiler) in the pattern Observer.
 * Class has field of subject-type.   
 * @author Kaluzhniy
 *
 */
public class SolidFuelBoiler extends Boiler implements ObserverBoiler {
	
	private SubjectDirectBoiler _subjectBoiler; 

	/**
	 * Constructor with parameters, which set field of subject-type
	 * and "register" from subject class. 
	 * @param subjectBoiler - object of subject-type.
	 */
	public SolidFuelBoiler(SubjectDirectBoiler subjectBoiler) {
		setSubjectBoiler(subjectBoiler);
		getSubjectBoiler().registerObserverBoiler(this);
		System.out.println("Твердотопливный котел готов к замене основного");
	}
	
	public SolidFuelBoiler() {
		super();
		System.out.println("Ожидаем тип твердого топлива");
	}
	
	@Override
	public void boilerIndicator() {
		System.out.println("Твердотопливный котел работает нормально" + "\n");
	}

	@Override
	public void turnOn() {
		setTurnOn(true);
		boilerIndicator();
	}

	/**
	 * Getter-method for return field of subject-type 
	 * @return subjectBoiler
	 */
	private SubjectDirectBoiler getSubjectBoiler() {
		return _subjectBoiler;
	}

	/**
	 * Setter-method for set field of subject-type
	 * @param subjectBoiler
	 */
	private void setSubjectBoiler(SubjectDirectBoiler subjectBoiler) {
		_subjectBoiler = subjectBoiler;
	}

}
