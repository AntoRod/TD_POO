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
			counter.decrease(101);
			System.out.println(counter);
			counter.decrease();
			System.out.print(counter);
		} catch (LimitReachedException e) {System.out.println(e.getLocalizedMessage());}
	}
}
