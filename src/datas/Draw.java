package datas;

import java.util.ArrayList;
import java.util.Iterator;

public class Draw {
	
	ArrayList<AbstractFigure> draw;
	
	public Draw() {
		draw = new ArrayList<AbstractFigure>();
	}
	
	public ArrayList<AbstractFigure> getDraw() {
		return draw;
	}
	public AbstractFigure getFigure(int indice) {
		return draw.get(indice);
	}
	public void addFigure(AbstractFigure newFigure) {
		draw.add(newFigure);
	}
	public void removeFigure(int indice) {
		if(!draw.get(indice).equals(null)) draw.remove(indice);
	}
	public double calculateSumArea() {
		double sum = 0;
		Iterator<AbstractFigure> iterator = draw.iterator();
		while(iterator.hasNext()) {
			sum+=iterator.next().calculateArea();
		}
		return sum;
	}
	public double calculateSumPerimeter() {
		double sum = 0;
		Iterator<AbstractFigure> iterator = draw.iterator();
		while(iterator.hasNext()) {
			sum+=iterator.next().calculatePerimeter();
		}
		return sum;
	}
	
	public String toString() {
		String string = "List:\n";
		Iterator<AbstractFigure> iterator = draw.iterator();
		while(iterator.hasNext()) {
			string+= "{"+iterator.next().toString()+"}";
		}
		string+="\n";
		return string;
	}

}
