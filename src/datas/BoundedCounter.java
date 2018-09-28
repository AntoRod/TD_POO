package datas;

public class BoundedCounter extends Counter {
	
	protected int maxValue;
	
	/*CONSTRUCTEURS*/
	public BoundedCounter() {
		this(0, 60);
	}
	public BoundedCounter(int startNumber, int maxNumber) {
		super(startNumber);
		maxValue = maxNumber;
	}
	/*FIN CONSTRUCTEURS*/
	/*MUTATEURS*/
	public void increase() {
		if(value<maxValue) value++;
	}
	public void increase(int quantity) {
		if(value+quantity>maxValue) value = maxValue;
		else value+= quantity;
	}
	public String toString() {
		return "Value = "+ getValue() +"/"+maxValue+"\n";
	}
	/*FIN MUTATEURS*/
	
}
