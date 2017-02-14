package ua.dp.ort.OOP_17;

/**
 * Class UniversalBoiler is describe situation, when run direct (Gas) boiler,
 * then gas fuel is ended. In this time solid fuel boiler is turn on.
 * Depending on fuel type work defined function of solid fuel boiler.
 * In this place can be seen using the pattern Strategy - dynamic behavior change object
 * with division changeable and unchangeable part of the base class.
 * @author Kaluzhniy
 *
 */
public class UniversalBoiler {
	public static void main(String[] args) {
		Boiler boilerTemp;
		runDirectGasBoiler();
		
		System.out.println("Нет газа");
		
		boilerTemp = new SolidFuelBoiler();
		System.out.println("Привезли дрова");
		boilerTemp.setFuelNow(new FireWood());
		boilerTemp.fuel();
		boilerTemp.boilerIndicator();
		
		System.out.println("Привезли уголь");
		boilerTemp.setFuelNow(new Coal());
		boilerTemp.fuel();
		boilerTemp.boilerIndicator();
		
		System.out.println("Газ появился");
		runDirectGasBoiler();
		
	}

	private static void runDirectGasBoiler() {
		Boiler boilerTemp = new GasBoiler(new GasFuel());
		boilerTemp.fuel();
		boilerTemp.boilerIndicator();
	}
}
