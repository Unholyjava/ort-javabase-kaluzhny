package ua.dp.ort.OOP_18;

/**
 * Class ElectrolBoiler is describe a boiler with electricity type of fuel.
 * Class ElectrolBoiler also implements interface ObserverBoiler, so class is 
 * observer for subject-class (class GasBoiler) in the pattern Observer.
 * Class has field of subject-type.
 * @author Kaluzhniy
 *
 */
public class ElectroBoiler extends Boiler implements ObserverBoiler{
	
	private SubjectDirectBoiler _subjectBoiler;
	
	/**
	 * Constructor with parameters, which set field of subject-type
	 * and "register" from subject class.
	 * @param subjectBoiler - object of subject-type.
	 */
	public ElectroBoiler(SubjectDirectBoiler subjectBoiler) {
		setSubjectBoiler(subjectBoiler);
		getSubjectBoiler().registerObserverBoiler(this);
		System.out.println("Электрический котел готов к замене основного");
	}

	/**
	 * Constructor with parameters
	 * @param fuelnow - current type of fuel (only electricity for this type of boiler!)
	 */
	public ElectroBoiler(Fuels fuelnow) {
		super(fuelnow);
	}
	
	@Override
	public void boilerIndicator() {
		System.out.println("Электрический котел работает нормально" + "\n");
	}

	@Override
	public void turnOn() {
		setTurnOn(true);
		boilerIndicator();
	}

	/**
	 * Getter-method for return field of subject-type
	 * @return the subjectBoiler
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
