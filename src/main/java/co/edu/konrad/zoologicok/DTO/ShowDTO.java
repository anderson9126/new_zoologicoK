/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.AnimalEntity;
import co.edu.konrad.zoologicok.entity.CalificacionEntity;
import co.edu.konrad.zoologicok.entity.EncargadoEntity;
import co.edu.konrad.zoologicok.entity.ProgramacionEntity;
import co.edu.konrad.zoologicok.entity.ShowEntity;
/**
 *
 * @author julian
 */
public class ShowDTO {
    private long idShow;
    private String nombreShow;
    private AnimalEntity animal;
    private EncargadoEntity encargado;
    private CalificacionEntity calificacion;
    private ProgramacionEntity programacion;
    
    public ShowDTO(){}
    
    public ShowDTO(ShowEntity show){
        this.animal = show.getAnimal();
        this.idShow = show.getIdShow();
        this.nombreShow = show.getNombreShow();
        this.encargado = show.getEncargado();
        this.calificacion = show.getCalificacion();
        this.programacion = show.getProgramacion();
    }
    
    public ShowEntity toEntity(){
        ShowEntity showEntity = new ShowEntity();
        showEntity.setIdShow(this.idShow);
        showEntity.setNombreShow(this.nombreShow);
        showEntity.setAnimal(this.animal);
        showEntity.setEncargado(this.encargado);
        showEntity.setCalificacion(this.calificacion);
        showEntity.setProgramacion(this.programacion);
        return showEntity;
    }

    public long getIdShow() {
        return idShow;
    }

    public void setIdShow(long idShow) {
        this.idShow = idShow;
    }

    public String getNombreShow() {
        return nombreShow;
    }

    public void setNombreShow(String nombreShow) {
        this.nombreShow = nombreShow;
    }

    public AnimalEntity getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalEntity animal) {
        this.animal = animal;
    }

    public EncargadoEntity getEncargado() {
        return encargado;
    }

    public void setEncargado(EncargadoEntity encargado) {
        this.encargado = encargado;
    }

    public CalificacionEntity getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(CalificacionEntity calificacion) {
        this.calificacion = calificacion;
    }

    public ProgramacionEntity getProgramacion() {
        return programacion;
    }

    public void setProgramacion(ProgramacionEntity programacion) {
        this.programacion = programacion;
    }
}