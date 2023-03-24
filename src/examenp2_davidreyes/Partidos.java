package examenp2_davidreyes;

public class Partidos {

    String nombre1, nombre2;
    int result1, result2;

    public Partidos(String nombre1, String nombre2, int result1, int result2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.result1 = result1;
        this.result2 = result2;
    }

    public Partidos() {
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getResult1() {
        return result1;
    }

    public void setResult1(int result1) {
        this.result1 = result1;
    }

    public int getResult2() {
        return result2;
    }

    public void setResult2(int result2) {
        this.result2 = result2;
    }

    @Override
    public String toString() {
        return "Partidos{" + "nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", result1=" + result1 + ", result2=" + result2 + '}';
    }

}
