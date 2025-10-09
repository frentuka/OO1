package site.ftka;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {

	private List<Pieza> piezas = new ArrayList<>();

	public double volumenDeMaterial(String material) {
		double volumen = 0.0;
		for (Pieza pieza : piezas) {
			if (pieza.getMaterial().equals(material))
				volumen += pieza.getVolumen();
		}
		return volumen;
	}

	public double superficieDeColor(String color) {
		double superficie = 0.0;
		for (Pieza pieza : piezas) {
			if (pieza.getColor().equals(color))
				superficie += pieza.getSuperficie();
		}
		return superficie;
	}

}
