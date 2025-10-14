package site.ftka;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {

    private final String nombre;
    private final List<Email> emails = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmail(Email email) {
        emails.add(email);
    }

    public void eliimnarEmail(Email email) {
        emails.remove(email);
    }

    public void mover(Email email, Carpeta destino) {
        destino.agregarEmail(email);
    }

    public int getTamano() {
        return nombre.length() + emails.stream().mapToInt(Email::getTamano).sum();
    }

    public List<Email> buscar(String clave) {
        List<Email> resultados = new ArrayList<>();
        for (Email email : emails) {
            if (email.getTitulo().contains(clave) || email.getCuerpo().contains(clave)) {
                resultados.add(email);
            }
        }
        return resultados;
    }

}
