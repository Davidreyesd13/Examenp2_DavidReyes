package examenp2_davidreyes;

import java.util.ArrayList;

public class Deporte {

    String nombre;
    ArrayList<Torneo> torneo;
    String periodo;

    public Deporte(String nombre, ArrayList<Torneo> torneo, String periodo) {
        this.nombre = nombre;
        this.torneo = torneo;
        this.periodo = periodo;
    }

    public Deporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getTorneo() {
        return torneo;
    }

    public void setTorneo(ArrayList<Torneo> torneo) {
        this.torneo = torneo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Deporte{" + "nombre=" + nombre + ", torneo=" + torneo + ", periodo=" + periodo + '}';
    }

}
