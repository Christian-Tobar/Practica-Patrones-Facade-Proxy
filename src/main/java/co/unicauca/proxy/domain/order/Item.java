
package co.unicauca.proxy.domain.order;

/**
 *
 * @author chris, carlos
 */
public class Item {
    /**
     * plato
     */
    private Dish dish;
    /**
     * cantidad
     */
    private int amount;
    
    /**
     * Constructor por defecto
     */
    public Item() {
    }
    
    /**
     * Constructor parametrizado
     * @param dish plato
     * @param amount cantidad
     */
    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }
    
    //Getters and Setters
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
