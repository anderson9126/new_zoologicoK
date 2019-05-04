/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.persistence;

import co.edu.konrad.zoologicok.entity.AnimalEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nelson
 */

@Stateless
public class AnimalPersistence {
    
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;
    
    public List<AnimalEntity> findAll(){
        Query q = em.createQuery("select a from AnimalEntity a");
        return q.getResultList();
    }
    
    public AnimalEntity find(long id){
        return em.find(AnimalEntity.class, id);
    }
    
    public AnimalEntity create(AnimalEntity animal){
        em.persist(animal);
        return animal;
    }
    
    public AnimalEntity update(AnimalEntity animal){
        return em.merge(animal);
    }
    
    public void delete(long id){
        AnimalEntity entity = em.find(AnimalEntity.class, id);
        em.remove(entity);
    }   
}