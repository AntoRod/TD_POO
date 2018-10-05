package tests;

import datas.*;

public class TestColoredPoint {
	public static void main(String[] args) {
		ColoredPoint coloredPoint = new ColoredPoint(10, 17, "Green");
		System.out.println("Color "+coloredPoint);
		coloredPoint.setCoordinates(13, 29);
		System.out.println("Color "+coloredPoint);
		coloredPoint.setColor("Black");
		System.out.println("Color "+coloredPoint);
		Point point = new Point(10, 10);
		System.out.println("Basic "+point);
		point = new ColoredPoint(19, -16, "Grey");
		System.out.println("Basic "+point);
	}
}
