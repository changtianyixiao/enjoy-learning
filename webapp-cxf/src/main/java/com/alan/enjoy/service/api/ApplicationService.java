package com.alan.enjoy.service.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
public interface ApplicationService {

    @Path("/app")
    @Consumes(MediaType.APPLICATION_JSON)
    @GET
    public Response update(@QueryParam("name") String name);

}
