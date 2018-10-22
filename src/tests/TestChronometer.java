package tests;

import java.util.Random;
import datas.*;
import exception.LimitReachedException;

public class TestChronometer {
	public static void main(String[] args) {
		Chronometer chronometer = new Chronometer();//Mettre des valeurs pour tester plus rapidement (ou diminuer le Thread.sleep)
		System.out.println(chronometer);
		

		
		while(true) {
			try {
				Boolean test = new Random().nextBoolean();
				Thread.sleep(1000);
				if(test) {
					chronometer.increase();
					System.out.print("INCREASED: ");
				}
				else {
					System.out.print("DECREASED: ");
					chronometer.decrease();
				}
				System.out.print(chronometer+"\n");
			} catch (InterruptedException e) {e.printStackTrace();}
			  catch (LimitReachedException e) {e.printStackTrace();}
		}
	}
}
