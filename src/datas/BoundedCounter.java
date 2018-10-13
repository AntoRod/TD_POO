package datas;

public class BoundedCounter extends Counter implements Counting {
	
	//ATTRIBUTS
	//La valeur maximale que le compteur peut atteindre
	private int maxValue;
	
	/*CONSTRUCTEURS*/
	public BoundedCounter() {
		this(0, 60);
	}
	public BoundedCounter(int startNumber, int maxNumber) {
		//Super pour initialiser le nombre de d�part de la m�me fa�on que la classe m�re
		super(startNumber);
		maxValue = maxNumber;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int getMaxValue() {
		return maxValue;
	}
	/*FIN GETTERS*/
	/*PAS DE SETTERS (utilisation du setter m�re)*/
	/*TOSTRING*/
	public String toString() {
		return super.toString()+"/"+maxValue+"\n";
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Incr�mentation du compteur de 1  
	public void increase() {
		//Incr�mentation de la classe m�re utilis�e
		if(getValue() < maxValue) super.increase();
	}
	//Incr�mentation du compteur d'une certaine quantit�
	public void increase(int quantity) {
		//Si le max est atteint, on met la valeur au maximum
		if(getValue() + quantity > maxValue) setValue(maxValue);
		//Sinon on incr�mente de la quantit� voulue
		else super.increase(quantity);
	}
	//D�cr�mentation du compteur de 1
	public void decrease() {
		//D�cr�mentation de la classe m�re utilis�e
		super.decrease();
	}
	//D�cr�mentation du compteur d'une certaine quantit�
	public void decrease(int quantity) {
		//D�cr�mentation de la classe m�re utilis�e
		super.decrease(quantity);
	}
	/*FIN AUTRES METHODES*/
	
}
