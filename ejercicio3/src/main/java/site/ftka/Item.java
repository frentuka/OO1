package site.ftka;

public class Item {

	String detalle;
	int cantidad;
	double costoUnitario;

	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}

	public double costo() {
		return cantidad*costoUnitario;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getDetalle() {
		return detalle;
	}
}
