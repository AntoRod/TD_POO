package datas;

public class Chronometer implements Counting{
	
	//ATTRIBUTS
	//Chronom�tre comprenant 3 Compteurs cycliques: secondes, minutes et heures
	private CyclicCounter seconds;
	private CyclicCounter minutes;
	private CyclicCounter hours;
	
	/*CONSTRUCTEURS*/
	public Chronometer() {
		seconds = new CyclicCounter(0,59);
		minutes = new CyclicCounter(0,59);
		hours = new CyclicCounter(0, 23);
	}
	public Chronometer(int startSeconds, int startMinutes, int startHours) {
		seconds = new CyclicCounter(startSeconds%59, 59);
		minutes = new CyclicCounter(startMinutes%59, 59);
		hours = new CyclicCounter(startHours%23, 23);
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public CyclicCounter getSeconds() {
		return seconds;
	}
	public CyclicCounter getMinutes() {
		return minutes;
	}
	public CyclicCounter getHours() {
		return hours;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setSeconds(int newSeconds) {
		seconds.setValue(newSeconds); //ON NE MODIFIE SURTOUT PAS LA VALEUR MAX
	}
	public void setMinutes(int newMinutes) {
		minutes.setValue(newMinutes);
	}
	public void setHours(int newHours) {
		hours.setValue(newHours);
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		return "Time: "+hours.getValue()+":"+minutes.getValue()+":"+seconds.getValue()+"";
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Incr�menter le compteur de 1
	public void increase() {
		//Si les secondes sont au max
		if(seconds.getValue() == seconds.getMaxValue()) {
			//Si les minutes sont au max
			if(minutes.getValue() == minutes.getMaxValue()) {
				//Incr�menter les heures de 1
				hours.increase();
			}
			//Sinon incr�menter les minutes de 1
			minutes.increase();
		}
		//Sinon incr�menter les secondes de 1
		seconds.increase();
	}
	//Incr�menter le compteur d'une certaine quantit�
	public void increase(int quantity) {
		//Boucle d'incr�mentation de 1
		while(quantity>0) {
			increase();
			quantity--;
		}
	}
	//D�cr�menter le compteur de 1
	public void decrease() {
		//Si les secondes sont au minimum
		if(seconds.getValue() == seconds.getMinValue()) {
			//Si les minutes sont au minimum
			if(minutes.getValue() == minutes.getMinValue()) {
				//D�cr�menter les heures de 1
				hours.decrease();
			}
			//Sinon d�cr�menter les minutes de 1
			minutes.decrease();
		}
		//Sinon d�cr�menter les secondes de 1
		seconds.decrease();
	}
	//D�cr�menter le compteur d'une certaine quantit�
	public void decrease(int quantity) {
		//Boucle de d�cr�mentation de 1
		while(quantity>0) {
			decrease();
			quantity--;
		}
	}
	/*FIN AUTRES METHODES*/
}
