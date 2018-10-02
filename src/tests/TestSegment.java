package tests;

import datas.*;

public class TestSegment {
	public static void main(String[] args) {
		Segment segment = new Segment(new Point(0,0), new Point(6,8));
		System.out.println(segment);
		segment.moveTo(new Point(10,5), new Point(15, 12));
		System.out.println(segment);
		segment.moveBy(4, 5, 6, 7);
		System.out.println(segment);
		
	}
}
