/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;

import co.edu.konrad.zoologicok.DTO.CuidadorDTO;
import co.edu.konrad.zoologicok.entity.CuidadorEntity;
import co.edu.konrad.zoologicok.logic.CuidadorLogic;
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
@Path("/animal")
public class CuidadorResource {
    
    @EJB
    private CuidadorLogic cuidadorLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<CuidadorDTO> getCuidadorList(){
        List <CuidadorEntity> cuidadores = cuidadorLogic.obtenerCuidadores();
        return CuidadorDTO.toCuidadorList(cuidadores);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public CuidadorDTO getCuidador(@PathParam("id") Long id){
        CuidadorEntity cuidador = cuidadorLogic.obtenerCuidadorPorId(id);
        if (cuidador == null){
            throw new RuntimeException("El cuidador no existe");
        } 
        return new CuidadorDTO(cuidador);
    }
    
    @POST
    public CuidadorDTO createCuidador(CuidadorDTO cuidadorDTO){
        return new CuidadorDTO(cuidadorLogic.crearCuidador(cuidadorDTO.toEntity()));
    }
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public CuidadorDTO updatCuidador(@PathParam("id") Long id, CuidadorDTO cuidadorDTO){
        CuidadorEntity cuidadorEntity = cuidadorLogic.obtenerCuidadorPorId(id);
        if(cuidadorEntity == null){
            throw new RuntimeException("El cuidador no existe.");
        }
        return new CuidadorDTO(cuidadorLogic.actualizarCuidador(cuidadorDTO.toEntity(), id));
    }
    
    @DELETE
    @Path("{cuidadorId: \\d+}")
    public void deleteCuidador(@PathParam("cuidadorId") Long id){
        CuidadorEntity cuidadorEntity = cuidadorLogic.obtenerCuidadorPorId(id);
        if(cuidadorEntity == null){
            throw new RuntimeException("El cuidador no existe.");
        }
        cuidadorLogic.eliminarCuidador(id);
    }
    
}
