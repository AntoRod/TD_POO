package datas;

import java.util.ArrayList;

public class Draw {
	
	ArrayList<AbstractFigure> draw;
	
	public Draw() {
		draw = new ArrayList<AbstractFigure>();
	}
	
	public AbstractFigure getFigure(int indice) {
		return draw.get(indice);
	}
	
	public void addFigure(AbstractFigure newFigure) {
		draw.add(newFigure);
	}


}
