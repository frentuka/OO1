package site.ftka;

import java.util.ArrayList;
import java.util.List;

public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos = new ArrayList<>();

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public String[] adjuntos() {
		return (String[]) archivos.stream().toArray();
	}
}
