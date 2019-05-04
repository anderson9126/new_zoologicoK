/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;

import co.edu.konrad.zoologicok.DTO.ProgramacionDTO;
import co.edu.konrad.zoologicok.entity.ProgramacionEntity;
import co.edu.konrad.zoologicok.logic.ProgramacionLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author julian
 */

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/programaciones")
public class ProgramacionResource {
    @EJB
    private ProgramacionLogic programacionLogic;
    
    @GET
    public List<ProgramacionDTO> getProgramacionList(){
        List<ProgramacionEntity> programacion = programacionLogic.obtenerProgramaciones();
        return ProgramacionDTO.toProgramacionList(programacion);
    }
    
    @GET
    @Path("{id: \\d+}")
    public ProgramacionDTO getProgramacion(@PathParam("id") long id){
        ProgramacionEntity programacion = programacionLogic.obtenerProgramacionesPorId(id);
        if(programacion==null){
            throw new RuntimeException("La programacion solicitado no existe");
        }
        return new ProgramacionDTO(programacion);
    }
    
    @POST
    public ProgramacionDTO createProgramacion(ProgramacionDTO fdto){
        return new ProgramacionDTO(programacionLogic.crearProgramacion(fdto.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public ProgramacionDTO updateProgramacion(@PathParam("id") long id, ProgramacionDTO programacionDTO) throws IllegalAccessException{
        ProgramacionEntity programacionEntity = programacionLogic.obtenerProgramacionesPorId(id);
        if(programacionEntity == null){
            throw new RuntimeException("La programacion no existe.");
        }
        return new ProgramacionDTO(programacionLogic.actualizarProgramacion(programacionDTO.toEntity(), id));
    }
    
    @DELETE
    @Path("{ProgramacionId: \\d+}")
    public void deleteProgramacion(@PathParam("ProgramacionId") long id){
        ProgramacionEntity entity = programacionLogic.obtenerProgramacionesPorId(id);
        if(entity == null){
            throw new RuntimeException("La programacion solicitado no existe");
        }
        programacionLogic.eliminarProgramacion(id);
    }
}
