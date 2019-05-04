/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.ShowEntity;
import co.edu.konrad.zoologicok.persistence.ShowPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author julian
 */
@Stateless
public class ShowLogic {
    @Inject
    private ShowPersistence persistence;
    
    public List<ShowEntity> obtenerShows(){
        List<ShowEntity> shows = persistence.findAll();
        return shows;
    }
    
    public ShowEntity obtenerShowsPorId(long id){
        ShowEntity show = persistence.find(id);
        if(show == null){
            throw new IllegalArgumentException("El show solicitado no existe.");
        }
        return show;
    }
    
    public ShowEntity crearShow(ShowEntity entity){
        persistence.create(entity);
        return entity;
    }
    
    public ShowEntity actualizarShow(ShowEntity entity, long id){
        ShowEntity show = persistence.update(entity);
        return entity;
    }
    
    public void eliminarShow(long id){
        persistence.delete(id);
    }
}
