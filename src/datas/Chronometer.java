package datas;

public class Chronometer implements Counting{
	
	private CyclicCounter seconds;
	private CyclicCounter minutes;
	private CyclicCounter hours;
	
	public Chronometer() {
		seconds = new CyclicCounter(0,5);
		minutes = new CyclicCounter(0,5);
		hours = new CyclicCounter(0, 2);
	}
	public Chronometer(int startSeconds, int startMinutes, int startHours) {
		seconds = new CyclicCounter(startSeconds%59, 59);
		minutes = new CyclicCounter(startMinutes%59, 59);
		hours = new CyclicCounter(startHours%23, 23);
	}
	
	public CyclicCounter getSeconds() {
		return seconds;
	}
	public CyclicCounter getMinutes() {
		return minutes;
	}
	public CyclicCounter getHours() {
		return hours;
	}
	
	public void setSeconds(int newSeconds) {
		seconds.setValue(newSeconds); //ON NE MODIFIE SURTOUT PAS LA VALEUR MAX
	}
	public void setMinutes(int newMinutes) {
		minutes.setValue(newMinutes);
	}
	public void setHours(int newHours) {
		hours.setValue(newHours);
	}
	public void increase() {
		if(seconds.getValue() == seconds.getMaxValue()) {
			if(minutes.getValue() == minutes.getMaxValue()) {
				hours.increase();
			}
			minutes.increase();
		}
		seconds.increase();
	}
	public void increase(int quantity) {
		while(quantity>0) {
			increase();
			quantity--;
		}
	}
	public void decrease() {
		if(seconds.getValue() == seconds.getMinValue()) {
			if(minutes.getValue() == minutes.getMinValue()) {
				hours.decrease();
			}
			minutes.decrease();
		}
		seconds.decrease();
	}
	public void decrease(int quantity) {
		while(quantity>0) {
			decrease();
			quantity--;
		}
	}
	public String toString() {
		return "Time: "+hours.getValue()+":"+minutes.getValue()+":"+seconds.getValue()+"";
	}

}
