/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.TipoAnimalEntity;
import co.edu.konrad.zoologicok.persistence.TipoAnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author nelso
 */
@Stateless
public class TipoAnimalLogic {
    
    @Inject
    private TipoAnimalPersistence persistence;
    
    public List<TipoAnimalEntity> obtenerTipoAnimales(){
        List<TipoAnimalEntity> tipoAnimales = persistence.findAll();
        return tipoAnimales;
    }
    
    public TipoAnimalEntity obtenerTipoAnimalPorId(long id){
        TipoAnimalEntity tipoAnimal = persistence.find(id);
        return tipoAnimal;
    }
    
    public TipoAnimalEntity crearTipoAnimal(TipoAnimalEntity entity){
        persistence.create(entity);
        return entity;
    }
    
    public TipoAnimalEntity actualizarTipoAnimal(TipoAnimalEntity entity, long id){
        TipoAnimalEntity tipoAnimal = persistence.update(entity);
        return tipoAnimal;
    }
    
    public void eliminarTipoAnimal(long id){
        persistence.delete(id);
    }
    
}
