/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.TipoAnimalEntity;

/**
 *
 * @author nelso
 */
public class TipoAnimalDTO {
    
    private long idTipoAnimal;
    private String nombreFamilia;
    private String nombreCategoria;
    
    public TipoAnimalDTO(){}
    
    public TipoAnimalDTO(TipoAnimalEntity tipoAnimal){
        this.idTipoAnimal = tipoAnimal.getIdTipoAnimal();
        this.nombreFamilia = tipoAnimal.getNombreFamilia();
        this.nombreCategoria = tipoAnimal.getNombreCategoria();
    }
    
    public TipoAnimalEntity toEntity(){
        TipoAnimalEntity tipoAnimalEntity = new TipoAnimalEntity();
        tipoAnimalEntity.setIdTipoAnimal(this.idTipoAnimal);
        tipoAnimalEntity.setNombreFamilia(this.nombreFamilia);
        tipoAnimalEntity.setNombreCategoria(this.nombreCategoria);
        return tipoAnimalEntity;
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
