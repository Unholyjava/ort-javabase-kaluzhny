package ua.dp.ort.OOP_17;

/**
 * Class SolidFuelBoiler is describe a boiler with different type of solid fuel.
 * The particular types are determined by composition for pattern Strategy 
 * (see class Boiler).
 * @author Kaluzhniy
 *
 */
public class SolidFuelBoiler extends Boiler {

	public SolidFuelBoiler() {
		super();
		System.out.println("Ожидаем тип твердого топлива");
	}
	
	@Override
	public void boilerIndicator() {
		System.out.println("Твердотопливный котел работает нормально" + "\n");
	}

}
