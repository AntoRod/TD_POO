package datas;

import exception.LimitReachedException;
import interfaces.Counting;

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
	public void increase() throws LimitReachedException {
		//Si la valeur n'est pas au maximum, incr�mentation (de la classe m�re)
		if(getValue() < maxValue) super.increase();
		//Sinon lancer une LRE
		else throw new LimitReachedException("Counter already at maximal value, can't increase anymore");
	}
	//Incr�mentation du compteur d'une certaine quantit�
	public void increase(int quantity) {
		//Si la limite maximum est atteinte, lancer et g�rer une LRE
		if(getValue() + quantity > maxValue) {
			try {
				//On lance l'exception
				throw new LimitReachedException("Can't increase by "+quantity+", Limit would be exceeded");
				//On attrape l'exception
			} catch (LimitReachedException e) {
				//On affiche l'erreur
				System.out.println(e.getLocalizedMessage());
				//On modifie la valeur du compteur
				setValue(getMaxValue());
				//On signal que la valeur a �t� modifi�e
				System.out.println("value has been set to maximum: "+this);
			}
		}
		//Sinon, incr�mentation (de la classe m�re)
		else super.increase(quantity);
	}
	/*FIN AUTRES METHODES*/
	
}
