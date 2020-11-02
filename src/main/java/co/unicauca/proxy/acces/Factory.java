
package co.unicauca.proxy.acces;

import co.unicauca.proxy.acces.IOrderRepository;
import co.unicauca.proxy.domain.order.Dish;
import co.unicauca.proxy.domain.order.OrderFacade;

/**
 *
 * @author chris, carlos
 */
public class Factory {
    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IPlateAcces
     *
     * @return una clase hija de la abstracción IPlateAcces
     */
    public IOrderRepository getRepository(String type) {

        IOrderRepository result = null;;
                
        switch (type) {
            case "default":
                result = new RepositoryFacade();
                break;
        }

        return result;

    }
}
