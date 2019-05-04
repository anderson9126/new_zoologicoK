/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.persistence;

import co.edu.konrad.zoologicok.entity.HorariosAlimentacionEntity;
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
public class HorariosAlimentacionPersistence {
    
    
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;

    public List<HorariosAlimentacionEntity> findAll() {
        Query q = em.createQuery("select ha from HorariosAlimentacionEntity ha");
        return q.getResultList();
    }

    public HorariosAlimentacionEntity find(long idHoraAlimentacion) {
        return em.find(HorariosAlimentacionEntity.class, idHoraAlimentacion);
    }

    public HorariosAlimentacionEntity create(HorariosAlimentacionEntity ha) {
        em.persist(ha);
        return ha;
    }

    public HorariosAlimentacionEntity update(HorariosAlimentacionEntity ha) {
        return em.merge(ha);
    }

    public void delete(long idHoraAlimentacion) {
        HorariosAlimentacionEntity entiti = em.find(HorariosAlimentacionEntity.class, idHoraAlimentacion);
        em.remove(entiti);
    }
}