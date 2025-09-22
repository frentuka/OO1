package site.ftka;

public class Consumo {

	private double kWh, kVArh;

	public Consumo(double kWh, double kVArh) {
		this.kWh = kWh;
		this.kVArh = kVArh;
	}

	public double getkWh() {
		return kWh;
	}

	public double getkVArh() {
		return kVArh;
	}

	public void setkWh(double kWh) {
		this.kWh = kWh;
	}

	public void setkVArh(double kVArh) {
		this.kVArh = kVArh;
	}
}