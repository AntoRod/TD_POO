package tests;

import datas.*;

public class TestBoundedCounter {
	public static void main(String[] args) {
		BoundedCounter boundedCounter = new BoundedCounter(5,100);
		System.out.println(boundedCounter);
		boundedCounter.increase();
		System.out.println(boundedCounter);
		boundedCounter.increase(90);
		System.out.println(boundedCounter);
		boundedCounter.increase(100);
		System.out.println(boundedCounter);
		boundedCounter.decrease(1000);
		System.out.println(boundedCounter);
	}

	
}
