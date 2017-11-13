package Programa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/")
public class Rest {

    ProductManagerImpl pmi = ProductManagerImpl.getInstance();

    @GET
    @Path("/a")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTrack() {
        return "a";
    }

    @GET
    @Path("/got/{usuario}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPedidos(@PathParam("usuario") String usuario) {
        List<Pedido> lista = pmi.listadoPedidosUsuario(usuario);
        for(Pedido pedido: lista){

        }
    }

    @POST
    @Path("/nuevo/Pedido")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newTrack(Pedido pedido) {

        pmi.doPedido();
        return Response.status(201).entity("Pedido anadido").build();
    }
}
