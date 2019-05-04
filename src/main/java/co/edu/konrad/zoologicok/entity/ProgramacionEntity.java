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
public class ProgramacionEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_programacion")
    private long idProgramacion;
    
    @Column(name = "hora_inicio")
    private String horaInicio;
    
    @Column(name = "hora_fin")
    private String horaFin;
    
    @Column(name = "fecha_show")
    private String fechaShow;
    
    @ManyToOne
    @JoinColumn(name = "id_lugar")
    private LugarEntity lugar;
    
    public ProgramacionEntity(){}

    public long getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(long idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getFechaShow() {
        return fechaShow;
    }

    public void setFechaShow(String fechaShow) {
        this.fechaShow = fechaShow;
    }

    public LugarEntity getIdLugar() {
        return lugar;
    }

    public void setLugar(LugarEntity lugar) {
        this.lugar = lugar;
    }
}