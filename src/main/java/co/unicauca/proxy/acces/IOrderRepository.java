
package co.unicauca.proxy.acces;

import co.unicauca.proxy.domain.order.Order;

/**
 *
 * @author chris, carlos
 */
public interface IOrderRepository {
    /**
     * Metodo que se debe implementar en la clases que implementen esta interfaz
     * @param order 
     */
    public void createOrder(Order order);
    
}
