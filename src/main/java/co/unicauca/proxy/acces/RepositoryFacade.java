/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.proxy.acces;

import co.unicauca.proxy.domain.order.Order;

/**
 *
 * @author chris, carlos
 */
public class RepositoryFacade implements IOrderRepository{
    /**
     * implemenatacion particular de los metodos IOrderRepository
     * @param order 
     */
    @Override
    public void createOrder(Order order) {
        System.out.println("******* LA ORDEN FUE CREADA *******");
    } 
}
