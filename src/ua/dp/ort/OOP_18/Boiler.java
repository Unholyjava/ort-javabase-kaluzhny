package ua.dp.ort.OOP_18;

/**
 * Boiler is abstract class for determination of different kinds of boilers
 * This class use composition for implement pattern Strategy
 * @author Kaluzhniy
 *
 */
public abstract class Boiler {
	private Fuels _fuelNow;
	private boolean _turnOn;
	
	public Boiler() {
	}
	
	/**
	 * Constructor with parameters 
	 * @param fuelnow - current type of fuel
	 */
	public Boiler(Fuels fuelnow) {
		setFuelNow(fuelnow);
	}
	
	/**
	 * This abstract method shows a normal operation of the boiler
	 */
	public abstract void boilerIndicator();
	
	/**
	 * Method fuel shows the use of a particular fuel type
	 */
	public void fuel() {
		getFuelNow().fuelLoading();
	}
	
	/**
	 * Getter-method for field
	 * @return fuelNow - current type of fuel
	 */
	public Fuels getFuelNow() {
		return _fuelNow;
	}
	
	/**
	 * Setter-method for field
	 * @param fuelNow - set current type of fuel
	 */
	public void setFuelNow(Fuels fuelNow) {
		this._fuelNow = fuelNow;
	}

	/**
	 * Getter-method for field
	 * @return turnOn - current work state of boiler
	 */
	public boolean getTurnOn() {
		return _turnOn;
	}

	/**
	 * Setter-method for field
	 * @param turnOn - set current work state of boiler
	 */
	public void setTurnOn(boolean turnOn) {
		_turnOn = turnOn;
	}
	
}
