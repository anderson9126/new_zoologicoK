/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.HorariosAlimentacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class HorariosAlimentacionDTO {

    private long idHoraAlimentacion;
    private String horaPrimeraComida;
    private String horaSegundaComida;
    private String horaTercerComida;

    public HorariosAlimentacionDTO() {
    }

    public HorariosAlimentacionDTO(HorariosAlimentacionEntity horarioasalim) {
        this.idHoraAlimentacion = horarioasalim.getIdHoraAlimentacion();
        this.horaPrimeraComida = horarioasalim.getHoraPrimeraComida();
        this.horaSegundaComida = horarioasalim.getHoraSegundaComida();
        this.horaTercerComida = horarioasalim.getHoraTercerComida();
    }

    public HorariosAlimentacionEntity toEntity() {
        HorariosAlimentacionEntity horariosAlimentacionEntity = new HorariosAlimentacionEntity();
        horariosAlimentacionEntity.setIdHoraAlimentacion(this.idHoraAlimentacion);
        horariosAlimentacionEntity.setHoraPrimeraComida(this.horaPrimeraComida);
        horariosAlimentacionEntity.setHoraSegundaComida(this.horaSegundaComida);
        horariosAlimentacionEntity.setHoraTercerComida(this.horaTercerComida);
        return horariosAlimentacionEntity;
    }
    //nueva lista 
     public static  List<HorariosAlimentacionDTO> toHorarioAlimentacionList (List<HorariosAlimentacionEntity> horarioAlimentacionList ){
     List<HorariosAlimentacionDTO> listahorarioAlimentacion= new ArrayList<>();
     for (int i= 0; i< horarioAlimentacionList.size();i++){
      listahorarioAlimentacion.add(new HorariosAlimentacionDTO(horarioAlimentacionList.get(i)));
     }
          return listahorarioAlimentacion;
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
