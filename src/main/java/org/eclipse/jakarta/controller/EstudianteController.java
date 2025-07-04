package org.eclipse.jakarta.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.eclipse.jakarta.model.Estudiante;
import org.eclipse.jakarta.service.EstudianteService;

import java.util.List;

@Path("/estudiante")
public class EstudianteController {

    @Inject
    private EstudianteService estudianteServ;

    public EstudianteController(){

    }

    @GET
    @Produces("application/json")
    public Response getEstudiantes(){
        List<Estudiante> resp = this.estudianteServ.get();
        return Response.ok().status(Response.Status.OK).entity(resp).build();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response saveEstudiantes(Estudiante estudiante){
        Estudiante est = this.estudianteServ.save(estudiante);
        return Response.ok().status(Response.Status.OK).entity(est).build();
    }

    @Path("/{id}")
    @GET
    @Produces("application/json")
    public Response getEstudiante(@PathParam("id") int id){
        Estudiante resp = this.estudianteServ.get(id);
        return Response.ok().status(Response.Status.OK).entity(resp).build();
    }

    @Path("/{id}")
    @DELETE
    @Produces("application/json")
    public Response deleteEstudiante(@PathParam("id") int id){
        boolean resp = this.estudianteServ.deleteById(id);
        return Response.ok().status(Response.Status.OK).entity(resp).build();
    }

}
