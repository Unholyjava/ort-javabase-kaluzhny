package ua.dp.ort.OOP_18;

/**
 * Class UniversalBoiler is describe situation, when run direct (Gas) boiler.
 * First electric boiler (class ElectroBoiler) announces readiness 
 * to replace the main boiler (GasBoiler).
 * Then gas fuel is ended. In this time electric boiler receives a signal 
 * from the main boiler its turn off, then electric boiler is turn on.
 * Second solid fuel boiler receives a signal, then is turn on.  
 * Depending on fuel type work defined function of solid fuel boiler.
 * In this place can be seen using the pattern Observer - one-to-many relationship
 * and pattern Strategy - dynamic behavior change object
 * with division changeable and unchangeable part of the base class.
 * @author Kaluzhniy
 *
 */
public class UniversalBoiler {
	public static void main(String[] args) {
		Boiler boilerTemp;
		GasBoiler boilerGas = new GasBoiler();
		runDirectGasBoiler();
				
		boilerTemp = new ElectroBoiler((SubjectDirectBoiler) boilerGas);
		
		System.out.println("Нет газа");
		boilerGas.setTurnOn(false);
		boilerGas.ifNoGas();
		
		boilerGas.removeObserverBoiler((ObserverBoiler) boilerTemp);
		boilerTemp = new SolidFuelBoiler((SubjectDirectBoiler) boilerGas);
		
		System.out.println("Нет газа");
		boilerGas.setTurnOn(false);
		System.out.println("Привезли дрова");
		boilerTemp.setFuelNow(new FireWood());
		boilerTemp.fuel();
		boilerGas.ifNoGas();
		
		System.out.println("Привезли уголь");
		boilerTemp.setFuelNow(new Coal());
		boilerTemp.fuel();
		boilerGas.ifNoGas();
		
		System.out.println("Есть газ");
		boilerGas.setTurnOn(true);
		runDirectGasBoiler();
	}

	private static void runDirectGasBoiler() {
		Boiler boilerTemp = new GasBoiler(new GasFuel());
		boilerTemp.fuel();
		boilerTemp.boilerIndicator();
	}
}
