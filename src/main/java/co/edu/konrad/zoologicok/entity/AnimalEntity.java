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
import javax.persistence.OneToOne;

/**
 *
 * @author julian
 */
@Entity
public class AnimalEntity implements Serializable{
    //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_animal")
    private long idAnimal;
    
    //
    @Column(name = "nombre_animal")
    private String nombreAnimal;
    
    //
    @ManyToOne
    @JoinColumn(name = "id_cuidador")
    private CuidadorEntity ciudador;
    
    //
    @ManyToOne
    @JoinColumn(name = "id_calificacion")
    private CalificacionEntity calificacion;
    
    //
    @OneToOne
    @JoinColumn(name = "id_tipo_animal")
    private TipoAnimalEntity tipoAnimal;
    
    //
    @OneToOne
    @JoinColumn(name = "id_hora_alimentacion")
    private HorariosAlimentacionEntity horaAlimentacion;
    
    public AnimalEntity(){}

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

    public CuidadorEntity getIdCiudador() {
        return ciudador;
    }

    public void setIdCiudador(CuidadorEntity ciudador) {
        this.ciudador = ciudador;
    }

    public CalificacionEntity getIdCalificacion() {
        return calificacion;
    }

    public void setIdCalificacion(CalificacionEntity calificacion) {
        this.calificacion = calificacion;
    }

    public TipoAnimalEntity getIdTipoAnimal() {
        return tipoAnimal;
    }

    public void setIdTipoAnimal(TipoAnimalEntity tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public HorariosAlimentacionEntity getIdHoraAlimentacion() {
        return horaAlimentacion;
    }

    public void setIdHoraAlimentacion(HorariosAlimentacionEntity horaAlimentacion) {
        this.horaAlimentacion = horaAlimentacion;
    }
}
