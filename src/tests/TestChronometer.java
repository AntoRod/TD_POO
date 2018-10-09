package tests;

import datas.*;

public class TestChronometer {
	public static void main(String[] args) {
		Chronometer chronometer = new Chronometer();//Mettre des valeurs pour tester plus rapidement (ou diminuer le Thread.sleep)
		System.out.println(chronometer);
		while(true) {
			try {
				Thread.sleep(1);
				chronometer.decrease();
				System.out.println(chronometer);
			} catch (InterruptedException e) {e.printStackTrace();}

		}
		
	}

}
