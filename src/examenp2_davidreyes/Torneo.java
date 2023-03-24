package examenp2_davidreyes;

import java.util.ArrayList;

public class Torneo {

    String nombre;
    ArrayList<Equipo> equip;
    ArrayList<Partidos> partid;

    public Torneo(String nombre, ArrayList<Equipo> equip, ArrayList<Partidos> partid) {
        this.nombre = nombre;
        this.equip = equip;
        this.partid = partid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquip() {
        return equip;
    }

    public void setEquip(ArrayList<Equipo> equip) {
        this.equip = equip;
    }

    public ArrayList<Partidos> getPartid() {
        return partid;
    }

    public void setPartid(ArrayList<Partidos> partid) {
        this.partid = partid;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", equip=" + equip + ", partid=" + partid + '}';
    }

    
}
