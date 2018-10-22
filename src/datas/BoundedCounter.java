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
	public void increase() throws LimitReachedException {
		//Si la valeur n'est pas au maximum, incrémentation (de la classe mère)
		if(getValue() < maxValue) super.increase();
		//Sinon lancer une LRE
		else throw new LimitReachedException("Counter already at maximal value, can't increase anymore");
	}
	//Incrémentation du compteur d'une certaine quantité
	public void increase(int quantity) {
		//Si la limite maximum est atteinte, lancer et gérer une LRE
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
				//On signal que la valeur a été modifiée
				System.out.println("value has been set to maximum: "+this);
			}
		}
		//Sinon, incrémentation (de la classe mère)
		else super.increase(quantity);
	}
	/*FIN AUTRES METHODES*/
	
}
