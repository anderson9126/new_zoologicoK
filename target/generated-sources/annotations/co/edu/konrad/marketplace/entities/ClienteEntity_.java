package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.TipoDocumentoEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-27T00:36:07")
@StaticMetamodel(ClienteEntity.class)
public class ClienteEntity_ { 

    public static volatile SingularAttribute<ClienteEntity, TipoDocumentoEntity> tipoDocumento;
    public static volatile SingularAttribute<ClienteEntity, Date> fechaNacimentoCliente;
    public static volatile SingularAttribute<ClienteEntity, Long> idCliente;
    public static volatile SingularAttribute<ClienteEntity, String> nombreCliente;
    public static volatile SingularAttribute<ClienteEntity, String> apellidoCliente;
    public static volatile SingularAttribute<ClienteEntity, Long> numeroDocumento;

}