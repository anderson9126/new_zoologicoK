package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.CarritoEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-27T00:36:07")
@StaticMetamodel(FacturaEntity.class)
public class FacturaEntity_ { 

    public static volatile SingularAttribute<FacturaEntity, Date> fecha;
    public static volatile SingularAttribute<FacturaEntity, Integer> totalFactura;
    public static volatile SingularAttribute<FacturaEntity, Long> idFactura;
    public static volatile SingularAttribute<FacturaEntity, CarritoEntity> carrito;
    public static volatile SingularAttribute<FacturaEntity, String> medioPago;

}