package org.acme.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.acme.BusinessRulesAgro;

@Path("/client")
public class ClientResource {

    @Inject
    BusinessRulesAgro businessRulesAgro;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/name")
    public Response getCompanyName() {
        return Response.ok(businessRulesAgro.getCompanyName()).build();
    }
}