package com.vignesh.app.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloApp {

    @GET
    @Path("{name}")
    public Response sayHelloToUser(@PathParam("name") String name) {
        return Response.status(200).entity("Hello "+ name).build();
    }
}
