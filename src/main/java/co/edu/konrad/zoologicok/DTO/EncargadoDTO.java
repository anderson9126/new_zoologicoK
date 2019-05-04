/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.EncargadoEntity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ander
 */
public class EncargadoDTO {
    
    private long idEncargado;
    private String nombreEncargado;
    private String tipoIdentificacion;
    private Calendar fechaNacimiento;
    private long numeroCelular;
    
    public EncargadoDTO() {
    }
    
    public EncargadoDTO (EncargadoEntity encargado){
     this.idEncargado = encargado.getIdEncargado();
     this.nombreEncargado= encargado.getNombreEncargado();
     this.tipoIdentificacion=encargado.getTipoIdentificacion();
     this.fechaNacimiento = encargado.getFechaNacimiento();
     this.numeroCelular= encargado.getNumeroCelular();
    }
    
    public EncargadoEntity toEntity() {
        EncargadoEntity encargadoEntity = new EncargadoEntity();
        encargadoEntity.setIdEncargado(this.idEncargado);
        encargadoEntity.setNombreEncargado(this.nombreEncargado);
        encargadoEntity.setTipoIdentificacion(this.tipoIdentificacion);
        encargadoEntity.setFechaNacimiento(this.fechaNacimiento);
        encargadoEntity.setNumeroCelular(this.numeroCelular);
        return encargadoEntity;
    }
    
    // nuevo array 
    public static List<EncargadoDTO> toEncargadoList(List<EncargadoEntity> encargadoList){
    List<EncargadoDTO> listaEncargado = new ArrayList<>();
        for (int i = 0; i < encargadoList.size(); i++) {
            listaEncargado.add(new EncargadoDTO( encargadoList.get(i)));
        }
        return listaEncargado;
    }

    public long getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(long idEncargado) {
        this.idEncargado = idEncargado;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    
    
}
