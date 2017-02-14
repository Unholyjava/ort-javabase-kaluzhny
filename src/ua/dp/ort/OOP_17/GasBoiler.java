package ua.dp.ort.OOP_17;

/**
 * Class GasBoiler is describe a boiler with direct type of fuel - gas.
 * @author Kaluzhniy
 *
 */
public class GasBoiler extends Boiler {

	/**
	 * Constructor with parameters 
	 * @param fuelnow - current type of fuel (only gas for this type of boiler!)
	 */
	public GasBoiler(Fuels fuelnow) {
		super(fuelnow);
		//setFuelNow(new GasFuel());
	}

	@Override
	public void boilerIndicator() {
		System.out.println("Газовый котел работает нормально" + "\n");
	}

}
