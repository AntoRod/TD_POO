package tests;

import datas.*;

public class TestPoint {
	public static void main(String[] args) {
		Point point = new Point(5,1);
		System.out.println(point);		
		point.setAbsciss(12);
		System.out.println(point);
		point.setOrdinate(-47);
		System.out.println(point);
		point.setCoordinates(17, -12);
		System.out.println(point);
	}
}
