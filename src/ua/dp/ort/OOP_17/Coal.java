package ua.dp.ort.OOP_17;

/**
 * Class Coal is coal fuel determinant and has override method, which set coal fuel.
 * @author Kaluzhniy
 *
 */
public class Coal implements Fuels {

	@Override
	public void fuelLoading() {
		System.out.println("Загружаем уголь");
	}
}
