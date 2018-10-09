package datas;

public class CyclicCounter extends BoundedCounter implements Counting {
	
	//ajout personnel, pas besoin de borner à 0 (le cycle peut être negatif)
	protected int cycleCount;
	
	/*CONSTRUCTEURS*/
	public CyclicCounter() {
		this(0, 60);
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
		if(getValue() == getMaxValue()) {
			setValue(0);
			cycleCount++;
		}
		else super.increase();
	}
	public void increase(int quantity) {
		if(getValue()+quantity > getMaxValue()) {
			cycleCount += (getValue()+quantity)/getMaxValue();
			setValue((getValue()+quantity)%getMaxValue());
		}
		else increase(quantity);
	}
	public void decrease() {
		if(getValue()==getMinValue()) {
			setValue(getMaxValue()-1);
			cycleCount--;
		}
	}
	public void decrease(int quantity) {
		if(getValue()-quantity < getMinValue()) {
			cycleCount -= (getValue()-quantity)/getMaxValue();
			setValue(Math.abs(getValue()-quantity)%getMaxValue());
		}
		else super.decrease(quantity);
	}
	public String toString() {
		return "Cycle = "+ getCycle() +", "+super.toString();
	}
	/*FIN MUTATEURS*/
}
