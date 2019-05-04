/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.AnimalEntity;
import co.edu.konrad.zoologicok.entity.CalificacionEntity;
import co.edu.konrad.zoologicok.entity.CuidadorEntity;
import co.edu.konrad.zoologicok.entity.HorariosAlimentacionEntity;
import co.edu.konrad.zoologicok.entity.TipoAnimalEntity;

/**
 *
 * @author nelso
 */
public class AnimalDTO {
    
    private long idAnimal;
    private String nombreAnimal;
    private CuidadorEntity ciudador;
    private CalificacionEntity calificacion;
    private TipoAnimalEntity tipoAnimal;
    private HorariosAlimentacionEntity horaAlimentacion;
    
    public AnimalDTO(){}
    
    public AnimalDTO(AnimalEntity animal){
        this.idAnimal = animal.getIdAnimal();
        this.nombreAnimal = animal.getNombreAnimal();
        this.ciudador = animal.getIdCiudador();
        this.calificacion = animal.getIdCalificacion();
        this.tipoAnimal = animal.getIdTipoAnimal();
        this.horaAlimentacion = animal.getIdHoraAlimentacion();
    }
    
    public AnimalEntity toEntity(){
        AnimalEntity animalEntity = new AnimalEntity();
        animalEntity.setIdAnimal(this.idAnimal);
        animalEntity.setNombreAnimal(this.nombreAnimal);
        animalEntity.setIdCiudador(this.ciudador);
        animalEntity.setIdCalificacion(this.calificacion);
        animalEntity.setIdTipoAnimal(this.tipoAnimal);
        animalEntity.setIdHoraAlimentacion(this.horaAlimentacion);
        return animalEntity;
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public CuidadorEntity getCiudador() {
        return ciudador;
    }

    public void setCiudador(CuidadorEntity ciudador) {
        this.ciudador = ciudador;
    }

    public CalificacionEntity getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(CalificacionEntity calificacion) {
        this.calificacion = calificacion;
    }

    public TipoAnimalEntity getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimalEntity tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public HorariosAlimentacionEntity getHoraAlimentacion() {
        return horaAlimentacion;
    }

    public void setHoraAlimentacion(HorariosAlimentacionEntity horaAlimentacion) {
        this.horaAlimentacion = horaAlimentacion;
    }
}