package co.edu.konrad.zoologicok.entity;

import co.edu.konrad.zoologicok.entity.CalificacionEntity;
import co.edu.konrad.zoologicok.entity.CuidadorEntity;
import co.edu.konrad.zoologicok.entity.HorariosAlimentacionEntity;
import co.edu.konrad.zoologicok.entity.TipoAnimalEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T09:49:54")
@StaticMetamodel(AnimalEntity.class)
public class AnimalEntity_ { 

    public static volatile SingularAttribute<AnimalEntity, Long> idAnimal;
    public static volatile SingularAttribute<AnimalEntity, CalificacionEntity> calificacion;
    public static volatile SingularAttribute<AnimalEntity, CuidadorEntity> ciudador;
    public static volatile SingularAttribute<AnimalEntity, HorariosAlimentacionEntity> horaAlimentacion;
    public static volatile SingularAttribute<AnimalEntity, String> nombreAnimal;
    public static volatile SingularAttribute<AnimalEntity, TipoAnimalEntity> tipoAnimal;

}