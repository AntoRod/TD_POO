package datas;

public class Segment {
	
	//ATTRIBUTS
	//Deux points servant de coordonnées au segment
	public Point firstPoint;
	public Point secondPoint;
	
	/*CONSTRUCTEURS*/
	public Segment() {
		this(0,0,0,0);
	}
	public Segment(Point startPoint, Point endPoint) {
		this(startPoint.getAbsciss(), startPoint.getOrdinate(), endPoint.getAbsciss(), endPoint.getOrdinate());
	}
	public Segment(int firstAbsciss, int firstOrdinate, int secondAbsciss, int secondOrdinate) {
		firstPoint = new Point(firstAbsciss, firstOrdinate);
		secondPoint = new Point(secondAbsciss, secondOrdinate);
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public Point getFirstPoint() {
		return firstPoint;
	}
	public Point getSecondPoint() {
		return secondPoint;
	}
	//Permet de retourner le calcul de la longueur du segment
	public double getLength() {
		double squareLength = Math.pow(firstPoint.getAbsciss()-secondPoint.getAbsciss(), 2)+Math.pow(firstPoint.getOrdinate()-secondPoint.getOrdinate(), 2);
		return Math.sqrt(squareLength);
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setFirstPoint(Point newPoint) {
		firstPoint = newPoint;
	}
	public void setSecondPoint(Point newPoint) {
		secondPoint = newPoint;
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		return "First Point: "+getFirstPoint()+"Second Point: "+getSecondPoint()+"Distance :"+getLength()+"\n";
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Déplacer le segment en un point précis
	public void moveTo(Point newFirstPoint, Point newSecondPoint) {
		setFirstPoint(newFirstPoint);
		setSecondPoint(newSecondPoint);
	}
	//Déplacer le segment de (x1, y1, x2, y2) coordonnées
	public void moveBy(int firstAbsciss, int firstOrdinate, int secondAbsciss, int secondOrdinate) {
		//Utulisation de la méthode de la classe Point pour déplacer les 2 points
		firstPoint.moveBy(firstAbsciss, firstOrdinate);
		secondPoint.moveBy(secondAbsciss, secondOrdinate);
	}
	/*FIN AUTRES METHODES*/
}
