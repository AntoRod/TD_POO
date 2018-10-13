package datas;

public class ElementAlreadyExistsException extends Exception{

	private static final long serialVersionUID = 1L;
	
	//Exception "l'�lement existe d�j�"
	
	/*CONSTRUCTEURS*/
	public ElementAlreadyExistsException() {
		this(null);
	}
	ElementAlreadyExistsException(String message) {
		//Utilisation de "Super" pour lancer l'exception de la m�me fa�on que les autres (avec les variables par d�faut)
		super(message);
	}
	/*FIN CONSTRUCTEURS*/

}
