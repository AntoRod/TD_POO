package datas;

public class Point {
	
	private int absciss;
	private int ordinate;
	
	/*CONSTRUCTEURS*/
	public Point() {
		this(0,0);
	}
	public Point(int startAbsciss, int startOrdinate) {
		absciss = startAbsciss;
		ordinate = startOrdinate;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int getAbsciss() {
		return absciss;
	}
	public int getOrdinate() {
		return ordinate;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setAbsciss(int newAbsciss) {
		absciss = newAbsciss;
	}
	public void setOrdinate(int newOrdinate) {
		ordinate = newOrdinate;
	}
	public void setCoordinates(int newAbsciss, int newOrdinate) {
		setAbsciss(newAbsciss);
		setOrdinate(newOrdinate);
	}
	/*FIN SETTERS*/
	/*MUTATEURS*/
	public String toString() {
		return "Coordinates: ["+getAbsciss()+"]["+getOrdinate()+"]\n";
	}
	/*FIN MUTATEURS*/
}
