package site.ftka.oobnb;

import java.time.LocalDate;
import java.util.List;

/*
    Cada usuario posee propiedades que desea alquilar, de las cuales se guarda
    la dirección, un nombre descriptivo y el precio que se desea cobrar por noche.
    Además, los usuarios pueden realizar reservas sobre cualquiera de las propiedades disponibles.
 */
public class Propiedad {

    private String nombre;
    private Direccion direccion;
    private double precio;
    private List<Reserva> reservasPendientes;
    private List<Reserva> reservasTotales;

    public Propiedad(String nombre, Direccion direccion, double precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public List<Reserva> getReservasPendientes() {
        return reservasPendientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*
        Consultar la disponibilidad de una propiedad en un período específico:
        dada una propiedad, una fecha inicial y una fecha final, se debe determinar si la propiedad está disponible el período indicado.
     */

    public boolean estaDisponible(DateLapse periodo) {
        return reservasPendientes.stream().allMatch(reserva -> {
            return !reserva.getPeriodo().overlaps(periodo);
        });
    }

    /*
        Calcular el precio de una reserva: Dada una reserva, se debe poder calcular su precio.
        El mismo se obtiene multiplicando la cantidad de noches por el precio por noche.
     */

    public double calcularPrecio(Reserva reserva) {
        return reserva.getPeriodo().sizeInDays() * precio;
    }

    /*
        Crear una reserva: Un usuario puede realizar una reserva para un período de tiempo determinado.
        Si la propiedad está disponible, se crea la reserva y la propiedad pasa a estar ocupada durante ese período.
        Si no lo está, la reserva no será creada.
     */

    public Reserva reservar(Usuario usuario, DateLapse periodo) {
        if (!estaDisponible(periodo))
            return null;

        Reserva reserva = new Reserva(usuario, periodo);
        reservasPendientes.add(reserva);
        reservasTotales.add(reserva);

        return reserva;
    }

    /*
        Cancelar una reserva: Se debe permitir cancelar una reserva.
        En este caso, la propiedad pasa a estar disponible durante el período de tiempo indicado en la reserva.
        Esta operación sólo es permitida si el período de la reserva no está en curso.
     */

    public boolean cancelar_reserva(LocalDate now, Reserva r) {
        if (r.getPeriodo().includesDate(now))
            return false;

        if (reservasPendientes.remove(r)) {
            reservasTotales.remove(r);
            return true;
        }

        return false;
    }

    /*
        Calcular los ingresos de un propietario: Se debe calcular la retribución a un propietario,
        la cual es el 75% de la suma de precio totales de las reservas incluidas en un período específico de tiempo.
     */

    // calcula ingresos de la propiedad. la retribución se calcula en el propietario
    public double calcularIngresos(DateLapse periodo) {
        double total = 0;

        for (Reserva r : reservasTotales) {
            if (r.getPeriodo().overlaps(periodo))
                total+= r.estimarPrecio(getPrecio());
        }

        return total;
    }

}
