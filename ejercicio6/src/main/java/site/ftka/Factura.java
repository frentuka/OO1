package site.ftka;

import java.time.LocalDate;

public class Factura {

	private final Usuario usuario;
	private final Consumo consumo;
	private final LocalDate fechaEmision;
	private final CuadroTarifario cuadroTarifario;
	private final double bonificacion;
	private final double montoFinal;

	public Factura(Usuario usuario, Consumo consumo, CuadroTarifario cuadroTarifario) {
		this.usuario = usuario;
		this.consumo = consumo;
		this.fechaEmision = LocalDate.now();
		this.cuadroTarifario = cuadroTarifario;

		bonificacion = cuadroTarifario.getPrecio_kVArh() * consumo.getkVArh();
		montoFinal = cuadroTarifario.getPrecio_kWh() * consumo.getkWh() - bonificacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public CuadroTarifario getCuadroTarifario() {
		return cuadroTarifario;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public double getMontoFinal() {
		return montoFinal;
	}
}
