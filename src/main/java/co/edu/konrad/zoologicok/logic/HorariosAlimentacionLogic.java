/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.HorariosAlimentacionEntity;
import co.edu.konrad.zoologicok.persistence.HorariosAlimentacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author ander
 */
@Stateless
public class HorariosAlimentacionLogic {

    @Inject
    private HorariosAlimentacionPersistence persistence;

    public List<HorariosAlimentacionEntity> ontenerHorariosAlimentacion() {
        List<HorariosAlimentacionEntity> horarioalimentacion = persistence.findAll();
        return horarioalimentacion;
    }

    public HorariosAlimentacionEntity obtenerAlimentacionporId(long id) {
        HorariosAlimentacionEntity horariosaalimentacion = persistence.find(id);
        if (horariosaalimentacion == null) {
            throw new IllegalArgumentException("elhorario de alimentacion solicitado no exixte");
        }
        return horariosaalimentacion;
    }

    public HorariosAlimentacionEntity crearhorarioAlimentacion(HorariosAlimentacionEntity entity) {
        persistence.create(entity);
        return entity;
    }

    public HorariosAlimentacionEntity atualizarhorarioAlimentacion(HorariosAlimentacionEntity entity, long id) {
        HorariosAlimentacionEntity horarioalimentacion = persistence.update(entity);
        return horarioalimentacion;
    }

    public void eliminarHorarioalimentacion(long id) {
        persistence.delete(id);
    }

}
