package site.ftka;

public class Producto {

	double pesoEnKilos = 0.0, precioPorKilo = 0.0;
	String descripcion = "";

	public Producto(String descripcion, double pesoEnKilos, double precioPorKilo) {
		this.pesoEnKilos = pesoEnKilos;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public double getPrecio() {
		return precioPorKilo * pesoEnKilos;
	}

	public double getPeso() {
		return pesoEnKilos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
}
