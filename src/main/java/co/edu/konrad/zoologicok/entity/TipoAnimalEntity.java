/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Creacion de la tabla Tipo Animal
 * @author Nelson Fonseca
 */
@Entity
public class TipoAnimalEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_animal")
    private long idTipoAnimal;
    
    @Column(name = "nombre_familia")
    private String nombreFamilia;
    
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
    
    public TipoAnimalEntity(){
        
    }

    public long getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public void setIdTipoAnimal(long idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}