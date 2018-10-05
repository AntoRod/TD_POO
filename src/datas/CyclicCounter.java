package datas;

public class CyclicCounter extends BoundedCounter{
	
	//ajout personnel, pas besoin de borner à 0
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
		if(value==maxValue) {
			value = 0;
			cycleCount++;
		}
		else value++;
	}
	public void increase(int quantity) {
		if(value+quantity > maxValue) {
			cycleCount += (value+quantity)/maxValue;
			value = (value+quantity)%maxValue;
		}
		else value += quantity;
	}
	public void decrease() {
		if(value==minValue) {
			value=maxValue-1;
			cycleCount--;
		}
	}
	public void decrease(int quantity) {
		if(value-quantity < minValue) {
			cycleCount -= (value-quantity)/maxValue;
			value = Math.abs(value-quantity)%maxValue;
		}
		else value-=quantity;
	}
	public String toString() {
		return "Cycle = "+ getCycle() +super.toString();
	}
	/*FIN MUTATEURS*/
}
