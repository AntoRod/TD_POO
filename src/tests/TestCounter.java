package tests;

import datas.*;

public class TestCounter {
	public static void main(String[] args) {
	//Test du compteur classic
	Counter counter = new Counter();
	System.out.println(counter);
	counter.increase();
	System.out.println(counter);
	counter.increase(10);
	System.out.println(counter);
	counter.decrease(100);
	System.out.println(counter);
	}
}
