/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;

import co.edu.konrad.zoologicok.DTO.ShowDTO;
import co.edu.konrad.zoologicok.entity.ShowEntity;
import co.edu.konrad.zoologicok.logic.ShowLogic;
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
@Path("/shows")
public class ShowResource {
    @EJB
    private ShowLogic showLogic;
    
    @GET
    public List<ShowDTO> getShowList(){
        List<ShowEntity> show = showLogic.obtenerShows();
        return ShowDTO.toShowList(show);
    }
    
    @GET
    @Path("{id: \\d+}")
    public ShowDTO getShow(@PathParam("id") long id){
        ShowEntity show = showLogic.obtenerShowsPorId(id);
        if(show==null){
            throw new RuntimeException("El show solicitado no existe");
        }
        return new ShowDTO(show);
    }
    
    @POST
    public ShowDTO createShow(ShowDTO fdto){
        return new ShowDTO(showLogic.crearShow(fdto.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public ShowDTO updateProgramacion(@PathParam("id") long id, ShowDTO showDTO) throws IllegalAccessException{
        ShowEntity showEntity = showLogic.obtenerShowsPorId(id);
        if(showEntity == null){
            throw new RuntimeException("El show no existe.");
        }
        return new ShowDTO(showLogic.actualizarShow(showDTO.toEntity(), id));
    }
    
    @DELETE
    @Path("{ShowId: \\d+}")
    public void deleteProgramacion(@PathParam("ShowId") long id){
        ShowEntity entity = showLogic.obtenerShowsPorId(id);
        if(entity == null){
            throw new RuntimeException("El show solicitado no existe");
        }
        showLogic.eliminarShow(id);
    }
}
