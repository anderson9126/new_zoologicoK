/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;

import co.edu.konrad.zoologicok.DTO.LugarDTO;
import co.edu.konrad.zoologicok.entity.LugarEntity;
import co.edu.konrad.zoologicok.logic.LugarLogic;
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
@Path("/lugares")
public class LugarResource {
    @EJB
    private LugarLogic lugarLogic;
    
    @GET
    public List<LugarDTO> getLugarList(){
        List<LugarEntity> lugar = lugarLogic.obtenerLugares();
        return LugarDTO.toLugarList(lugar);
    }
    
    @GET
    @Path("{id: \\d+}")
    public LugarDTO getLugar(@PathParam("id") long id){
        LugarEntity lugar = lugarLogic.obtenerLugaresPorId(id);
        if(lugar==null){
            throw new RuntimeException("El Lugar solicitado no existe");
        }
        return new LugarDTO(lugar);
    }
    
    @POST
    public LugarDTO createLugar(LugarDTO fdto){
        return new LugarDTO(lugarLogic.crearLugar(fdto.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public LugarDTO updateLugar(@PathParam("id") long id, LugarDTO lugarDTO) throws IllegalAccessException{
        LugarEntity lugarEntity = lugarLogic.obtenerLugaresPorId(id);
        if(lugarEntity == null){
            throw new RuntimeException("El lugar no existe.");
        }
        return new LugarDTO(lugarLogic.actualizarLugar(lugarDTO.toEntity(), id));
    }
    
    @DELETE
    @Path("{LugarId: \\d+}")
    public void deleteLugar(@PathParam("LugarId") long id){
        LugarEntity entity = lugarLogic.obtenerLugaresPorId(id);
        if(entity == null){
            throw new RuntimeException("El lugar solicitado no existe");
        }
        lugarLogic.eliminarLugar(id);
    }
}