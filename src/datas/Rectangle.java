package datas;

public class Rectangle extends AbstractFigure{
	
	private double length;
	
	public Rectangle() {
		this(10,10);
	}
	public Rectangle(double startWidth, double startLength) {
		width = startWidth;
		length = startLength;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	public void setLength(double newLength) {
		length = newLength;
	}
	
	public double calculatePerimeter() {
		return width*2+length*2;
	}
	public double calculateArea() {
		return width*length;
	}
	public String toString() {
		return getClass().getSimpleName()+": Width: "+getWidth()+", Length: "+getLength();
	}
}
