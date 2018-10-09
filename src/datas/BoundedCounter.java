package datas;

public class BoundedCounter extends Counter implements Counting {
	
	private int maxValue;
	
	/*CONSTRUCTEURS*/
	public BoundedCounter() {
		this(0, 60);
	}
	public BoundedCounter(int startNumber, int maxNumber) {
		super(startNumber);
		maxValue = maxNumber;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int getMaxValue() {
		return maxValue;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	//NONE
	/*FIN SETTERS*/
	/*MUTATEURS*/
	public void increase() {
		if(getValue() < maxValue) super.increase();
	}
	public void increase(int quantity) {
		if(getValue() + quantity > maxValue) setValue(maxValue);
		else super.increase(quantity);
	}
	public void decrease() {
		super.decrease();
	}
	public void decrease(int quantity) {
		super.decrease(quantity);
	}
	
	public String toString() {
		return super.toString()+"/"+maxValue+"\n";
	}
	/*FIN MUTATEURS*/
	
}
