package datas;

public class Counter {
	
	protected int value;
	protected static final int minValue = 0;
	
	/*CONSTRUCTEURS*/
	public Counter() {
		this(0);
	}
	public Counter(int startNumber) {
		value = startNumber;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int getValue() {
		return value;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setValue(int newValue) {
		value = newValue;
	}
	/*FIN SETTERS*/
	/*MUTATEURS*/
	
	public void increase() {
		value++;
	}
	public void increase(int quantity) {
		value+= quantity;
	}
	public void decrease() {
		if(value>minValue) value--;
	}
	public void decrease(int quantity) {
		if(value-quantity>minValue) value-= quantity;
		else value = 0;
	}
	public String toString() {
		return "Value = "+ getValue() +"\n";
	}
	/*FIN MUTATEURS*/
}
