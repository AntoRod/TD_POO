package datas;

public class CyclicCounter extends BoundedCounter implements Counting {
	
	//ajout personnel, pas besoin de borner � 0 (le cycle peut �tre negatif)
	private int cycleCount;
	
	/*CONSTRUCTEURS*/
	public CyclicCounter() {
		this(0, 59);
	}
	public CyclicCounter(int startNumber, int maxNumber) {
		super(startNumber, maxNumber);
		cycleCount = 0;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int getCycle() {
		return cycleCount;
	}
	/*FIN GETTERS*/
	/*MUTATEURS*/
	public void increase() {
		increase(1);
	}
	public void increase(int quantity) {
		if(getValue()+quantity > getMaxValue()) {
			cycleCount += (getValue()+quantity)/getMaxValue();
			setValue((getValue()+quantity)%(getMaxValue()+1));
		}
		else super.increase(quantity);
	}
	public void decrease() {
		decrease(1);
	}
	public void decrease(int quantity) {
		if(getValue()-quantity < getMinValue()) {
			cycleCount -=((getMaxValue()+quantity)/getMaxValue());
			setValue(Math.abs(getValue()+getMaxValue()-(quantity%getMaxValue()-1)));
		}
		else super.decrease(quantity);
	}	
	public String toString() {
		return "Cycle = "+ getCycle() +", "+super.toString();
	}
	/*FIN MUTATEURS*/
}
