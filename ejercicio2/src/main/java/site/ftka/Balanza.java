package site.ftka;

import java.time.LocalDate;
import java.util.Date;

public class Balanza {

	int cantidadDeProductos;
	double precioTotal, pesoTotal;

	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0.0;
		pesoTotal = 0.0;
	}

	public void agregarProducto(Producto p) {
		pesoTotal+= p.pesoEnKilos;
		precioTotal+= p.getPrecio();
		cantidadDeProductos+= 1;
	}

	public Ticket emitirTicket() {
		return new Ticket(LocalDate.now(), cantidadDeProductos, pesoTotal, precioTotal);
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
}