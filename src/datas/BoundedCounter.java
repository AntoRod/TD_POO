package datas;

public class BoundedCounter extends Counter {
	
	protected static final int maxValue = 100;
	
	/*CONSTRUCTEURS*/
	public BoundedCounter() {
		this(0);
	}
	public BoundedCounter(int startNumber) {
		super(startNumber);
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
