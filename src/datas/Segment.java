package datas;

public class Segment {
	
	public Point firstPoint;
	public Point secondPoint;
	
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
	
	public Point getFirstPoint() {
		return firstPoint;
	}
	public Point getSecondPoint() {
		return secondPoint;
	}
	public double getLength() {
		double squareLength = Math.pow(firstPoint.getAbsciss()-secondPoint.getAbsciss(), 2)+Math.pow(firstPoint.getOrdinate()-secondPoint.getOrdinate(), 2);
		return Math.sqrt(squareLength);
	}
	
	public void setFirstPoint(Point newPoint) {
		firstPoint = newPoint;
	}
	public void setSecondPoint(Point newPoint) {
		secondPoint = newPoint;
	}
	
	public void moveTo(Point newFirstPoint, Point newSecondPoint) {
		firstPoint = newFirstPoint;
		secondPoint = newSecondPoint;
	}
	public String toString() {
		return "First Point: "+getFirstPoint()+"Second Point: "+getSecondPoint()+"Distance :"+getLength()+"\n";
	}
	
}
