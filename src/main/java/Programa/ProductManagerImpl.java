package Programa;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.*;

public class ProductManagerImpl implements ProductManager {

    private static ProductManagerImpl productManager = null;
    Queue<Pedido> colaPedidos;
    List<Producto> listaProductos;
    List<Pedido> pedidosServidos;

    private static final Logger logger = LogManager.getLogger(ProductManager.class.getName());

    public ProductManagerImpl() {
        BasicConfigurator.configure();

        listaProductos = new ArrayList<Producto>();
        pedidosServidos = new ArrayList<Pedido>();
        colaPedidos = new Queue<Pedido>(100);

    }

    public static ProductManagerImpl getInstance(){
        if(productManager == null){
            productManager = new ProductManagerImpl();
        }

        return productManager;

    }


    public List<Producto> ordenarProductosPrecio() {
        logger.info("lista inicial");
        for(Producto producto: listaProductos){
            logger.info(producto.getNombre());
        }

        List<Producto> listaProductosPrecio = new ArrayList<Producto>();
        listaProductosPrecio.addAll(listaProductos);

        Collections.sort(listaProductosPrecio, new Comparator<Producto>() {
            public int compare(Producto o1, Producto o2){
                return o1.getCoste() - o2.getCoste();
            }
        });

        logger.info("lista ordenada");
        for(Producto producto: listaProductosPrecio){
            logger.info(producto.getNombre());
        }

        return listaProductosPrecio;

    }

    public void doPedido(String nombreUsuario, List<Producto> productos, String nombrePedido) {

        logger.info(nombreUsuario);
        for(Producto producto: productos){
            logger.info(producto.getNombre());
        }

        Pedido pedido = new Pedido(nombreUsuario,nombrePedido);
        pedido.getListaProductos().addAll(productos);
        for (Producto producto: productos){
            producto.setNumComprado(producto.getNumComprado() + 1);
        }

        colaPedidos.push(pedido);

        logger.info(pedido);
    }

    public void servirPedido() {
        logger.info("lista pedidos");

        /*for(Pedido pedido: colaPedidos){
            logger.info(pedido.getNombre());
        }*/

        Pedido pedido = this.colaPedidos.pop();
        pedidosServidos.add(pedido);

        logger.info("lista servidos");

        /*for(Pedido pedido2: pedidosServidos){
            logger.info(pedido2.getNombre());
        }*/
    }

    public List<Pedido> listadoPedidosUsuario(String nombreUsuario) {

        logger.info(nombreUsuario);
        for(Pedido pedido: pedidosServidos){
            logger.info(pedido);
        }

        List<Pedido> listaPedidosUsuario = new ArrayList<Pedido>();
        for(Pedido pedido: pedidosServidos){
            if(pedido.getUsuario() == nombreUsuario){
                listaPedidosUsuario.add(pedido);
            }
        }

        logger.info(nombreUsuario);
        for(Pedido pedido: listaPedidosUsuario){
            logger.info(pedido);
        }

        return listaPedidosUsuario;
    }

    public List<Producto> listadoMasVendido() {

        logger.info("lista inicial");
        for(Producto producto: listaProductos){
            logger.info(producto.getNombre());
        }

        List<Producto> listaProductosOrdenada = new ArrayList<Producto>();
        listaProductosOrdenada.addAll(listaProductos);

        Collections.sort(listaProductosOrdenada, new Comparator<Producto>() {
            public int compare(Producto o1, Producto o2){
                return -o1.getNumComprado() + o2.getNumComprado();
            }
        });

        logger.info("lista ordenada");
        for(Producto producto: listaProductosOrdenada){
            logger.info(producto.getNombre());
        }

        return listaProductosOrdenada;
    }

    public void addProducto(Producto producto){

        listaProductos.add(producto);

    }

    public void clearAll(){

        listaProductos.clear();
        pedidosServidos.clear();

    }


}
