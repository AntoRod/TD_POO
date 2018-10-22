package interfaces;

import exception.LimitReachedException;

public interface Counting {
	//Interface de comptage
	
	//Méthodes de comptage obligatoires (incrémenter, décrémenter)
	public void increase() throws LimitReachedException;
	public void increase(int quantity) throws LimitReachedException;
	public void decrease() throws LimitReachedException;
	public void decrease(int quantity) throws LimitReachedException;
}
