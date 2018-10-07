package datas;

public class Point {
	
	private int[] coordinates;
	
	/*CONSTRUCTEURS*/
	public Point() {
		this(0,0);
	}
	public Point(int startAbsciss, int startOrdinate) {
		coordinates = new int[2];
		coordinates[0] = startAbsciss;
		coordinates[1] = startOrdinate;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int getAbsciss() {
		return coordinates[0];
	}
	public int getOrdinate() {
		return coordinates[1];
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setAbsciss(int newAbsciss) {
		coordinates[0] = newAbsciss;
	}
	public void setOrdinate(int newOrdinate) {
		coordinates[1] = newOrdinate;
	}
	public void setCoordinates(int newAbsciss, int newOrdinate) {
		setAbsciss(newAbsciss);
		setOrdinate(newOrdinate);
	}
	/*FIN SETTERS*/
	/*MUTATEURS*/
	public void moveBy(int newAbsciss, int newOrdinate) {
		coordinates[0] += newAbsciss;
		coordinates[1] += newOrdinate;
	}
	public String toString() {
		return "Coordinates: ["+getAbsciss()+"]["+getOrdinate()+"]";
	}
	/*FIN MUTATEURS*/
}
