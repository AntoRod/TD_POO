package exception;

public class ElementAlreadyExistsException extends Exception{
	
	private static final long serialVersionUID = -526912133759244115L;
	
	//Exception "l'�lement existe d�j�"

	/*CONSTRUCTEURS*/
	public ElementAlreadyExistsException() {
		this(null);
	}
	public ElementAlreadyExistsException(String message) {
		//Utilisation de "Super" pour lancer l'exception de la m�me fa�on que les autres (avec les variables par d�faut)
		super(message);
	}
	/*FIN CONSTRUCTEURS*/

}
