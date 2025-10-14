package site.ftka;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {

    private Carpeta inbox = new Carpeta("INBOX");
    private List<Carpeta> carpetas = new ArrayList<>();

    public Carpeta getInbox() {
        return inbox;
    }

    public Carpeta getCarpeta(String nombre) {
        return carpetas.stream().filter(c -> c.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public int espacioOcupado() {
        return inbox.getTamano() + carpetas.stream().mapToInt(Carpeta::getTamano).sum();
    }

    public List<Email> buscar(String clave) {
        List<Email> resultados = new ArrayList<>(inbox.buscar(clave));
        for (Carpeta carpeta : carpetas) {
            resultados.addAll(carpeta.buscar(clave));
        }
        return resultados;
    }

    public void agregarCarpeta(Carpeta carpeta) {
        carpetas.add(carpeta);
    }

}