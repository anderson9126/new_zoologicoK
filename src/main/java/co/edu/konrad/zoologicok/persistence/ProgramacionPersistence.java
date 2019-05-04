/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.persistence;

import co.edu.konrad.zoologicok.entity.ProgramacionEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 *
 * @author julian
 */

@Stateless
public class ProgramacionPersistence {
    @PersistenceContext(unitName="MarketPlacePU")
    protected EntityManager em;
    
    public List<ProgramacionEntity> findAll(){
        Query q = em.createQuery("select a from ProgramacionEntity a");
        return q.getResultList();
    }
    
    public ProgramacionEntity find(long id){
        return em.find(ProgramacionEntity.class, id);
    }
    
    public ProgramacionEntity create(ProgramacionEntity programacion){
        em.persist(programacion);
        return programacion;
    }
    
    public ProgramacionEntity update(ProgramacionEntity programacion){
        return em.merge(programacion);
    }
    
    public void delete(long id){
        ProgramacionEntity entity = em.find(ProgramacionEntity.class, id);
        em.remove(entity);
    }
}
