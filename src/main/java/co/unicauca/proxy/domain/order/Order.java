
package co.unicauca.proxy.domain.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris, carlos
 */
public class Order {
    /**
     * envio
     */
    public int despatch; 
    /**
     * cliente
     */
    private Customer customer;
    /**
     * fecha
     */
    private LocalDate date;
    /**
     * estado
     */
    private State state;
    /**
     * detalles de la orden
     */
    private List<Item> details;
    
    /**
     * Constructor parametrizado
     * @param customer cliente
     */
    public Order(Customer customer) {
        this.customer = customer;  
        this.details = new ArrayList<Item>();
    }
    
    /**
     * Adicionar un plato
     * @param dish plato
     * @param amount cantidad
     */
    public void addDish(Dish dish, int amount){
        this.details.add(new Item(dish, amount));
    }
    
    //Getters and Setter
    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Item> getDetails() {
        return details;
    }

    public void setDetails(List<Item> details) {
        this.details = details;
    }
    
    /**
     * Calcular total de la orden
     * @return 
     */
    public int calcularTotal() {
        int acum = 0;
        
        for(int i=0; i<details.size();i++){
            acum = acum + details.get(i).getDish().getPrice() * details.get(i).getAmount();
        }
        
        return acum;
    }   
}
