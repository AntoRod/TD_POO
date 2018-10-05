package datas;

public class Ensemble {
	
	private Point[] ensemble;
	private int maxPoint;
	
	public Ensemble() {
		this(20);
	}
	public Ensemble(int pointMax) {
		maxPoint = pointMax;
		ensemble = new Point[maxPoint];
	}
	
	public Point[] getEnsemble() {
		return ensemble;
	}
	public Point getPoint(int indice) {
		if(indice < maxPoint) return ensemble[indice];
		else return null;
	}
	
	public void setPoint(int indice, Point newPoint) {
		if(indice < maxPoint) ensemble[indice] = newPoint;
	}
	public void setPoint(int indice, int newAbsciss, int newOrdinate) {
		setPoint(indice, new Point(newAbsciss, newOrdinate));
	}
	
	public String toString() {
		return "";
	}

}
