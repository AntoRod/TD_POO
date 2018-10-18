package datas;

public class Square extends AbstractFigure{

	//PAS D'ATTRIBUTS (Width = Width de la classe mère)
	
	/*CONSTRUCTEURS*/
	public Square() {
		this(10);
	}
	public Square(int startWidth) {
		setWidth(startWidth);
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public double getWidth() {
		return super.getWidth();
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setWidth(double newWidth) {
		super.setWidth(newWidth);
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		return getClass().getSimpleName()+": Width: "+getWidth();
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Calcul du périmètre du carré
	public double calculatePerimeter() {
		//Périmètre = 4xL
		return getWidth()*4;
	}
	//Calcul de la surface du carré
	public double calculateArea() {
		//Surface = L² (L*L)
		return getWidth()*getWidth();
	}
	/*FIN AUTRES METHODES*/
}
