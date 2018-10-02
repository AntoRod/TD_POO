package datas;

public class Lucas {
	
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
		return lucasNumber[indice];
	}
	public int getLength() {
		return maxLucas;
	}
	/*FIN GETTERS*/
	/*MUTATEURS*/
	public void calculateReccurence() {
		int i=0;
		while(i<getLength()) {
			if(i==0) lucasNumber[i] = 2;
			else if(i==1) lucasNumber[i] = 1;
			else lucasNumber[i] = lucasNumber[i-1] + lucasNumber[i-2];
			i++;
		}
	}
	public String toString() {
		StringBuffer sf = new StringBuffer();
		sf.append("Tab size: "+getLength());
		for(int i=0; i<getLength(); i++) {
			if(i%10 == 0) sf.append("\n");
			sf.append(i+":["+lucasNumber[i]+"], ");
		}
		sf.append("\n");
		//return "Tab size: "+getLength()+ "\n";
		return sf.toString();
	}
	/*FIN MUTATEURS*/
}
