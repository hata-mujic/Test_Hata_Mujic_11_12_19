package zadatak2;

public class Laptop extends Racunar{
	private double trajanjeBaterije;
	private double cijenaLaptopa;
	
	
	public Laptop(int kolicinaRama, double kapacitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena, double trajanjeBaterije, double cijenaLaptopa) {
		super(kolicinaRama, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;
		this.cijenaLaptopa = cijenaLaptopa;
	}
	public double getTrajanjeBaterije() {
		return trajanjeBaterije;
	}
	public void setTrajanjeBaterije(double trajanjeBaterije) {
		this.trajanjeBaterije = trajanjeBaterije;
	}
	public double getCijenaLaptopa() {
		return cijenaLaptopa;
	}
	public void setCijenaLaptopa(double cijenaLaptopa) {
		this.cijenaLaptopa = cijenaLaptopa;
	}

}
