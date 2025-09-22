package site.ftka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

	LocalDate fecha;
	String cliente;

	List<Item> items = new ArrayList<>();

	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
	}

	public void agregarItem(Item item) {
		items.add(item);
	}

	public double calcularTotal() {
		double total = 0.0;
		for (Item i : items) {
			total+= i.costo();
		}
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
}
