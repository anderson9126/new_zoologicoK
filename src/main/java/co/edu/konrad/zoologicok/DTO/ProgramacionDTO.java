/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.LugarEntity;
import co.edu.konrad.zoologicok.entity.ProgramacionEntity;
/**
 *
 * @author julian
 */
public class ProgramacionDTO {
    private long idProgramacion;
    private String horaInicio;
    private String horaFin;
    private String fechaShow;
    private LugarEntity lugar;
    
    public ProgramacionDTO(){}

    public ProgramacionDTO(ProgramacionEntity programacion) {
        this.idProgramacion = programacion.getIdProgramacion();
        this.horaInicio = programacion.getHoraInicio();
        this.horaFin = programacion.getHoraFin();
        this.fechaShow = programacion.getFechaShow();
        this.lugar = programacion.getIdLugar();
    }
    
    public ProgramacionEntity toEntity(){
        ProgramacionEntity programacionEntity = new ProgramacionEntity();
        programacionEntity.setIdProgramacion(this.idProgramacion);
        programacionEntity.setHoraInicio(this.horaInicio);
        programacionEntity.setHoraFin(this.horaFin);
        programacionEntity.setFechaShow(this.fechaShow);
        programacionEntity.setLugar(this.lugar);
        return programacionEntity;
    }

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

    public LugarEntity getLugar() {
        return lugar;
    }

    public void setLugar(LugarEntity lugar) {
        this.lugar = lugar;
    }
}