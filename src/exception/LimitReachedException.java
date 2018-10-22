package exception;

public class LimitReachedException extends Exception{

	private static final long serialVersionUID = -7392473705096050673L;
	
	//Exception "limite atteinte"
	
	public LimitReachedException() {
		this(null);
	}
	public LimitReachedException(String message) {
		//Utilisation de "Super" pour lancer l'exception de la même façon que les autres (avec les variables par défaut)
		super(message);
	}
	/*FIN CONSTRUCTEURS*/
}
