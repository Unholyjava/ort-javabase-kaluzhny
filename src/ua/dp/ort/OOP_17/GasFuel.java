package ua.dp.ort.OOP_17;

/**
 * Class GasFuel is gas fuel determinant and has override method, which set gas fuel.
 * @author Kaluzhniy
 *
 */
public class GasFuel implements Fuels {

	@Override
	public void fuelLoading() {
		System.out.println("Открываем газовую заслонку");
		
	}

}
