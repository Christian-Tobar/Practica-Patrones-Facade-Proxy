
package co.unicauca.proxy.domain.order;

import co.unicauca.proxy.acces.Factory;
import co.unicauca.proxy.acces.IOrderRepository;

/**
 *
 * @author chris, carlos
 */
public class ProxyClient {

    private IOrderService orderService;

    /**
     * Constructor parametrizado
     * @param orderService instancia de una clase que implementa a IOrderService
     */
    public ProxyClient(IOrderService orderService) {
        
        this.orderService = orderService;
    }
    
    /**
     * Metodo que crea una orden
     */
    public void createOrder(){
        
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        
        orderService.save(repo);
    }  
}
