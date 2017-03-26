package ua.dp.ort.OOP_18;

import java.util.ArrayList;

/**
 * Class GasBoiler is describe a boiler with direct type of fuel - gas.
 * Class GasBoiler is the subject-class in the pattern Observer 
 * (see interface SubjectDirectBoiler).
 * Class has the field of observer-type and methods for add, remove and notify observers. 
 * @author Kaluzhniy
 *
 */
public class GasBoiler extends Boiler implements SubjectDirectBoiler{
	private ArrayList<ObserverBoiler> _observerBoilers;

	/**
	 * Constructor with parameters 
	 * @param fuelnow - current type of fuel (only gas for this type of boiler!)
	 */
	public GasBoiler(Fuels fuelnow) {
		super(fuelnow);
	}
	
	public GasBoiler() {
		super();
		setObserverBoilers(new ArrayList<ObserverBoiler>());
	}

	@Override
	public void boilerIndicator() {
		System.out.println("Газовый котел работает нормально" + "\n");
	}

	/**
	 * Getter-method to return list of registered boiler-observers.
	 * @return the observerBoilers - field of observer-type
	 */
	public ArrayList<ObserverBoiler> getObserverBoilers() {
		return _observerBoilers;
	}

	/**
	 * Setter-method to set list of registered boiler-observers.
	 * @param observerBoilers - field of observer-type
	 */
	private void setObserverBoilers(ArrayList<ObserverBoiler> observerBoilers) {
		_observerBoilers = observerBoilers;
	}

	@Override
	public void registerObserverBoiler(ObserverBoiler observer) {
		getObserverBoilers().add(observer);
	}

	@Override
	public void removeObserverBoiler(ObserverBoiler observer) {
		int i = getObserverBoilers().indexOf(observer);
		if (i >= 0) {
			getObserverBoilers().remove(i);
		}
	}

	@Override
	public void notifyObserverBoiler() {
		for (ObserverBoiler observer : getObserverBoilers()) {
			observer.turnOn();
		}
	}
	
	public void ifNoGas() {
		if (!getTurnOn()) {
			notifyObserverBoiler();
		}
	}
}
