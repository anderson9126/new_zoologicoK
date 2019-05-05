/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;

import co.edu.konrad.zoologicok.DTO.EncargadoDTO;
import co.edu.konrad.zoologicok.entity.EncargadoEntity;
import co.edu.konrad.zoologicok.logic.EncargadoLogic;
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
 * @author ander
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/encargado")
public class EncargadoResource {
    @EJB
    private EncargadoLogic encargadoLogic;
    
     /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<EncargadoDTO> getEncargadoList(){
        List <EncargadoEntity> encargado =  encargadoLogic.ontenerEncargado();
        return EncargadoDTO.toEncargadoList(encargado);
    }
    
     /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public EncargadoDTO getEncargado(@PathParam("id") Long id){
        EncargadoEntity encargado = encargadoLogic.obtenerEncargadoporId(id);
        if (encargado == null){
            throw new RuntimeException("El encargado no existe");
        } 
        return new EncargadoDTO(encargado);
    }
    
     @POST
    public EncargadoDTO createEncargado(EncargadoDTO encargadoDTO){
        return new EncargadoDTO(encargadoLogic.crearEncargado(encargadoDTO.toEntity()));    
    }
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public EncargadoDTO updatEncargado(@PathParam("id") Long id, EncargadoDTO encargadoDTO){
        EncargadoEntity encargado = encargadoLogic.obtenerEncargadoporId(id);
        if(encargado == null){
            throw new RuntimeException("El encargado no existe.");
        }
        return new EncargadoDTO(encargadoLogic.atualizarEncargado(encargadoDTO.toEntity(), id));
    }
    
    @DELETE
    @Path("{encargadoId: \\d+}")
    public void deleteCuidador(@PathParam("encargadoId") Long id){
         EncargadoEntity encargado = encargadoLogic.obtenerEncargadoporId(id);
        if(encargado == null){
            throw new RuntimeException("El encargado no existe.");
        }
        encargadoLogic.eliminarEncargado(id);
    }
}
