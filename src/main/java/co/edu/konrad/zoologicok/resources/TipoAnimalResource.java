/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;

import co.edu.konrad.zoologicok.DTO.TipoAnimalDTO;
import co.edu.konrad.zoologicok.entity.TipoAnimalEntity;
import co.edu.konrad.zoologicok.logic.TipoAnimalLogic;
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
 * @author Acer
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/tipoAnimal")
public class TipoAnimalResource {
    
    @EJB
    private TipoAnimalLogic tipoAnimalLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<TipoAnimalDTO> getTipoAnimalList(){
        List <TipoAnimalEntity> tipoAnimal = tipoAnimalLogic.obtenerTipoAnimales();
        return TipoAnimalDTO.toTipoAnimalList(tipoAnimal);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public TipoAnimalDTO getTipoAnimal(@PathParam("id") Long id){
        TipoAnimalEntity tipoAnimal = tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if (tipoAnimal == null){
            throw new RuntimeException("El tipo de animal no existe");
        } 
        return new TipoAnimalDTO(tipoAnimal);
    }
    
    @POST
    public TipoAnimalDTO createTipoAnimal(TipoAnimalDTO tipoAnimalDTO){
        return new TipoAnimalDTO(tipoAnimalLogic.crearTipoAnimal(tipoAnimalDTO.toEntity()));
    }
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param tipoAnimalDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public TipoAnimalDTO updatTipoAnimal(@PathParam("id") Long id, TipoAnimalDTO tipoAnimalDTO){
        TipoAnimalEntity tipoAnimalEntity = tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if(tipoAnimalEntity == null){
            throw new RuntimeException("El tipo de animal no existe.");
        }
        return new TipoAnimalDTO(tipoAnimalLogic.actualizarTipoAnimal(tipoAnimalDTO.toEntity(), id));
    }
    
    @DELETE
    @Path("{tipoAnimalId: \\d+}")
    public void deleteTipoAnimal(@PathParam("tipoAnimalId") Long id){
        TipoAnimalEntity tipoAnimalEntity = tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if(tipoAnimalEntity == null){
            throw new RuntimeException("El tipo de animal no existe.");
        }
        tipoAnimalLogic.eliminarTipoAnimal(id);
    }
    
}
