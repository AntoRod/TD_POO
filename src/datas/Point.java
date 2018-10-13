package datas;

public class Point {
	
	private int[] coordinates;
	//CONSTANTES (plus tard: définir avec une méthode)
	private static int upCap = 500;//cap positif des coordonnées
	private static int downCap = -500;//cap négatif des coordonnées
	
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
		if(isValideCoordinate(newAbsciss)) coordinates[0] = newAbsciss;
		else throw new IllegalArgumentException();
	}
	public void setOrdinate(int newOrdinate) throws IllegalArgumentException{
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
		if(coordinate <= upCap && coordinate >= downCap) return true;
		else return false;
	}
	
	public void moveBy(int newAbsciss, int newOrdinate) {
		if(isValideCoordinate(coordinates[0]+newAbsciss)) coordinates[0] += newAbsciss;
		else throw new IllegalArgumentException();
		if(isValideCoordinate(coordinates[1]+newOrdinate)) coordinates[1] += newOrdinate;
		else throw new IllegalArgumentException();
	}
	public String toString() {
		return "Coordinates: ["+getAbsciss()+"]["+getOrdinate()+"]";
	}
	/*FIN MUTATEURS*/
}
