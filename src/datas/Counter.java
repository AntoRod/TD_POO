package datas;

public class Counter implements Counting{
	
	//ATTRIBUTS
	//Compteur d'Entier Minoré par 0 (de façon absolue)
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
	//Incrémenter le compteur de 1
	public void increase() throws LimitReachedException {
		value++;
	}
	//Incrémenter le compteur d'une certaine quantité
	public void increase(int quantity) throws LimitReachedException {
		value+= quantity;
	}
	//Décrémenter le compteur de 1
	public void decrease() {
		//Décrémenter seulement si le compteur est supérieur à 0
		if(value>minValue) value--;
	}
	//Décrémenter le compteur d'une certaine quantité
	public void decrease(int quantity) {
		//Si le compteur n'atteint pas 0, décrémenter
		if(value-quantity>minValue) value-= quantity;
		//Sinon mettre à 0
		else value = minValue;
	}
	/*FIN AUTRES METHODES*/
}
