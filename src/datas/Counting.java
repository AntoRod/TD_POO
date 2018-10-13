package datas;

public interface Counting {
	//Interface de comptage
	
	//Méthodes de comptage obligatoires (incrémenter, décrémenter)
	public void increase();
	public void increase(int quantity);
	public void decrease();
	public void decrease(int quantity);

}
