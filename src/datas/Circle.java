package datas;

public class Circle extends AbstractFigure{

	
	public Circle() {
		this(10);
	}
	public Circle(double startRadius) {
		width = startRadius;
	}
	
	public double getRadius() {
		return width;
	}
	
	public void setRadius(double newRadius) {
		width = newRadius;
	}
	
	public double calculateArea() {
		return width*width*Math.PI;
	}
	public double calculatePerimeter() {
		return 2*width*Math.PI;
	}
	public String toString() {
		return getClass().getSimpleName()+": Radius: "+getRadius();
	}

}
