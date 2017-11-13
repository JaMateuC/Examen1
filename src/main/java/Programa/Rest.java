package Programa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/")
public class Rest {

    @GET
    @Path("/a")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTrack() {
        return "a";
    }

    @GET
    @Path("/got/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public int getTrack(@PathParam("id") int id) {
        return 0;
    }

    @POST
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newTrack(int track) {
        return Response.status(201).entity("Track added in position").build();
    }
}
