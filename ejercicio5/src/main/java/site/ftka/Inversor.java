package site.ftka;

import java.util.ArrayList;
import java.util.List;

public class Inversor {

	private List<Inversion> inversiones = new ArrayList<>();

	public void agregarInversion(InversionAcciones inversion) {
		inversiones.add(inversion);
	}

	public void agregarInversion(InversionPlazoFijo inversion) {
		inversiones.add(inversion);
	}

	public double getTotalInvertido() {
		double resultado = 0.0;
		for (Inversion inv : inversiones) {
			resultado+= inv.getValorActual();
		}
		return resultado;
	}

}
