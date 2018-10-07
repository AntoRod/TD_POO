package datas;

public class Square extends AbstractFigure{

	public Square() {
		this(10);
	}
	public Square(int startWidth) {
		width = startWidth;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double calculatePerimeter() {
		return width*4;
	}
	public double calculateArea() {
		return width*width;
	}
	public String toString() {
		return getClass().getSimpleName()+": Width: "+getWidth();
	}
	
	

	
}
