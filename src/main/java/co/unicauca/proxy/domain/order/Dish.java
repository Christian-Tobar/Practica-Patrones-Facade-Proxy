
package co.unicauca.proxy.domain.order;

import co.unicauca.proxy.acces.IOrderRepository;

/**
 *
 * @author chris, carlos
 */
public class Dish {
    /**
     * identificacion del plato
     */
    private int id;
    /**
     * nombre del plato
     */
    private String name;
    /**
     * precio del plato
     */
    private int price;

    /**
     * contructor por defecto
     */
    public Dish() {
    }
    
    /**
     * Constructor parametrizado
     * @param id identificacion
     * @param name nombre
     * @param price precio
     */
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    //Getters and Sttters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }  
      
}
