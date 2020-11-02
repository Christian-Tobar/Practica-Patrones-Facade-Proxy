package co.unicauca.proxy.domain.order;

import co.unicauca.proxy.acces.IOrderRepository;
import java.lang.System.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Carlos, Christian
 */
public class OrderServiceLogger implements IOrderService {
    
    private OrderFacade orderFacade;
    
    /**
     * Constructor parametrizado
     * @param orderFacade orden fachada
     */
    public OrderServiceLogger(OrderFacade orderFacade) {

        this.orderFacade = orderFacade;
    }
    
    /**
     * Implementacion particular del metodo abstracto IOrderService
     * @param repo repositorio
     */
    @Override
    public void save(IOrderRepository repo) {
        
        org.slf4j.Logger logger = LoggerFactory.getLogger(OrderServiceLogger.class);
        
        repo.createOrder(orderFacade.getOrder());
        
        String messaje = "Pedido guardado en la base de datos";
        logger.info("Pedido guardado en la base de datos");  
    }
}
