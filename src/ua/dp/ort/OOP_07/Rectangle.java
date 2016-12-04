package ua.dp.ort.OOP_07;

/**
 * Этот класс создает прямоугольник по координатам 
 * левого верхнего и правого нижнего углов
 * Имеются методы: 
 * - проверка пересечения с другим прямоугольником,
 * - проверка попадания точки в данный прямоугольник,
 * - масштабирование при условии неподвижности верхнего левого углаб
 * - передвижение по плоскости без вращения.
 * @author Admin
 *
 */
public class Rectangle {
	private int _leftUpX;
	private int _leftUpY;
	private int _rightDownX;
	private int _rightDownY;
	
	/**
	 * Принимает прямоугольник с нулевыми значениями координат
	 */
	public Rectangle() {
	}
	
	/**
	 * Принимает прямоугольник с четырьмя координатами
	 * @param x1 - абсцисса верхнего левого угла
	 * @param y1 - ордината верхнего левого угла
	 * @param x2 - абсцисса нижнего правого угла
	 * @param y2 - ордината нижнего правого угла
	 */
	public Rectangle(int x1, int y1, int x2, int y2) {
		if (x2 == x1 || y2 == y1) {
			System.err.println("Неверные данные прямоугольника");
		}
		if (x2 > x1) {
			setLeftUpX(x1);
			setRightDownX(x2);
		} else {
			setLeftUpX(x2);
			setRightDownX(x1);
		}
		if (y2 < y1) {
			setLeftUpY(y1);
			setRightDownY(y2);
		} else {
			setLeftUpY(y2);
			setRightDownY(y1);
		}
	}
	
	/**
	 * @return the leftUpX - абсцисса верхнего левого угла
	 */
	public int getLeftUpX() {
		return _leftUpX;
	}
	
	/**
	 * @param - установка абсциссы верхнего левого угла
	 */
	public void setLeftUpX(int leftUpX) {
		_leftUpX = leftUpX;
	}
	
	/**
	 * @return the leftUpY - ордината верхнего левого угла
	 */
	public int getLeftUpY() {
		return _leftUpY;
	}
	
	/**
	 * @param - установка ординаты верхнего левого угла
	 */
	public void setLeftUpY(int leftUpY) {
		_leftUpY = leftUpY;
	}
	
	/**
	 * @return the rightDownX - абсцисса нижнего правого угла
	 */
	public int getRightDownX() {
		return _rightDownX;
	}
	
	/**
	 * @param установка абсциссы нижнего правого угла
	 */
	public void setRightDownX(int rightDownX) {
		_rightDownX = rightDownX;
	}
	
	/**
	 * @return the rightDownY - ордината нижнего правого угла
	 */
	public int getRightDownY() {
		return _rightDownY;
	}
	
	/**
	 * @param установка ординаты нижнего правого угла
	 */
	public void setRightDownY(int rightDownY) {
		_rightDownY = rightDownY;
	}
	
	/**
	 * Проверка на пересечение двух прямоугольников
	 * @param rectangle1 - первый прямоугольник
	 * @param rectangle2 - второй прямоугольник
	 * @return - логический результата проверки
	 */
	public boolean crossTwoRectangles(Rectangle rectangle1, Rectangle rectangle2) {
		boolean crossTwoRectangles = false;
		if ((rectangle2._leftUpX > rectangle1._leftUpX 
				&& rectangle2._leftUpX < rectangle1._rightDownX 
				&& rectangle2._leftUpY < rectangle1._leftUpY 
				&& rectangle2._leftUpY > rectangle1._rightDownY)
			|| (rectangle2._rightDownX > rectangle1._leftUpX 
				&& rectangle2._rightDownX < rectangle1._rightDownX 
				&& rectangle2._rightDownY < rectangle1._leftUpY 
				&& rectangle2._rightDownY > rectangle1._rightDownY)) {
			crossTwoRectangles = true;
		}
		return crossTwoRectangles;
	}
	
	/**
	 * Проверка на попадание точки в площадь прямоугольника
	 * @param x - абсцисса точки
	 * @param y - ордината точки
	 * @return - логический результат проверки
	 */
	public boolean pointInRectangle(int x, int y) {
		boolean pointInRectangle = false;
		if (x > this._leftUpX && x < this._rightDownX 
				&& y < this._leftUpY && y > this._rightDownY) {
			pointInRectangle = true;
		}
		return pointInRectangle;
	}
	
	/**
	 * Переопределение координат прямоугольника при масштабировании,
	 * причем, множитель должен быть ненулевым.
	 * Если множитель больше 1, то прямоугольник увеличивается,
	 * если множитель меньше 1, то прямоугольник уменьшается.
	 * @param factor - множитель
	 */
	public void zoomRectangle(float factor) {
		if (factor == 0) {
			System.err.println("Неверный множитель");
		}
		int length = (this._rightDownX - this._leftUpX) + 1;
		int height = (this._leftUpY - this._rightDownY) + 1;
		this._rightDownX = this.getLeftUpX() + (int)(factor * length) - 1;
		this._rightDownY = this._leftUpY - (int)(factor * height) + 1;
	}
	
	/**
	 * Переопределение координат прямоугольника 
	 * при передвижении его по плоскости без вращения
	 * @param x - смещение по оси абсцисс (целое число)
	 * @param y - смещение по оси ординат (целое число)
	 */
	public void goRectangle(int x, int y) {
		this._leftUpX += x;
		this._leftUpY += y;
		this._rightDownX += x;
		this._rightDownY += y;
	}
}

