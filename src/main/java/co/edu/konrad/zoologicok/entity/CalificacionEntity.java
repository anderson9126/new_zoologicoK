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
 * creacion tabla calificacion 
 * @author anderson s
 */
@ Entity 
public class CalificacionEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_clacificacion")
    private long idCalificacion;
    
    @Column (name="valor_calificacion")
    private long valorCalificacion;
    
    @Column (name="observacion")
    private String observacion;

    public CalificacionEntity() {
    }

    public long getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public long getValorCalificacion() {
        return valorCalificacion;
    }

    public void setValorCalificacion(long valorCalificacion) {
        this.valorCalificacion = valorCalificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}