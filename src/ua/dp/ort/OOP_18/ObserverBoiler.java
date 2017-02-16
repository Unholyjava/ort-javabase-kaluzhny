package ua.dp.ort.OOP_18;

/**
 * Interface ObserverBoiler is abstract element (Observer) of construction 
 * known as pattern Observer.
 * This interface implemented all classes, which are observer for subject-class 
 * (class GasBoiler). Interface ObserverBoiler has method turnOn(), which show working
 * conditions of observe-classes. 
 * @author Kaluzhniy
 *
 */
public interface ObserverBoiler {
	public void turnOn();
}
