package tests;

import datas.*;

public class TestDraw {
	public static void main(String[] args) {
		Draw draw = new Draw();
		System.out.print(draw);
		draw.addFigure(new Square(10));
		draw.addFigure(new Square(20));
		draw.addFigure(new Square(30));
		System.out.print(draw);
		double sum = 0;
		sum = draw.calculateSumArea();
		System.out.print(sum+"\n");
		sum = draw.calculateSumPerimeter();
		System.out.print(sum+"\n");
		draw.addFigure(new Circle(14.2));
		System.out.print(draw);
		draw.addFigure(new Rectangle(7.1, 4.15));
		System.out.print(draw);
		sum = draw.calculateSumArea();
		System.out.print(sum+"\n");
		sum = draw.calculateSumPerimeter();
		System.out.print(sum+"\n");
	}
}
