package datas;

public class Lucas {
	
	//ATTRIBUTS
	//Tableau de int et un nomvre de int max dans le tableau
	private int[] lucasNumber;
	private int maxLucas;
	
	/*CONSTRUCTEURS*/
	public Lucas() {
		this(20);
	}
	public Lucas(int maxLucasNumber) {
		lucasNumber = new int[maxLucasNumber];
		maxLucas = maxLucasNumber;
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public int[] getLucas() {
		return lucasNumber;
	}
	public int getLucas(int indice) {
		if(indice < maxLucas) return lucasNumber[indice];
		else return -1;
	}
	public int getLength() {
		return maxLucas;
	}
	/*FIN GETTERS*/
	/*PAS DE SETTERS*/
	/*TOSTRING*/
	public String toString() {
		String string = new String();
		string+=("Tab size: "+getLength());
		for(int i=0; i<getLength(); i++) {
			if(i%10 == 0) string+=("\n");
			string+=(i+":["+lucasNumber[i]+"], ");
		}
		string+=("\n");
		return string;
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Calcul par réccurence le nombre du Ième entier (Un+2 = Un+1 + Un)
	public void calculateReccurence() {
		//On utilise une boucle pour calculer chaque nombre
		int i=0;
		while(i<getLength()) {
			//Si i = 0, nombre = 2
			if(i==0) lucasNumber[i] = 2;
			//Sinon si i = 1, nombre = 1
			else if(i==1) lucasNumber[i] = 1;
			//Sinon i = Un-1 + Un-2
			else lucasNumber[i] = lucasNumber[i-1] + lucasNumber[i-2];
			i++;
		}
	}
	/*FIN AUTRES METHODES*/
}
