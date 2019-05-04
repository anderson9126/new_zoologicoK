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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author julian
 */

@Entity
public class ShowEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_show")
    private long idShow;
    
    @Column(name = "nombre_show")
    private String nombreShow;
    
    @ManyToOne
    @JoinColumn(name = "id_animal")
    private AnimalEntity animal;
    
    @ManyToOne
    @JoinColumn(name = "id_encargado")
    private EncargadoEntity encargado;
    
    @ManyToOne
    @JoinColumn(name = "id_calificacion")
    private CalificacionEntity calificacion;
    
    @ManyToOne
    @JoinColumn(name = "id_programacion")
    private ProgramacionEntity progamacion;
    
    public ShowEntity(){}

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

    public ProgramacionEntity getProgramacion() {
        return progamacion;
    }

    public void setProgramacion(ProgramacionEntity progamacion) {
        this.progamacion = progamacion;
    }

    public CalificacionEntity getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(CalificacionEntity calificacion) {
        this.calificacion = calificacion;
    }
    
    
}