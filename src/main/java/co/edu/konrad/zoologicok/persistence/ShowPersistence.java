/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.persistence;

import co.edu.konrad.zoologicok.entity.ShowEntity;
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
public class ShowPersistence {
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;
    
    public List<ShowEntity> findAll(){
        Query q = em.createQuery("select a from ShowEntity a");
        return q.getResultList();
    }
    
    public ShowEntity find(long id){
        return em.find(ShowEntity.class, id);
    }
    
    public ShowEntity create(ShowEntity show){
        em.persist(show);
        return show;
    }
    
    public ShowEntity update(ShowEntity show){
        return em.merge(show);
    }
    
    public void delete(long id){
        ShowEntity entity = em.find(ShowEntity.class, id);
        em.remove(entity);
    }
}
