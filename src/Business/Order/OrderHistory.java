/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Card.Card;
import Business.Customer.Customer;
import Business.Product.Product;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ashis
 */
public class OrderHistory {
    
    private ArrayList<Order> orderHistory;
    private Customer customer;

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    public void addOrderList(ArrayList<Order> orderList) {
        if(this.orderHistory == null)
            this.orderHistory = new ArrayList<Order>();
        this.orderHistory.addAll(orderList);
    }

    public Order newOrder(String orderNumber, Product product, int quantity, Customer customer, String purchaseDate, Card paymentMethod) {
        Order shopping = new Order(orderNumber, product, quantity, customer, purchaseDate, paymentMethod);
        orderHistory.add(shopping);
        return shopping;
    }
    
    public void removeOrder(Order shopping){
        orderHistory.remove(shopping);
    }
        
}
