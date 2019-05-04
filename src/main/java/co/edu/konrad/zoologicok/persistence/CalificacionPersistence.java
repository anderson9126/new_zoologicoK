/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.persistence;

import co.edu.konrad.zoologicok.entity.CalificacionEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author anderson S
 */
@Stateless
public class CalificacionPersistence {
  
    
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;

    public List<CalificacionEntity> findAll() {
        Query q = em.createQuery("select ca from CalificacionEntity ca");
        return q.getResultList();
    }

    public CalificacionEntity find(long idCalificacion) {
        return em.find(CalificacionEntity.class, idCalificacion);
    }

    public CalificacionEntity create(CalificacionEntity ca) {
        em.persist(ca);
        return ca;
    }

    public CalificacionEntity update(CalificacionEntity ca) {
        return em.merge(ca);
    }

    public void delete(long idCalificacion) {
        CalificacionEntity entiti = em.find(CalificacionEntity.class,idCalificacion);
        em.remove(entiti);
    }
    
    
}
