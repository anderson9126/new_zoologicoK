/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;



import co.edu.konrad.zoologicok.DTO.CalificacionDTO;
import co.edu.konrad.zoologicok.entity.CalificacionEntity;
import co.edu.konrad.zoologicok.logic.CalificacionLogic;
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
@Path("/calificacion")
public class CalificacionResource {
    
     @EJB
    private CalificacionLogic calificacionLogic;
      /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
     public List<CalificacionDTO> getCalificacionList(){
        List <CalificacionEntity> calificacion = calificacionLogic.ontenerCalificacion();
        return CalificacionDTO.toCalificacionList(calificacion);
    }
     /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
       @GET
    @Path("{id: \\d+}")
    public CalificacionDTO getCalificacion(@PathParam("id") Long id){
        CalificacionEntity calificacion = calificacionLogic.obtenerCalificacionporId(id);
        if (calificacion == null){
            throw new RuntimeException("la calificacion no existe");
        } 
        return new CalificacionDTO(calificacion);
    }
     @POST
    public CalificacionDTO createCalificacion(CalificacionDTO calificacionDTO){
        return new CalificacionDTO(calificacionLogic.creaCalificacion(calificacionDTO.toEntity()));
    }
    
    
     /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public CalificacionDTO updatCalificacion(@PathParam("id") Long id, CalificacionDTO calificacionDTO){
        CalificacionEntity calificacionEntity = calificacionLogic.obtenerCalificacionporId(id);
        if(calificacionEntity == null){
            throw new RuntimeException("la calificacion no existe.");
        }
        return new CalificacionDTO(calificacionLogic.actualizarCalificacionEntity(calificacionDTO.toEntity(),id));
    }
    @DELETE
    @Path("{calificacionId: \\d+}")
    public void deleteCalificacion(@PathParam("calificacionId") Long id){
        CalificacionEntity calificacionEntity = calificacionLogic.obtenerCalificacionporId(id);
        if(calificacionEntity == null){
            throw new RuntimeException("la calificacion no existe.");
        }
        calificacionLogic.eliminarCalificacion(id);
    }
     
}
