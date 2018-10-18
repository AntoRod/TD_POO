package datas;

public class Point {
	//ATTRIBUTS
	//Un tableau de coordonn�es et des bornes superieur et inferieur
	private int[] coordinates;
	//CONSTANTES (plus tard: d�finir avec une m�thode)
	private static int upCap = 500;//cap positif des coordonn�es
	private static int downCap = -500;//cap n�gatif des coordonn�es
	
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
	/*TOSTRING*/
	public String toString() {
		return "Coordinates: ["+getAbsciss()+"]["+getOrdinate()+"]";
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//V�rifie la validit� d'une coordon�e
	private Boolean isValideCoordinate(int coordinate) {
		//Si elle est entre les bornes superieur et inferieur, retourner vrai
		if(coordinate <= upCap && coordinate >= downCap) return true;
		//Sinon retourner faux
		else return false;
	}
	//D�placer le point de (x, y) coordonn�es
	public void moveBy(int newAbsciss, int newOrdinate) {
		//On v�rifie la validit� de l'absciss APRES deplacement
		if(isValideCoordinate(coordinates[0]+newAbsciss)) coordinates[0] += newAbsciss;
		//Si invalide, lancer exception
		else throw new IllegalArgumentException();
		//On v�rifie la validit� de l'ordinate APRES deplacement
		if(isValideCoordinate(coordinates[1]+newOrdinate)) coordinates[1] += newOrdinate;
		//Si onvalide, lancer exception
		else throw new IllegalArgumentException();
	}
	/*FIN AUTRES METHODES*/
}
