package site.ftka;

import java.time.LocalDate;

public class Mamifero {

    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;

    private Mamifero padre;
    private Mamifero madre;

    public Mamifero() {}

    public Mamifero(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getEspecie() {
        return especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    //
    //
    //

    public Mamifero getAbueloMaterno() {
        if (this.madre != null) {
            return this.madre.getPadre();
        }
        return null;
    }

    public Mamifero getAbuelaMaterna() {
        if (this.madre != null) {
            return this.madre.getMadre();
        }
        return null;
    }

    public Mamifero getAbueloPaterno() {
        if (this.padre != null) {
            return this.padre.getPadre();
        }
        return null;
    }

    public Mamifero getAbuelaPaterna() {
        if (this.padre != null) {
            return this.padre.getMadre();
        }
        return null;
    }

    public boolean tieneComoAncestroA(Mamifero mamifero) {
        if (this.equals(mamifero)) {
            return false;
        }

        if (this.padre != null) {
            if (this.padre.equals(mamifero)) {
                return true;
            }

            if (this.padre.tieneComoAncestroA(mamifero))
                return true;
        }

        if (this.madre != null) {
            if (this.madre.equals(mamifero)) {
                return true;
            }
            return this.madre.tieneComoAncestroA(mamifero);
        }

        return false;
    }
}
