/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.persistence;

import co.edu.konrad.zoologicok.entity.EncargadoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la tabla Encargado
 *
 * @author anderson S
 */
@Stateless
public class EncargadoPersistence {
    
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;
    
    public List<EncargadoEntity> findAll() {
        Query q = em.createQuery("select e from EncargadoEntity e");
        return q.getResultList();
    }
    
    public EncargadoEntity find(long idEncargado) {
        return em.find(EncargadoEntity.class, idEncargado);
    }
    
    public EncargadoEntity create (EncargadoEntity e){
        em.persist(e);
        return e;
    }
    
    public EncargadoEntity update ( EncargadoEntity e){
        return em.merge(e);
    }
    
    public void delete (long idencargado){
    EncargadoEntity entity = em.find(EncargadoEntity.class, idencargado);
    em.remove(entity);
    }
   
    
}
