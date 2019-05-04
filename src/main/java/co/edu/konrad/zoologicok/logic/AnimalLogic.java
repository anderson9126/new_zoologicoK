/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.AnimalEntity;
import co.edu.konrad.zoologicok.persistence.AnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author nelso
 */
@Stateless
public class AnimalLogic {
    
    @Inject
    private AnimalPersistence persistence;
    
    public List<AnimalEntity> obtenerAnimales(){
        List<AnimalEntity> animales = persistence.findAll();
        return animales;
    }
    
    public AnimalEntity obtenerAnimalesPorId(long id){
        AnimalEntity animal = persistence.find(id);
        if(animal == null){
            throw new IllegalArgumentException("El animal solicitado no existe.");
        }
        return animal;
    }
    
    public AnimalEntity crearAnimal(AnimalEntity entity){
        persistence.create(entity);
        return entity;
    }
    
    public AnimalEntity actualizarAnimal(AnimalEntity entity, long id){
        AnimalEntity animal = persistence.update(entity);
        return entity;
    }
    
    public void eliminarAnimal(long id){
        persistence.delete(id);
    }
    
}
