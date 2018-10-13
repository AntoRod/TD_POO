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
		//Super pour initialiser le nombre de départ de la même façon que la classe mère
		super(startNumber);
		maxValue = maxNumber;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int getMaxValue() {
		return maxValue;
	}
	/*FIN GETTERS*/
	/*PAS DE SETTERS (utilisation du setter mère)*/
	/*TOSTRING*/
	public String toString() {
		return super.toString()+"/"+maxValue+"\n";
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Incrémentation du compteur de 1  
	public void increase() {
		//Incrémentation de la classe mère utilisée
		if(getValue() < maxValue) super.increase();
	}
	//Incrémentation du compteur d'une certaine quantité
	public void increase(int quantity) {
		//Si le max est atteint, on met la valeur au maximum
		if(getValue() + quantity > maxValue) setValue(maxValue);
		//Sinon on incrémente de la quantité voulue
		else super.increase(quantity);
	}
	//Décrémentation du compteur de 1
	public void decrease() {
		//Décrémentation de la classe mère utilisée
		super.decrease();
	}
	//Décrémentation du compteur d'une certaine quantité
	public void decrease(int quantity) {
		//Décrémentation de la classe mère utilisée
		super.decrease(quantity);
	}
	/*FIN AUTRES METHODES*/
	
}
