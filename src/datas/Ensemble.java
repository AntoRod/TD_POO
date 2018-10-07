package datas;

import java.util.*;

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
	public void setRandom(int startIndice, int endIndice) {
		if(startIndice >= 0 && startIndice <= endIndice && endIndice < maxPoint) {
			for(int i=startIndice;i<=endIndice;i++) {
				Random random = new Random();
				int rand = random.nextInt();
//R				ensemble[i] = new ColoredPoint(rand%20, rand%10, "none");
				ensemble[i] = new Point(rand%20, rand%10);
			}
		}
	}
	public void setRandom() {
		setRandom(0, maxPoint-1);
	}
	public String toString() {
		String string = "Ensemble: \n";
		for(int i=0;i<maxPoint;i++) {
			if(i%5==0) string+="\n";
			string+="{"+ensemble[i]+"}";
		}
		string+="\n";
		return string;
	}

}
