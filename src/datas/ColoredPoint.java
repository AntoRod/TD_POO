package datas;


public class ColoredPoint extends Point{
	
	//ATTRIBUTS
	//String désignant la couleur du point (plus tard: mettre Java Color)
	private String color;
	
	/*CONSTRUCTEURS*/
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
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public String getColor() {
		return color;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setColor(String newColor) {
		color = newColor;
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		return super.toString()+ ", Color: "+getColor()+"";
	}
	/*FIN TOSTRING*/
	/*PAS D'AUTRES METHODES*/
}
