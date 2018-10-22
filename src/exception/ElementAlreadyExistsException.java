package exception;

public class ElementAlreadyExistsException extends Exception{
	
	private static final long serialVersionUID = -526912133759244115L;
	
	//Exception "l'élement existe déjà"

	/*CONSTRUCTEURS*/
	public ElementAlreadyExistsException() {
		this(null);
	}
	public ElementAlreadyExistsException(String message) {
		//Utilisation de "Super" pour lancer l'exception de la même façon que les autres (avec les variables par défaut)
		super(message);
	}
	/*FIN CONSTRUCTEURS*/

}
