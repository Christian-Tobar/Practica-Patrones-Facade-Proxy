package co.unicauca.proxy.domain.order;

import co.unicauca.proxy.acces.IOrderRepository;

/**
 *
 * @author Carlos, Christian
 */
public interface IOrderService {
    /**
     * Metodo que se debe implementar en la clases que implementen esta interfaz
     * @param repo 
     */
    public void save(IOrderRepository repo);

}
