package tests;

import datas.*;

public class TestCounter {
	public static void main(String[] args) {
	Counter counter = new Counter();
	System.out.println(counter);
	try {
		counter.increase();
		System.out.println(counter);
		counter.increase(10);
		System.out.println(counter);
		counter.decrease(100);
		System.out.println(counter);
	} catch (LimitReachedException e) {e.printStackTrace();}

	}
}
