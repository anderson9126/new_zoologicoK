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
 *
 * @author anderson S
 */
@Entity
public class HorariosAlimentacionEntity implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id_hora_alimentacion")
    private long idHoraAlimentacion;
    
    @Column(name="hora_primera_comida")
    private String horaPrimeraComida;
    
    @Column(name="hora_segunda_comida")
    private String horaSegundaComida;
    
    @Column(name="hora_tercera_comida")
    private String horaTercerComida;

    public HorariosAlimentacionEntity() {
    }

    public long getIdHoraAlimentacion() {
        return idHoraAlimentacion;
    }

    public void setIdHoraAlimentacion(long idHoraAlimentacion) {
        this.idHoraAlimentacion = idHoraAlimentacion;
    }

    public String getHoraPrimeraComida() {
        return horaPrimeraComida;
    }

    public void setHoraPrimeraComida(String horaPrimeraComida) {
        this.horaPrimeraComida = horaPrimeraComida;
    }

    public String getHoraSegundaComida() {
        return horaSegundaComida;
    }

    public void setHoraSegundaComida(String horaSegundaComida) {
        this.horaSegundaComida = horaSegundaComida;
    }

    public String getHoraTercerComida() {
        return horaTercerComida;
    }

    public void setHoraTercerComida(String horaTercerComida) {
        this.horaTercerComida = horaTercerComida;
    }
}