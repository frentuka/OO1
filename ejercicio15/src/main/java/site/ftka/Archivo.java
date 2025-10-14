package site.ftka;

public class Archivo {

	private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamano() {
        return nombre.length();
    }
}
