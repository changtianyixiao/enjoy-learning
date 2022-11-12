package com.alan.enjoy.service.provider;

import com.alan.enjoy.service.api.ApplicationService;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

@Service("applicationService")
public class ApplicationServiceProvider implements ApplicationService {
    @Override
    public Response update(String name) {
        System.out.println("------------" + name);
        return Response.ok().entity("Hello " + name).build();
    }
}
