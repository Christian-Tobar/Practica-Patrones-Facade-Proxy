
package co.unicauca.proxy.domain.order;

/**
 *
 * @author chris, carlos
 */
public class Customer {
    /**
     * identificacion cliente
     */
    private int id;
    /**
     * nombre cliente
     */
    private String name;
    /**
     * direccion
     */
    private String address;
    /**
     * numero de celular
     */
    private String mobile;
    /**
     * ciudad
     */
    private String city;
    
    /**
     * constructor por defecto
     */
    public Customer() {
    }
    
    /**
     * constructor parametrizado
     * @param id identificacion
     * @param name nombre
     * @param address direccion
     * @param mobile celular
     * @param city ciudad
     */
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }  
    
    //Getters and Setters
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
