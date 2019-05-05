/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;

import co.edu.konrad.zoologicok.DTO.HorariosAlimentacionDTO;
import co.edu.konrad.zoologicok.entity.HorariosAlimentacionEntity;
import co.edu.konrad.zoologicok.logic.HorariosAlimentacionLogic;
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
@Path("/horario")
public class HorariosAlimentacionResource {
    
    @EJB
    private HorariosAlimentacionLogic horarioalimentacionLogic;
    
    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
     @GET
    public List<HorariosAlimentacionDTO> getHorarioAlimentacionList(){
        List <HorariosAlimentacionEntity> horarioalimentacion = horarioalimentacionLogic.ontenerHorariosAlimentacion();
        return HorariosAlimentacionDTO.toHorarioAlimentacionList(horarioalimentacion);
    }
    
     /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
     @GET
    @Path("{id: \\d+}")
    public HorariosAlimentacionDTO getHorariosAlimentacion(@PathParam("id") Long id){
        HorariosAlimentacionEntity horarioalimentacion = horarioalimentacionLogic.obtenerAlimentacionporId(id);
        if (horarioalimentacion == null){
            throw new RuntimeException("El horario alimentacion no existe");
        } 
        return new HorariosAlimentacionDTO(horarioalimentacion);
    }
    
     @POST
    public HorariosAlimentacionDTO createHorariosAlimentacion(HorariosAlimentacionDTO horarioalimentacionDTO){
        return new HorariosAlimentacionDTO(horarioalimentacionLogic.crearhorarioAlimentacion(horarioalimentacionDTO.toEntity()));
    }
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public HorariosAlimentacionDTO updatHorariosAlimentacion(@PathParam("id") Long id, HorariosAlimentacionDTO horarioalimentacionDTO){
        HorariosAlimentacionEntity horarioalimentacionEntity =horarioalimentacionLogic.obtenerAlimentacionporId(id); 
        if(horarioalimentacionEntity == null){
            throw new RuntimeException("El horario alimentacion no existe.");
        }
        return new HorariosAlimentacionDTO(horarioalimentacionLogic.atualizarhorarioAlimentacion(horarioalimentacionDTO.toEntity(), id));
    }
    
    @DELETE
    @Path("{horarioalimentacionId: \\d+}")
    public void deleteCuidador(@PathParam("horarioalimentacionId") Long id){
        HorariosAlimentacionEntity horarioalimentacionEntity = horarioalimentacionLogic.obtenerAlimentacionporId(id); 
        if(horarioalimentacionEntity == null){
            throw new RuntimeException("El horario alimentacion no existe.");
        }
        horarioalimentacionLogic.eliminarHorarioalimentacion(id);
    }
  
}
