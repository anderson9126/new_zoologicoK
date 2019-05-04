/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.ProgramacionEntity;
import co.edu.konrad.zoologicok.persistence.ProgramacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
/**
 *
 * @author julian
 */
@Stateless
public class ProgramacionLogic {
    @Inject
    private ProgramacionPersistence persistence;
    
    public List<ProgramacionEntity> obtenerProgramaciones(){
        List<ProgramacionEntity> programaciones = persistence.findAll();
        return programaciones;
    }
    
    public ProgramacionEntity obtenerProgramacionesPorId(long id){
        ProgramacionEntity programacion = persistence.find(id);
        if(programacion == null){
            throw new IllegalArgumentException("La programación solicitada no existe.");
        }
        return programacion;
    }
    
    public ProgramacionEntity crearProgramacion(ProgramacionEntity entity){
        persistence.create(entity);
        return entity;
    }
    
    public ProgramacionEntity actualizarProgramacion(ProgramacionEntity entity, long id){
        ProgramacionEntity programacion = persistence.update(entity);
        return entity;
    }
    
    public void eliminarProgramacion(long id){
        persistence.delete(id);
    }
}