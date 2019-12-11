package zadatak2;

public class Racunar {
	private int kolicinaRama;
	private double kapacitetHD;
	private double brzinaProcesora;
	private double dijagonalaMonitora;
	private double nabavnaCijena;

	public Racunar(int kolicinaRama, double kapacitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena) {
		super();
		this.kolicinaRama = kolicinaRama;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}

	public int getKolicinaRama() {
		return kolicinaRama;
	}

	public void setKolicinaRama(int kolicinaRama) {
		this.kolicinaRama = kolicinaRama;
	}

	public double getKapacitetHD() {
		return kapacitetHD;
	}

	public void setKapacitetHD(double kapacitetHD) {
		this.kapacitetHD = kapacitetHD;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}

	public double getDijagonalaMonitora() {
		return dijagonalaMonitora;
	}

	public void setDijagonalaMonitora(double dijagonalaMonitora) {
		this.dijagonalaMonitora = dijagonalaMonitora;
	}

	public double getNabavnaCijena() {
		return nabavnaCijena;
	}

	public void setNabavnaCijena(double nabavnaCijena) {
		this.nabavnaCijena = nabavnaCijena;
	}

}
