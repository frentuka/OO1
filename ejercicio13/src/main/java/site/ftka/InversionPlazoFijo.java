package site.ftka;

import java.time.LocalDate;

public class InversionPlazoFijo implements Inversion {

	private LocalDate fechaInicio;
	private double montoDepositado;
	private float porcentajeInteresDiario;

	public InversionPlazoFijo(LocalDate fechaInicio, double montoDepositado, float porcentajeInteresDiario) {
		this.fechaInicio = fechaInicio;
		this.montoDepositado = montoDepositado;
		this.porcentajeInteresDiario = porcentajeInteresDiario;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public float getPorcentajeInteresDiario() {
		return porcentajeInteresDiario;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public void setPorcentajeInteresDiario(float porcentajeInteresDiario) {
		this.porcentajeInteresDiario = porcentajeInteresDiario;
	}

	public double getValorActual() {
		int diasTranscurridos = fechaInicio.until(LocalDate.now()).getDays();
		float multiplicadorInteres = 1 + porcentajeInteresDiario/100;
		return montoDepositado * Math.pow(multiplicadorInteres, diasTranscurridos);
	}
}
