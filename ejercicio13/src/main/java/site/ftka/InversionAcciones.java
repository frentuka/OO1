package site.ftka;

public class InversionAcciones implements Inversion {

	Accion accion;
	private int cantidad;

	public InversionAcciones(Accion accion, int cantidad) {
		this.accion = accion;
		this.cantidad = cantidad;
	}

	public String getNombreAccion() {
		return accion.getNombre();
	}

	public double getValorUnitario() {
		return accion.getValorUnitario();
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Accion getAccion() {
		return accion;
	}

	@Override
	public double getValorActual() {
		return accion.getValorUnitario() * this.getCantidad();
	}
}
