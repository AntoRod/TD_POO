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
	public void increase(int quantity) {
		value+= quantity;
	}
	//Décrémenter le compteur de 1
	public void decrease() throws LimitReachedException {
		//Décrémenter seulement si le compteur est supérieur à 0
		if(value>minValue) value--;
		//Sinon lancer une LRE
		else throw new LimitReachedException("Counter already at minimal value, can't decrease anymore");
	}
	//Décrémenter le compteur d'une certaine quantité (avec gestion de LRE)
	public void decrease(int quantity) {
		//Si le compteur n'atteint pas 0, décrémenter
		if(value-quantity>=minValue) value-= quantity;
		//Sinon lancer et gérer la LRE
		else {
			try {
				//On lance l'exception
				throw new LimitReachedException("Counter can't be decrease by "+quantity);
				//On attrape l'exception
			} catch (LimitReachedException e) {
				//On affiche l'erreur
				System.out.println(e.getLocalizedMessage());
				//On modifie la valeur du compteur
				setValue(getMinValue());
				//On signal que la valeur a été modifiée
				System.out.println("value has been set to minimum: "+this);
			}
		}
	}
	/*FIN AUTRES METHODES*/
}
