package co.edu.konrad.zoologicok.entity;

import co.edu.konrad.zoologicok.entity.LugarEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-03T11:40:09")
@StaticMetamodel(ProgramacionEntity.class)
public class ProgramacionEntity_ { 

    public static volatile SingularAttribute<ProgramacionEntity, String> horaFin;
    public static volatile SingularAttribute<ProgramacionEntity, String> fechaShow;
    public static volatile SingularAttribute<ProgramacionEntity, Long> idProgramacion;
    public static volatile SingularAttribute<ProgramacionEntity, LugarEntity> lugar;
    public static volatile SingularAttribute<ProgramacionEntity, String> horaInicio;

}