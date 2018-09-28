package tests;

import datas.*;

public class TestCyclicCounter {
	public static void main(String[] args) {
		CyclicCounter cyclicCounter = new CyclicCounter();
		System.out.println(cyclicCounter);
		cyclicCounter.increase();
		System.out.println(cyclicCounter);
		cyclicCounter.increase(100);
		System.out.println(cyclicCounter);
		cyclicCounter.increase(1234);
		System.out.println(cyclicCounter);
		cyclicCounter.decrease(35);
		System.out.println(cyclicCounter);
		cyclicCounter.decrease(1200);
		System.out.println(cyclicCounter);
	}	
}
