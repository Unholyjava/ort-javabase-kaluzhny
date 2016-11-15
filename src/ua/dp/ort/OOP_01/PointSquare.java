package ua.dp.ort.OOP_01;

public class PointSquare {
	private String name;
	private int abscissa;
	private int ordinate;
	public PointSquare(String sName, int sAbscissa, 
			int sOrdinate) {
		setName(sName);
		setAbscissa(sAbscissa);
		setOrdinate(sOrdinate);
		
		
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAbscissa(int abscissa) {
		this.abscissa = abscissa;
	}
	public void setOrdinate(int ordinate) {
		this.ordinate = ordinate;
	}
	public String getName() {
		return name;
	}
	public int getAbscissa() {
		return abscissa;
	}
	public int getOrdinata() {
		return ordinate;
	}
}
