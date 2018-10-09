package tests;

import datas.*;

public class TestCyclicCounter {
	public static void main(String[] args) {
		CyclicCounter cyclicCounter = new CyclicCounter(0, 99);
		System.out.println(cyclicCounter);
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {e.printStackTrace();}
			cyclicCounter.decrease(9);
			System.out.println(cyclicCounter);	
		}

	}	
}
