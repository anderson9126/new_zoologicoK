/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.LugarEntity;
import co.edu.konrad.zoologicok.persistence.LugarPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
/**
 *
 * @author julian
 */
@Stateless
public class LugarLogic {
    
    @Inject
    private LugarPersistence persistence;
    
    public List<LugarEntity> obtenerLugares(){
        List<LugarEntity> lugares = persistence.findAll();
        return lugares;
    }
    
    public LugarEntity obtenerLugaresPorId(long id){
        LugarEntity lugar = persistence.find(id);
        if(lugar == null){
            throw new IllegalArgumentException("El lugar solicitado no existe.");
        }
        return lugar;
    }
    
    public LugarEntity crearLugar(LugarEntity entity){
        persistence.create(entity);
        return entity;
    }
    
    public LugarEntity actualizarLugar(LugarEntity entity, long id){
        LugarEntity lugar = persistence.update(entity);
        return entity;
    }
    
    public void eliminarLugar(long id){
        persistence.delete(id);
    }
}