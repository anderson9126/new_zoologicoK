/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.CuidadorEntity;
import java.util.Date;

/**
 *
 * @author nelson
 */
public class CuidadorDTO {
    
    private long idCiudador;
    private String nombreCuidador;
    private String tipoIdentificacion;
    private Date fechaNacimiento;
    private long numeroCelular;
    
    public CuidadorDTO(){}
    
    public CuidadorDTO(CuidadorEntity cuidador){
        this.idCiudador = cuidador.getIdCiudador();
        this.nombreCuidador = cuidador.getNombreCuidador();
        this.tipoIdentificacion = cuidador.getTipoIdentificacion();
        this.fechaNacimiento = cuidador.getFechaNacimiento();
        this.numeroCelular = cuidador.getNumeroCelular();
    }
    
    public CuidadorEntity toEntity(){
        CuidadorEntity cuidadorEntity = new CuidadorEntity();
        cuidadorEntity.setIdCiudador(this.idCiudador);
        cuidadorEntity.setNombreCuidador(this.nombreCuidador);
        cuidadorEntity.setTipoIdentificacion(this.tipoIdentificacion);
        cuidadorEntity.setFechaNacimiento(this.fechaNacimiento);
        cuidadorEntity.setNumeroCelular(this.numeroCelular);
        return cuidadorEntity;
    }

    public long getIdCiudador() {
        return idCiudador;
    }

    public void setIdCiudador(long idCiudador) {
        this.idCiudador = idCiudador;
    }

    public String getNombreCuidador() {
        return nombreCuidador;
    }

    public void setNombreCuidador(String nombreCuidador) {
        this.nombreCuidador = nombreCuidador;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    
    
    
}
