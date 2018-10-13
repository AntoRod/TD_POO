package datas;

public class Rectangle extends AbstractFigure{
	
	private double length;
	
	public Rectangle() {
		this(10,10);
	}
	public Rectangle(double startWidth, double startLength) {
		setWidth(startWidth);
		setLength(startLength);
	}
	
	public double getWidth() {
		return super.getWidth();
	}
	public double getLength() {
		return length;
	}
	
	public void setWidth(double newWidth) {
		super.setWidth(newWidth);
	}
	public void setLength(double newLength) {
		length = newLength;
	}
	
	public double calculatePerimeter() {
		return getWidth()*2+getLength()*2;
	}
	public double calculateArea() {
		return getWidth()*getLength();
	}
	public String toString() {
		return getClass().getSimpleName()+": Width: "+getWidth()+", Length: "+getLength();
	}
}
