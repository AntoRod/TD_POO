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
	public void increase(int quantity) {
		value+= quantity;
	}
	//D�cr�menter le compteur de 1
	public void decrease() throws LimitReachedException {
		//D�cr�menter seulement si le compteur est sup�rieur � 0
		if(value>minValue) value--;
		//Sinon lancer une LRE
		else throw new LimitReachedException("Counter already at minimal value, can't decrease anymore");
	}
	//D�cr�menter le compteur d'une certaine quantit� (avec gestion de LRE)
	public void decrease(int quantity) {
		//Si le compteur n'atteint pas 0, d�cr�menter
		if(value-quantity>=minValue) value-= quantity;
		//Sinon lancer et g�rer la LRE
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
				//On signal que la valeur a �t� modifi�e
				System.out.println("value has been set to minimum: "+this);
			}
		}
	}
	/*FIN AUTRES METHODES*/
}
