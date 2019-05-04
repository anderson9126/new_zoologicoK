package co.edu.konrad.zoologicok.entity;

import co.edu.konrad.zoologicok.entity.AnimalEntity;
import co.edu.konrad.zoologicok.entity.CalificacionEntity;
import co.edu.konrad.zoologicok.entity.EncargadoEntity;
import co.edu.konrad.zoologicok.entity.ProgramacionEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-03T23:49:23")
@StaticMetamodel(ShowEntity.class)
public class ShowEntity_ { 

    public static volatile SingularAttribute<ShowEntity, CalificacionEntity> calificacion;
    public static volatile SingularAttribute<ShowEntity, EncargadoEntity> encargado;
    public static volatile SingularAttribute<ShowEntity, AnimalEntity> animal;
    public static volatile SingularAttribute<ShowEntity, ProgramacionEntity> progamacion;
    public static volatile SingularAttribute<ShowEntity, String> nombreShow;
    public static volatile SingularAttribute<ShowEntity, Long> idShow;

}