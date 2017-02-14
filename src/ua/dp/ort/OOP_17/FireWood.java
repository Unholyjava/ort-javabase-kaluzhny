package ua.dp.ort.OOP_17;

/**
 * Class FireWood is woods fuel determinant and has override method, which set woods fuel.
 * @author Kaluzhniy
 *
 */
public class FireWood implements Fuels {

	@Override
	public void fuelLoading() {
		System.out.println("Загружаем дрова или пеллеты");
		
	}

}
