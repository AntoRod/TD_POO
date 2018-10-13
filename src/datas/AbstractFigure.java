package datas;

public abstract class AbstractFigure {
	
	//WIDTH = Radius (Cercle) & Width (Rectangle/Carré)
	private double width;
	
	//getWidth et setWidth nécéssaires car attribut privé
	public double getWidth() {
		return width;
	}
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	//Méthodes obligatoires pour chaque figure abstraite
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	

}
