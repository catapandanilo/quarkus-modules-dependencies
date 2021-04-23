package org.acme.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.acme.client.service.ClientService;

@Path("/client")
public class ClientResource {

    @Inject
    ClientService clientService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/company")
    public Response getCompanyName() {
        return Response.ok(clientService.getCompanyName()).build();
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("/all")
//    public Response getAllClients() {
//        return Response.ok(clientService.listAll()).build();
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response getIdClient(@PathParam("id") Long id) {
        return Response.ok(clientService.getNameById(id)).build();
    }
}