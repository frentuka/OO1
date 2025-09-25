package org.example;

import java.util.ArrayList;
import java.util.List;

public class Farola {

    private boolean encendida = false;
    private List<Farola> conexiones = new ArrayList<>();

    public Farola() {}
    public Farola(boolean encendida) {
        this.encendida = encendida;
    }

    public void pairWithNeighbor(Farola farola) {
        if (!conexiones.contains(farola)) {
            this.conexiones.add(farola);
            farola.pairWithNeighbor(this);
        }
    }

    public List<Farola> getNeighbors() {
        return conexiones;
    }

    public boolean isOn() {
        return encendida;
    }

    public boolean isOff() {
        return !encendida;
    }

    public void turnOn() {
        if (encendida) return;

        this.encendida = true;

        for (Farola farola : conexiones) {
            farola.turnOn();
        }
    }

    public void turnOff() {
        if (!encendida) return;

        this.encendida = false;

        for (Farola farola : conexiones) {
            farola.turnOff();
        }
    }

}
