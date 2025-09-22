package site.ftka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {

	List<Producto> productos = new ArrayList<>();

	public List<Producto> getProductos() {
		return productos;
	}

	public void ponerEnCero() {
		productos.clear();
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	public Ticket emitirTicket() {
		return new Ticket(LocalDate.now(), getCantidadDeProductos(), getPesoTotal(), getPrecioTotal());
	}

	public double getPesoTotal() {
		double pesoTotal = 0.0;
		for (Producto producto : getProductos()) {
			pesoTotal+= producto.getPeso();
		}
		return pesoTotal;
	}

	public double getPrecioTotal() {
		double precioTotal = 0.0;
		for (Producto producto : getProductos()) {
			precioTotal+= producto.getPrecio();
		}


		return precioTotal;
	}

	public int getCantidadDeProductos() {
		return getProductos().size();
	}
}