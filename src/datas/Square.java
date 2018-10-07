package datas;

public class Square extends Rectangle{

	public Square() {
		super();
	}
	public Square(int startWidth) {
		super(startWidth, startWidth);
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
		return super.toString();
	}
	
	

	
}
