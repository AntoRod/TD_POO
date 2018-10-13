package datas;

public abstract class AbstractFigure {
	
	//WIDTH = Radius (Cercle) & Width (Rectangle/Carr�)
	private double width;
	
	//getWidth et setWidth n�c�ssaires car attribut priv�
	public double getWidth() {
		return width;
	}
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	//M�thodes obligatoires pour chaque figure abstraite
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	

}
