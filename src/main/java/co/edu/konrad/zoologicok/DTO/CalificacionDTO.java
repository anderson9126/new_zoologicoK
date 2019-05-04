/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.CalificacionEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ander
 */
public class CalificacionDTO {

    private long idCalificacion;
    private long valorCalificacion;
    private String observacion;

    public CalificacionDTO() {
    }

    public CalificacionDTO(CalificacionEntity calificacion) {
        this.idCalificacion = calificacion.getIdCalificacion();
        this.valorCalificacion = calificacion.getValorCalificacion();
        this.observacion = calificacion.getObservacion();
    }

    public CalificacionEntity toEntity() {
        CalificacionEntity calificacionEntity = new CalificacionEntity();
        calificacionEntity.setIdCalificacion(this.idCalificacion);
        calificacionEntity.setValorCalificacion(this.valorCalificacion);
        calificacionEntity.setObservacion(this.observacion);
        return calificacionEntity;
    }
    
      public static List<CalificacionDTO> toCalificacionList(List<CalificacionEntity> calificacionList) {
        List<CalificacionDTO> listacalificacion = new ArrayList<>();
        for (int i = 0; i < calificacionList.size(); i++) {
            listacalificacion.add(new CalificacionDTO(calificacionList.get(i)));

        }
        return listacalificacion;
    }

    public long getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public long getValorCalificacion() {
        return valorCalificacion;
    }

    public void setValorCalificacion(long valorCalificacion) {
        this.valorCalificacion = valorCalificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    

}
