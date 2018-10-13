package datas;

public class CyclicCounter extends BoundedCounter implements Counting {
	
	//ATTRIBUTS
	//ajout personnel, Compteur de cycle (peut �tre n�gatif comme positif)
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
	/*PAS DE SETTERS (utilisation du setter m�re)*/
	/*TOSTRING*/
	public String toString() {
		return "Cycle = "+ getCycle() +", "+super.toString();
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Incr�menter le compteur de 1
	public void increase() {
		increase(1);
	}
	//Incr�menter le compteur d'une certaine quantit� (M�thode par d�faut, au lieu de faire une boucle d'incr�mentation de 1)
	public void increase(int quantity) {
		//Si le compteur d�passe le max
		if(getValue()+quantity > getMaxValue()) {
			//Ajouter des cycles au compteur de cycles (quantit� du compteur + quantit� ajout�e divis�e par la valeur max)
			cycleCount += (getValue()+quantity)/getMaxValue();
			//Mettre le compteur � la valeur modulo max+1 (le max �tant compris dans le compteur, le modulo doit �tre de 1 sup�rieur au max)
			setValue((getValue()+quantity)%(getMaxValue()+1));
		}
		//Sinon on incr�menter la quantit� voulue
		else super.increase(quantity);
	}
	//D�cr�menter le compteur de 1
	public void decrease() {
		decrease(1);
	}
	//D�cr�menter le compteur d'une certaine quantit� (M�thode par d�faut, au lieu de faire une boucle de d�cr�mentation de 1)
	public void decrease(int quantity) {
		//Si le compteur devient n�gatif
		if(getValue()-quantity < getMinValue()) {
			//Enlever des cycles au compteur de cycles (quantit� du compteur + quantit� enlev�e divis� par la valeur max)
			//IMPORTANT: enlever les valeurs additionn�es
			cycleCount -=((getMaxValue()+quantity)/getMaxValue());
			//Mettre le compteur � la valeur absolue de la valeur + le max, moins la quantit� modulo max-1 (le max �tant compris dans le compteur, le modulo doit �tre de 1 inf�rieur au max
			setValue(Math.abs(getValue()+getMaxValue()-(quantity%getMaxValue()-1)));
		}
		//Sinon d�cr�menter la quantit� voulue
		else super.decrease(quantity);
	}
	/*FIN AUTRES METHODES*/
}
