package datas;

public class Square extends AbstractFigure{

	public Square() {
		this(10);
	}
	public Square(int startWidth) {
		setWidth(startWidth);
	}
	
	public double getWidth() {
		return super.getWidth();
	}
	
	public void setWidth(double newWidth) {
		super.setWidth(newWidth);
	}
	
	public double calculatePerimeter() {
		return getWidth()*4;
	}
	public double calculateArea() {
		return getWidth()*getWidth();
	}
	public String toString() {
		return getClass().getSimpleName()+": Width: "+getWidth();
	}
}
