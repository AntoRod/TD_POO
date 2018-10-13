package datas;

public class CyclicCounter extends BoundedCounter implements Counting {
	
	//ATTRIBUTS
	//ajout personnel, Compteur de cycle (peut être négatif comme positif)
	private int cycleCount;
	
	/*CONSTRUCTEURS*/
	public CyclicCounter() {
		this(0, 59);
	}
	public CyclicCounter(int startNumber, int maxNumber) {
		super(startNumber, maxNumber);
		cycleCount = 0;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int getCycle() {
		return cycleCount;
	}
	/*FIN GETTERS*/
	/*PAS DE SETTERS (utilisation du setter mère)*/
	/*TOSTRING*/
	public String toString() {
		return "Cycle = "+ getCycle() +", "+super.toString();
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Incrémenter le compteur de 1
	public void increase() {
		increase(1);
	}
	//Incrémenter le compteur d'une certaine quantité (Méthode par défaut, au lieu de faire une boucle d'incrémentation de 1)
	public void increase(int quantity) {
		//Si le compteur dépasse le max
		if(getValue()+quantity > getMaxValue()) {
			//Ajouter des cycles au compteur de cycles (quantité du compteur + quantité ajoutée divisée par la valeur max)
			cycleCount += (getValue()+quantity)/getMaxValue();
			//Mettre le compteur à la valeur modulo max+1 (le max étant compris dans le compteur, le modulo doit être de 1 supérieur au max)
			setValue((getValue()+quantity)%(getMaxValue()+1));
		}
		//Sinon on incrémenter la quantité voulue
		else super.increase(quantity);
	}
	//Décrémenter le compteur de 1
	public void decrease() {
		decrease(1);
	}
	//Décrémenter le compteur d'une certaine quantité (Méthode par défaut, au lieu de faire une boucle de décrémentation de 1)
	public void decrease(int quantity) {
		//Si le compteur devient négatif
		if(getValue()-quantity < getMinValue()) {
			//Enlever des cycles au compteur de cycles (quantité du compteur + quantité enlevée divisé par la valeur max)
			//IMPORTANT: enlever les valeurs additionnées
			cycleCount -=((getMaxValue()+quantity)/getMaxValue());
			//Mettre le compteur à la valeur absolue de la valeur + le max, moins la quantité modulo max-1 (le max étant compris dans le compteur, le modulo doit être de 1 inférieur au max
			setValue(Math.abs(getValue()+getMaxValue()-(quantity%getMaxValue()-1)));
		}
		//Sinon décrémenter la quantité voulue
		else super.decrease(quantity);
	}
	/*FIN AUTRES METHODES*/
}
