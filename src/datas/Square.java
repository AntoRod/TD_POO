package datas;

public class Square extends AbstractFigure{

	//PAS D'ATTRIBUTS (Width = Width de la classe m�re)
	
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
	//Calcul du p�rim�tre du carr�
	public double calculatePerimeter() {
		//P�rim�tre = 4xL
		return getWidth()*4;
	}
	//Calcul de la surface du carr�
	public double calculateArea() {
		//Surface = L� (L*L)
		return getWidth()*getWidth();
	}
	/*FIN AUTRES METHODES*/
}
