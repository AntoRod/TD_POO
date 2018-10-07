package tests;

import datas.*;

public class TestEnsemble {
	public static void main(String[] args) {
		Ensemble ensemble = new Ensemble(20);
		System.out.println(ensemble);
		ensemble.setRandom();
		System.out.println(ensemble);
		ensemble.setPoint(5, 10, 59);
		System.out.println(ensemble);
	}

}
