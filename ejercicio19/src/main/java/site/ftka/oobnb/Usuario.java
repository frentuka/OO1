package site.ftka.oobnb;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    /*
        De los usuarios se conoce el nombre, la dirección y el DNI.
        Cada usuario posee propiedades que desea alquilar
        Además, los usuarios pueden realizar reservas sobre cualquiera de las propiedades disponibles.
     */

    private final String nombre;
    private final Direccion direccion;
    private final int dni;
    private final List<Propiedad> propiedades = new ArrayList<>();

    public Usuario(String nombre, Direccion direccion, int dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getDNI() {
        return dni;
    }

    public boolean registrarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    /*
        Calcular los ingresos de un propietario: Se debe calcular la retribución a un propietario,
        la cual es el 75% de la suma de precio totales de las reservas incluidas en un período específico de tiempo.
     */

    public double calcularIngresos(DateLapse periodo) {
        double total = 0;

        for (Propiedad p : propiedades) {
            total+= p.calcularIngresos(periodo);
        }

        return total * 0.75;
    }

}