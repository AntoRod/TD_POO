package tests;

import datas.*;

public class TestFigure {
	public static void main(String[] args) {
		Square square = new Square(15);
		Rectangle rectangle = new Rectangle(15,10);
		Circle circle = new Circle(2);
		System.out.println(square);
		System.out.println(rectangle);
		System.out.println(circle);
		double calcul = square.calculateArea();
		System.out.println(calcul);
		calcul = rectangle.calculateArea();
		System.out.println(calcul);
		calcul = circle.calculateArea();
		System.out.println(calcul);
		calcul = square.calculatePerimeter();
		System.out.println(calcul);
		calcul = rectangle.calculatePerimeter();
		System.out.println(calcul);
		calcul = circle.calculatePerimeter();
		System.out.println(calcul);
	}
}
