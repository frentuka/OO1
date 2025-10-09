package site.ftka;

public abstract class Pieza {

	private String material;
	private String color;

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	public abstract double getVolumen();
	public abstract double getSuperficie();
}