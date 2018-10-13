package datas;

public class Circle extends AbstractFigure{

	//PAS D'ATTRIBUTS (Radius = Width de la classe mère)
	/*CONSTRUCTEURS*/
	public Circle() {
		this(10);
	}
	public Circle(double startRadius) {
		setRadius(startRadius);
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public double getRadius() {
		return super.getWidth();
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setRadius(double newRadius) {
		setWidth(newRadius);
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		return getClass().getSimpleName()+": Radius: "+getRadius();
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Calcul de la surface du cercle
	public double calculateArea() {
		//Surface = Pi*R²
		return getRadius()*getRadius()*Math.PI;
	}
	//Calcul du périmètre du cercle
	public double calculatePerimeter() {
		//Périmètre = 2Pi*R
		return 2*getRadius()*Math.PI;
	}
	/*FIN AUTRES METHODES*/
}
