package ua.dp.ort.OOP_18;

/**
 * Interface SubjectDirectBoiler is abstract element (Subject) of construction 
 * known as pattern Observer.
 * This interface implemented class GasBoiler, which is subject-class for observer-classes 
 * (classes ElectroBoiler and SolidFuelBoiler). 
 * Interface SubjectDirectBoiler has methods, which allows to register, unregister and 
 * notify observers.
 * @author Kaluzhniy
 *
 */
public interface SubjectDirectBoiler {
	
	/**
	 * This method is registers observers.
	 * @param observer - object, which is must register	 
	 */
	public void registerObserverBoiler(ObserverBoiler observer);
	
	/**
	 * This method is unregisters observers 
	 * @param observer - object, which is must unregister
	 */
	public void removeObserverBoiler(ObserverBoiler observer);
	
	/**
	 * This method is notify observers
	 */
	public void notifyObserverBoiler();
}
