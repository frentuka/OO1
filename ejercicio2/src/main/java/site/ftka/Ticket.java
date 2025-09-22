package site.ftka;

import java.time.LocalDate;

public class Ticket {

	LocalDate fecha;
	int cantidadDeProductos;
	double pesoTotal, precioTotal;

	public Ticket(LocalDate fecha, int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.fecha = fecha;
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}

	public double impuesto() {
		return precioTotal * 0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
}
