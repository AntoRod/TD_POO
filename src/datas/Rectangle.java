package datas;

public class Rectangle extends AbstractFigure{
	
	//ATTRIBUTS
	//Longueur du rectangle (Largeur = Width de la classe mère)
	private double length;
	
	/*CONSTRUCTEURS*/
	public Rectangle() {
		this(10,10);
	}
	public Rectangle(double startWidth, double startLength) {
		setWidth(startWidth);
		setLength(startLength);
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public double getWidth() {
		return super.getWidth();
	}
	public double getLength() {
		return length;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setWidth(double newWidth) {
		super.setWidth(newWidth);
	}
	public void setLength(double newLength) {
		length = newLength;
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		return getClass().getSimpleName()+": Width: "+getWidth()+", Length: "+getLength();
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Calcul du périmètre du rectangle
	public double calculatePerimeter() {
		//Périmètre = *L+*l
		return getWidth()*2+getLength()*2;
	}
	//Calcul de la surface du rectangle
	public double calculateArea() {
		//Surface = L*l
		return getWidth()*getLength();
	}
	/*FIN AUTRES METHODES*/
}
