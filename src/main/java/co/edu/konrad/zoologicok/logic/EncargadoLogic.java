/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.logic;

import co.edu.konrad.zoologicok.entity.EncargadoEntity;
import co.edu.konrad.zoologicok.persistence.EncargadoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author ander
 */
@Stateless
public class EncargadoLogic {

    @Inject
    private EncargadoPersistence persistence;

    public List<EncargadoEntity> ontenerEncargado() {
        List<EncargadoEntity> encargado = persistence.findAll();
        return encargado;
    }

    public EncargadoEntity obtenerEncargadoporId(long id) {
        EncargadoEntity encargado = persistence.find(id);
        if (encargado == null) {
            throw new IllegalArgumentException("el encargado solicitado no exixte");
        }
        return encargado;
    }

    public EncargadoEntity crearEncargado(EncargadoEntity entity) {
        persistence.create(entity);
        return entity;
    }

    public EncargadoEntity atualizarEncargado(EncargadoEntity entity, long id) {
        EncargadoEntity encargado = persistence.update(entity);
        return encargado;
    }

    public void eliminarEncargado(long id) {
        persistence.delete(id);
    }

}
