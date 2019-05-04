package co.edu.konrad.zoologicok.entity;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-03T11:40:09")
@StaticMetamodel(EncargadoEntity.class)
public class EncargadoEntity_ { 

    public static volatile SingularAttribute<EncargadoEntity, String> nombreEncargado;
    public static volatile SingularAttribute<EncargadoEntity, Long> numeroCelular;
    public static volatile SingularAttribute<EncargadoEntity, Long> idEncargado;
    public static volatile SingularAttribute<EncargadoEntity, String> tipoIdentificacion;
    public static volatile SingularAttribute<EncargadoEntity, Calendar> fechaNacimiento;

}