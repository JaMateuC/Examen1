import Programa.ProductManager;
import Programa.ProductManagerImpl;
import Programa.Producto;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test {

    ProductManagerImpl pmi = null;

    @Before
    public void setUp(){
        pmi = ProductManagerImpl.getInstance();
    }

    @After
    public void tearDown(){
       // pmi.clearAll();
    }

    @org.junit.Test
    public void testOrdenarProductosPrecio(){

        pmi.addProducto(new Producto(20,"c"));
        pmi.addProducto(new Producto(3,"a"));
        pmi.addProducto(new Producto(5,"b"));

        pmi.ordenarProductosPrecio();
    }

    @org.junit.Test
    public void testDoPedido(){

        pmi.addProducto(new Producto(20,"c"));
        pmi.addProducto(new Producto(3,"a"));
        pmi.addProducto(new Producto(5,"b"));
        List<Producto> list1 = new ArrayList<Producto>();
        list1.add(new Producto(20,"c"));
        list1.add(new Producto(3,"a"));
        pmi.doPedido("alb", list1, "lista");

    }

    @org.junit.Test
    public void testServirPedido(){

        pmi.addProducto(new Producto(20,"c"));
        pmi.addProducto(new Producto(3,"a"));
        pmi.addProducto(new Producto(5,"b"));
        List<Producto> list1 = new ArrayList<Producto>();
        list1.add(new Producto(20,"c"));
        list1.add(new Producto(3,"a"));
        pmi.doPedido("alb", list1, "lista");
        pmi.servirPedido();

    }

    @org.junit.Test
    public void testListadoPedidosUsuario(){

        pmi.addProducto(new Producto(20,"c"));
        pmi.addProducto(new Producto(3,"a"));
        pmi.addProducto(new Producto(5,"b"));
        List<Producto> list1 = new ArrayList<Producto>();
        list1.add(new Producto(20,"c"));
        list1.add(new Producto(3,"a"));
        List<Producto> list2 = new ArrayList<Producto>();
        list1.add(new Producto(20,"c"));
        pmi.doPedido("alb", list1, "lista");
        pmi.doPedido("aaa", list2, "lista2");
        pmi.servirPedido();
        pmi.servirPedido();
        pmi.listadoPedidosUsuario("alb");


    }

    @org.junit.Test
    public void testlistadoMasVendido(){

        pmi.addProducto(new Producto(20,"c"));
        pmi.addProducto(new Producto(3,"a"));
        pmi.addProducto(new Producto(5,"b"));



    }

}
