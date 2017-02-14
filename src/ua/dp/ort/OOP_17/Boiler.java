package ua.dp.ort.OOP_17;

/**
 * Boiler is abstract class for determination of different kinds of boilers
 * This class use composition for implement pattern Strategy
 * @author Kaluzhniy
 *
 */
public abstract class Boiler {
	private Fuels fuelNow;
	
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
		return fuelNow;
	}
	
	/**
	 * Setter-method for field
	 * @param fuelNow - set current type of fuel
	 */
	public void setFuelNow(Fuels fuelNow) {
		this.fuelNow = fuelNow;
	}
	
}
