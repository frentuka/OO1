package site.ftka.oobnb;

/*
    Crear una reserva: Un usuario puede realizar una reserva para un período de tiempo determinado.
    Si la propiedad está disponible, se crea la reserva y la propiedad pasa a estar ocupada durante ese período.
    Si no lo está, la reserva no será creada.
 */

public class Reserva {

    private final Usuario usuario;
    private final DateLapse periodo;

    public Reserva(Usuario usuario, DateLapse periodo) {
        this.usuario = usuario;
        this.periodo = periodo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public DateLapse getPeriodo() {
        return periodo;
    }

    public double estimarPrecio(double precioPorNoche) {
        return getPeriodo().sizeInDays() * precioPorNoche;
    }

}