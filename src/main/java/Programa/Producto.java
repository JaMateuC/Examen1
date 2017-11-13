package Programa;

public class Producto {

    private int numComprado = 0;
    private int coste;
    private String nombre;

    public Producto(int coste, String nombre) {
        this.coste = coste;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public int getNumComprado() {
        return numComprado;
    }

    public void setNumComprado(int numComprado) {
        this.numComprado = numComprado;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
