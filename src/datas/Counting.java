package datas;

public interface Counting {
	//Interface de comptage
	
	//M�thodes de comptage obligatoires (incr�menter, d�cr�menter)
	public void increase();
	public void increase(int quantity);
	public void decrease();
	public void decrease(int quantity);

}
