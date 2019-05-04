package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.ClienteEntity;
import co.edu.konrad.marketplace.entities.ProductoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-27T00:36:07")
@StaticMetamodel(CarritoEntity.class)
public class CarritoEntity_ { 

    public static volatile SingularAttribute<CarritoEntity, Long> idCarrito;
    public static volatile SingularAttribute<CarritoEntity, ClienteEntity> cliente;
    public static volatile SingularAttribute<CarritoEntity, Double> valorTotal;
    public static volatile SingularAttribute<CarritoEntity, ProductoEntity> producto;
    public static volatile SingularAttribute<CarritoEntity, Integer> cantidad;

}