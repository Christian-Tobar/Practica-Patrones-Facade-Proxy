
package co.unicauca.proxy.domain.order;

import co.unicauca.proxy.acces.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author chris, carlos
 */
public class OrderFacade implements IOrderService{
    /**
     * Clase que actua de fachada para el proceso de realizar una orden
     */
    public Order order;
    
    /**
     * Constructor por defecto
     */
    public OrderFacade() {
    }
    
    /**
     * Metodo que crea una orden
     * @param customer cliente
     */
    public void createOrder(Customer customer) {
        this.order = new Order(customer);
        changeState(State.NEW);
    }
    
    /**
     * Metodo que agrega platos a la orden 
     * @param dish plato
     * @param amount cantidad
     */
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }
    
    /**
     * Metodo de calcular el total del pedido
     * @return Costo total
     */
    public int calculateTotal(){
        return order.calcularTotal();
    }
    
    //Getter and Setters
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void changeState(State state) {
        order.setState(state);
    }
    
    public void cancelOrder(){
        order.setState(State.CANCELED);
    }

    public int totalDishes() {
        return order.getDetails().size();
    }
    
    /**
     * Metodo que guarda en un pedido en la base de datos
     * @param repo repositorio
     */
    public void save(IOrderRepository repo){
        
         org.slf4j.Logger logger = LoggerFactory.getLogger(OrderFacade.class);
        
         repo.createOrder(order);
        
         String messaje = "Pedido guardado en la base de datos";
         logger.info("Pedido guardado en la base de datos");
    }
    
}
