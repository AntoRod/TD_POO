package tests;

import datas.*;

public class TestPoint {
	public static void main(String[] args) {
		try {
			Point point = new Point(501,1);
			System.out.println(point);		
			point.setAbsciss(12);
			System.out.println(point);
			point.setOrdinate(-47);
			System.out.println(point);
			point.setCoordinates(17, -12);
			System.out.println(point);
			point.moveBy(10, -4);
			System.out.println(point);
		} catch(IllegalArgumentException e) {e.printStackTrace();}

	}
}
