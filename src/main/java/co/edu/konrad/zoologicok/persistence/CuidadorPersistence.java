/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.persistence;

import co.edu.konrad.zoologicok.entity.CuidadorEntity;
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
public class CuidadorPersistence {
    
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;
    
    public List<CuidadorEntity> findAll(){
        Query q = em.createQuery("select cui from CuidadorEntity cui");
        return q.getResultList();
    }
    
    /*Metodo para buscar un objeto en la tabla Ciudador*/
    public CuidadorEntity find(long id){
        return em.find(CuidadorEntity.class, id);
    }
    
    /*Metodo para insercion de un objeto en la tabla Ciudador*/
    public CuidadorEntity create(CuidadorEntity cui){
        em.persist(cui);
        return cui;
    }
    
    /*Metodo para actualizar un objeto de la tabla Ciudador*/
    public CuidadorEntity update(CuidadorEntity cui){
        return em.merge(cui);
    }
    
    /*Metodo para eliminar un objeto en la tabla Ciudador*/
    public void delete(long id){
        CuidadorEntity entity = em.find(CuidadorEntity.class, id);
        em.remove(entity);
    }
    
}
