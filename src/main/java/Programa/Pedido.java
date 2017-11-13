package Programa;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Producto> listaProductos;
    private String usuario;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido(String usuario, String nombre) {
        this.usuario = usuario;
        this.nombre = nombre;
        listaProductos = new ArrayList<Producto>();
    }

    public Pedido() {

        listaProductos = new ArrayList<Producto>();

    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString(){
        return "NombreUsuario:" + usuario + ", NombrePedido:" + nombre;
    }
}
