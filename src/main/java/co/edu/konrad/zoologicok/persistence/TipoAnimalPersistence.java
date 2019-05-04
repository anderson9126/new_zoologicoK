/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.persistence;

import co.edu.konrad.zoologicok.entity.TipoAnimalEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Nelson Fonseca
 */

@Stateless
public class TipoAnimalPersistence {
    
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;
    
    public List<TipoAnimalEntity> findAll(){
        Query q = em.createQuery("select ta from TipoAnimalEntity ta");
        return q.getResultList();
    }
    
    /*Metodo para buscar un objeto en la tabla TipoAnimal*/
    public TipoAnimalEntity find(long id){
        return em.find(TipoAnimalEntity.class, id);
    }
    
    /*Metodo para insercion de un objeto en la tabla TipoAnimal*/
    public TipoAnimalEntity create(TipoAnimalEntity ta){
        em.persist(ta);
        return ta;
    }
    
    /*Metodo para actualizar un objeto de la tabla TipoAnimal*/
    public TipoAnimalEntity update(TipoAnimalEntity ta){
        return em.merge(ta);
    }
    
    /*Metodo para eliminar un objeto en la tabla TipoAnimal*/
    public void delete(long id){
        TipoAnimalEntity entity = em.find(TipoAnimalEntity.class, id);
        em.remove(entity);
    }
    
}
