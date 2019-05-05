/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.CalificacionEntity;
import co.edu.konrad.zoologicok.persistence.CalificacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author ander
 */
@Stateless
public class CalificacionLogic {

    @Inject
    private CalificacionPersistence persistence;

    public List<CalificacionEntity> ontenerCalificacion() {
        List<CalificacionEntity> calificacion = persistence.findAll();
        return calificacion;
    }

    public CalificacionEntity obtenerCalificacionporId(long id) {
        CalificacionEntity calificacion = persistence.find(id);
        if (calificacion == null) {
            throw new IllegalArgumentException("la calificacion solicitada no existe");
        }
        return calificacion;
    }

    public CalificacionEntity creaCalificacion(CalificacionEntity entity) {
        persistence.create(entity);
        return entity;
    }

    public CalificacionEntity actualizarCalificacionEntity(CalificacionEntity entity, long id) {
        CalificacionEntity calificacion = persistence.update(entity);
        return calificacion;
    }

    public void eliminarCalificacion(long id) {
        persistence.delete(id);
    }

}
