package datas;


public class ColoredPoint extends Point{
	
	private String color;
	
	public ColoredPoint() {
		this("white");
	}
	public ColoredPoint(String startColor) {
		this(0, 0, startColor);
	}
	public ColoredPoint(int startAbsciss, int startOrdinate, String startColor) {
		super(startAbsciss, startOrdinate);
		color = startColor;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String toString() {
		return super.toString()+ ", Color: "+getColor()+"";
	}

}
