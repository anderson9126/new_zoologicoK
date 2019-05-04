/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.DTO;

import co.edu.konrad.zoologicok.entity.LugarEntity;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author julian
 */
public class LugarDTO {
    
    private long idLugar;
    private String nombreLugar;
    
    public LugarDTO(){}
    
    public LugarDTO(LugarEntity lugar){
        this.idLugar = lugar.getIdLugar();
        this.nombreLugar = lugar.getNombreLugar();
    }
    
    public LugarEntity toEntity(){
        LugarEntity lugarEntity = new LugarEntity();
        lugarEntity.setIdLugar(this.idLugar);
        lugarEntity.setNombreLugar(this.nombreLugar);
        return lugarEntity;
    }

    public long getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(long idLugar) {
        this.idLugar = idLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }
    public static List<LugarDTO> toLugarList(List<LugarEntity> entities){
        List<LugarDTO> lugares = new ArrayList<>();
        for(LugarEntity entity : entities){
            lugares.add(new LugarDTO(entity));
        }
        return lugares;
    }
    
}