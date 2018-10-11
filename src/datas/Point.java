package datas;

public class Point {
	
	private int[] coordinates;
	
	/*CONSTRUCTEURS*/
	public Point() {
		this(0,0);
	}
	public Point(int startAbsciss, int startOrdinate) {
		coordinates = new int[2];
		setAbsciss(startAbsciss);
		setOrdinate(startOrdinate);
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
	public void setAbsciss(int newAbsciss) throws IllegalArgumentException{
		if(newAbsciss > -500 && newAbsciss < 500) coordinates[0] = newAbsciss;
		else throw new IllegalArgumentException();
	}
	public void setOrdinate(int newOrdinate) {
		if(isValideCoordinate(newOrdinate)) coordinates[1] = newOrdinate;
		else throw new IllegalArgumentException();
	}
	public void setCoordinates(int newAbsciss, int newOrdinate) {
		setAbsciss(newAbsciss);
		setOrdinate(newOrdinate);
	}
	/*FIN SETTERS*/
	/*MUTATEURS*/
	private Boolean isValideCoordinate(int coordinate) {
		if(coordinate < 500 && coordinate > -500) return true;
		else return false;
	}
	
	public void moveBy(int newAbsciss, int newOrdinate) {
		coordinates[0] += newAbsciss;
		coordinates[1] += newOrdinate;
	}
	public String toString() {
		return "Coordinates: ["+getAbsciss()+"]["+getOrdinate()+"]";
	}
	/*FIN MUTATEURS*/
}
