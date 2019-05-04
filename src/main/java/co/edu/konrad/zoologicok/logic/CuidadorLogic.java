/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.CuidadorEntity;
import co.edu.konrad.zoologicok.persistence.CuidadorPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author nelso
 */
@Stateless
public class CuidadorLogic {
    
    @Inject
    private CuidadorPersistence persistence;
    
    public List<CuidadorEntity> obtenerCuidadores(){
        List<CuidadorEntity> cuidadores = persistence.findAll();
        return cuidadores;
    }
    
    public CuidadorEntity obtenerCuidadorPorId(long id){
        CuidadorEntity entity = persistence.find(id);
        return entity;
    }
    
    public CuidadorEntity crearCuidador(CuidadorEntity entity){
        persistence.create(entity);
        return entity;
    }
    
    public CuidadorEntity actualizarCuidador(CuidadorEntity entity, long id){
        CuidadorEntity cuidador = persistence.update(entity);
        return entity;
    }
    
    public void eliminarCuidador(long id){
        persistence.delete(id);
    }
    
}
