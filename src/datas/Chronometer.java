package datas;

public class Chronometer {
	
	private CyclicCounter seconds;
	private CyclicCounter minutes;
	private CyclicCounter hours;
	
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
		if(seconds.getValue() == 59) {
			if(minutes.getValue() == 59) {
				if(hours.getValue() == 23) {
					resetChronometer();
				}
				hours.increase();
			}
			minutes.increase();
		}
		seconds.increase();
	}
	public void resetChronometer() {
		
	}
	
	public String toString() {
		return "Time: "+hours.getValue()+":"+minutes.getValue()+":"+seconds.getValue()+"";
	}

}
