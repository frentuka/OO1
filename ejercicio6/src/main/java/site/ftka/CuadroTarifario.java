package site.ftka;

public class CuadroTarifario {

	private double precio_kWh, precio_kVArh;

	public CuadroTarifario(double precio_kWh, double precio_kVArh) {
		this.precio_kWh = precio_kWh;
		this.precio_kVArh = precio_kVArh;
	}

	public double getPrecio_kWh() {
		return precio_kWh;
	}

	public double getPrecio_kVArh() {
		return precio_kVArh;
	}

	public void setPrecio_kWh(double precio_kWh) {
		this.precio_kWh = precio_kWh;
	}

	public void setPrecio_kVArh(double precio_kVArh) {
		this.precio_kVArh = precio_kVArh;
	}
}
