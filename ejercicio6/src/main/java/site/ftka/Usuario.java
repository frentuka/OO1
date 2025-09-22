package site.ftka;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	public class Domicilio {
		String pais, provincia, ciudad, calle, departamento;
		int alturaCalle, codigoPostal;
	}

	private String nombre;
	private Domicilio domicilio;
	private final List<Consumo> consumos = new ArrayList<>();

	public Usuario(String nombre, Domicilio domicilio, Consumo consumoInicial) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		registrarConsumo(consumoInicial);
	}

	public List<Consumo> getConsumos() {
		return consumos;
	}

	public void registrarConsumo(Consumo consumo) {
		this.consumos.add(consumo);
	}

	public String getNombre() {
		return nombre;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	/**
	 *  Devolverá la factura correspondiente al último consumo.
	 *  Devolverá null si no existen facturas.
	 */
	public Factura emitirFactura(CuadroTarifario cuadroTarifario) {
		if (!consumos.isEmpty())
			return new Factura(this, consumos.getLast(), cuadroTarifario);
		else
			return null;
	}
}
