package datas;

public class Counter implements Counting{
	
	//ATTRIBUTS
	//Compteur d'Entier Minor� par 0 (de fa�on absolue)
	private int value;
	private static final int minValue = 0;
	
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
	public int getMinValue() {
		return minValue;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setValue(int newValue) {
		value = newValue;
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		return "Value = "+ getValue();
	}
	/*FIN TOSTRING*/
	/*AUTERS METHODES*/
	//Incr�menter le compteur de 1
	public void increase() throws LimitReachedException {
		value++;
	}
	//Incr�menter le compteur d'une certaine quantit�
	public void increase(int quantity) throws LimitReachedException {
		value+= quantity;
	}
	//D�cr�menter le compteur de 1
	public void decrease() {
		//D�cr�menter seulement si le compteur est sup�rieur � 0
		if(value>minValue) value--;
	}
	//D�cr�menter le compteur d'une certaine quantit�
	public void decrease(int quantity) {
		//Si le compteur n'atteint pas 0, d�cr�menter
		if(value-quantity>minValue) value-= quantity;
		//Sinon mettre � 0
		else value = minValue;
	}
	/*FIN AUTRES METHODES*/
}
