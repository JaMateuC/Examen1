package Programa;

import java.util.List;

public interface ProductManager {

    List<Producto> ordenarProductosPrecio();
    void doPedido(String nombreUsuario, List<Producto> productos, String nombrePedido);
    void servirPedido();
    List<Pedido> listadoPedidosUsuario(String nombreUsuario);
    List<Producto> listadoMasVendido();

}
