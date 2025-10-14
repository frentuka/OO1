package site.ftka;

import java.util.ArrayList;
import java.util.List;

public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos = new ArrayList<>();

    public Email(String titulo, String nombre, List<Archivo> archivosAdjuntos) {
        this.titulo = titulo;
        this.cuerpo = nombre;
        if (archivosAdjuntos != null) {
            this.archivos.addAll(archivosAdjuntos);
        }
    }

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public List<Archivo> adjuntos() {
		return List.copyOf(archivos); // read-only
	}

    public int getTamano() {
        return titulo.length() + cuerpo.length() + archivos.stream().mapToInt(Archivo::getTamano).sum();
    }
}